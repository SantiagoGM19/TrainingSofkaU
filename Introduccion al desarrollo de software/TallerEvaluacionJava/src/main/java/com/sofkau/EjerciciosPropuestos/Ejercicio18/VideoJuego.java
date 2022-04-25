package com.sofkau.EjerciciosPropuestos.Ejercicio18;

public class VideoJuego implements Entregable{
    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    final Integer HORAS_ESTIMADAS = 10;
    final Boolean ENTREGADO = false;


    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Integer getHorasEstimadas() {return horasEstimadas;}

    public void setHorasEstimadas(Integer horasEstimadas) {this.horasEstimadas = horasEstimadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCompania() {return compania;}

    public void setCompania(String compania) {this.compania = compania;}

    public VideoJuego(){
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, Integer horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, Integer horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
        if(horasEstimadas> (Integer) a){
            return 1;
        }
        if(horasEstimadas < (Integer) a){
            return -1;
        }
        return 0;
    }
}
