(function () {
    self.Board = function (width, height) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.game_over = false;
        this.bars = [];
        this.ball = null;
        this.playing = false;
    }
    self.Board.prototype = {
        get elements() {
            var elements = this.bars.map(function (bar) { return bar; });
            elements.push(this.ball);
            return elements
        }
    }
})();

(function () {
    self.Ball = function (x, y, radius, board) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed_y = 0;
        this.speed_x = 3;
        this.board = board;
        this.direction = 1;

        this.board.ball = this;
        this.kind = "circle";
    }

    self.Ball.prototype = {
        move: function () {
            this.x += (this.speed_x * this.direction);
            this.y += (this.speed_y);
        },
        get width(){
            return this.radius * 2;
        },
        get height(){
            return this.radius * 2;
        }
    }
})();


(function () {
    self.Bar = function (x, y, width, height, board) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.board = board;
        this.board.bars.push(this);
        this.kind = "rectangle";
        this.speed = 10;
    }

    self.Bar.prototype = {
        down: function () {
            this.y += this.speed;

        },
        up: function () {
            this.y -= this.speed;
        },
        toString: function () {
            return "x: " + this.x + " y: " + this.y;
        }
    }
})();

(function () {
    self.BoardView = function (canvas, board) {
        this.canvas = canvas;
        this.canvas.width = board.width;
        this.canvas.height = board.height;
        this.board = board;
        this.ctx = canvas.getContext("2d");
    }

    self.BoardView.prototype = {
        clean: function () {
            this.ctx.clearRect(0, 0, this.board.width, this.board.height);
        },

        draw: function () {
            for (let i = this.board.elements.length - 1; i >= 0; i--) {
                let element = this.board.elements[i]
                draw(this.ctx, element)
            };
        },
        check_collisions: function () {
            for (let i = this.board.bars.length - 1; i >= 0; i--) {
                let bar = this.board.bars[i];
                if (hit(bar, this.board.ball)) {
                    this.board.ball.collision(bar);
                }
            }
        },
        play: function () {
            if (this.board.playing) {
                this.clean();
                this.draw();
                this.check_collisions();
                this.board.ball.move();
            }
        }
    }

    function hit(a, b) {
        //Revisa si a colisiona con b
        let hit = false;
        //colisiones horizontales
        if (b.x + b.width >= a.x && b.x < a.x + a.width) {
            //colisiones verticales
            if (b.y + b.height >= a.y && b.y < a.y + a.height) {
                hit = true;
            }
        }
        //colision de a con b
        if (b.x <= a.x && b.x + b.width >= a.x + a.width) {
            if (b.y <= a.y && b.y + b.height >= a.y + a.height) {
                hit = true;
            }
        }
        //colision de b con a
        if (a.x <= b.x && a.x + a.width >= b.x + b.width) {
            if (a.y <= b.y && a.y + a.height >= b.y + b.height) {
                hit = true;
            }
        }
        return hit
    }

    function draw(ctx, element) {
        switch (element.kind) {
            case "rectangle":
                ctx.fillRect(element.x, element.y, element.width, element.height);
                break;
            case "circle":
                ctx.beginPath();
                ctx.arc(element.x, element.y, element.radius, 0, 7);
                ctx.fill();
                ctx.closePath();
                break;
        }
    }
})();

let board = new Board(800, 400);
let bar1 = new Bar(20, 100, 40, 100, board);
let bar2 = new Bar(735, 100, 40, 100, board);
let canvas = document.getElementById('canvas');
let board_view = new BoardView(canvas, board);
let ball = new Ball(350, 100, 10, board)

document.addEventListener("keydown", function (ev) {
    console.log(ev.code);
    if (ev.code === "ArrowUp") {
        ev.preventDefault();
        bar1.up();
    }
    else if (ev.code === "ArrowDown") {
        ev.preventDefault();
        bar1.down();
    }
    else if (ev.code === "KeyS") {
        ev.preventDefault();
        bar2.down();
    }
    else if (ev.code === "KeyW") {
        ev.preventDefault();
        bar2.up();
    }
    else if (ev.code === "Space") {
        ev.preventDefault();
        board.playing = !board.playing;
    }
    console.log("bar2 " + bar2.toString());
    console.log("bar1 " + bar1.toString());
});

board_view.draw();
window.requestAnimationFrame(controller);
function controller() {
    board_view.play();
    window.requestAnimationFrame(controller);
}