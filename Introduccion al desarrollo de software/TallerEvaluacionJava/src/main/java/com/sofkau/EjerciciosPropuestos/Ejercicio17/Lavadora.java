package com.sofkau.EjerciciosPropuestos.Ejercicio17;

public class Lavadora extends Electrodomestico{
    private Double carga;

    final Double CARGA = 5.0;

    public Double getCarga() {
        return carga;
    }

    public Lavadora(){
        super();
        this.carga = CARGA;
    }

    public Lavadora(Double precioBase, Double peso){
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        if(peso>30){
            precioBase += 50.0;
        }
        super.precioFinal();
    }
}
