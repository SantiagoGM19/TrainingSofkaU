package com.sofkau.EjerciciosPropuestos.Ejercicio18;

public class Serie implements Entregable {
    private String titulo;
    private Integer numeroTemporadas;
    private Boolean entregado;
    private String genero;
    private String creador;

    final Integer NUMERO_TEMPORADAS = 3;
    final Boolean ENTREGADO = false;


    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Integer getNumeroTemporadas() {return numeroTemporadas;}

    public void setNumeroTemporadas(Integer numeroTemporadas) {this.numeroTemporadas = numeroTemporadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCreador() {return creador;}

    public void setCreador(String creador) {this.creador = creador;}

    public Serie(){
        this.titulo = "";
        this.numeroTemporadas = NUMERO_TEMPORADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.numeroTemporadas = NUMERO_TEMPORADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {entregado = true;}

    @Override
    public void devolver() {entregado = false;}

    @Override
    public Boolean isEntregado() {return entregado;}

    @Override
    public Integer compareTo(Object a) {
        if(numeroTemporadas > (Integer) a){
            return 1;
        }
        if(numeroTemporadas < (Integer) a){
            return -1;
        }
        return 0;
    }
}
