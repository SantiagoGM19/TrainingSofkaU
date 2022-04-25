package com.sofkau.EjerciciosPropuestos.Ejercicio17;

public class Television extends Electrodomestico{

    private Double resolucion; //en pulgadas
    private Boolean sintonizadorTDT;

    final Double RESOLUCION = 20.0;
    final Boolean SINTONIZADOR_TDT = false;

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Television(){
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(Double precioBase, Double peso){
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Double resolucion, Boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal(){
        if(resolucion > 40.0){
            precioBase += precioBase*0.3;
        }
        if(sintonizadorTDT){
            precioBase += 50.0;
        }
        super.precioFinal();
    }
}
