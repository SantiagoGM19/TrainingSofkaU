package com.sofkau.EjerciciosPropuestos.Ejercicio18;

import java.util.Arrays;

public class Ejecutable {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        VideoJuego[] videoJuegos = new VideoJuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Rick y Morty", "Justin Roiland");
        series[2] = new Serie("Lupin","George Kay");
        series[3] = new Serie("Peaky Blinders", 5, "accion", "Steven Knight");
        series[4] = new Serie("Breaking Bad", "George Vincent Gilligan");

        videoJuegos[0] = new VideoJuego();
        videoJuegos[1] = new VideoJuego();
        videoJuegos[2] = new VideoJuego("DarkSiders", 14);
        videoJuegos[3] = new VideoJuego("Grand Theft Auto V", 32);
        videoJuegos[4] = new VideoJuego("DOOM Eternal", 18,"Disparos en primera persona", "Bethesda");

        videoJuegos[2].entregar();
        videoJuegos[4].entregar();
        series[0].entregar();
        series[1].entregar();


        System.out.println("Videojuegos y series entregados:");
        for (Serie serie: series){
            if(serie.isEntregado()){
                System.out.println(serie.toString());
            }
        }

        for (VideoJuego videoJuego: videoJuegos){
            if(videoJuego.isEntregado()){
                System.out.println(videoJuego.toString());
            }
        }
        System.out.println("");
        VideoJuego videoJuegoConMasHoras = videoJuegos[0];
        for (VideoJuego videoJuego: videoJuegos){
            Integer resultadoCompareTo = videoJuego.compareTo(videoJuegoConMasHoras.getHorasEstimadas());
            if(resultadoCompareTo == 1){
                videoJuegoConMasHoras = videoJuego;
            }
        }

        Serie serieConMasTemporadas = series[0];
        for (Serie serie:series){
            Integer resultadoCompareTo = serie.compareTo(serieConMasTemporadas.getNumeroTemporadas());
            if(resultadoCompareTo == 1){
                serieConMasTemporadas = serie;
            }
        }


        System.out.println("Videojuego con mas horas estimadas: ");
        System.out.println(videoJuegoConMasHoras.toString());
        System.out.println("");
        System.out.println("Serie con mas temporadas: ");
        System.out.println(serieConMasTemporadas.toString());
    }
}
