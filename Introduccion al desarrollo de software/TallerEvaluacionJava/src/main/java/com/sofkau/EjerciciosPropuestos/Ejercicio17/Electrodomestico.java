package com.sofkau.EjerciciosPropuestos.Ejercicio17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Electrodomestico {

    protected Double precioBase; // en euros
    protected String color;
    protected Character consumoEnergetico;
    protected  Double peso; // en kilgramos

    final Double PRECIO_BASE = 100.0;
    final String COLOR = "BLANCO";
    final Character CONSUMO_ENERGETICO = 'F';
    final Double PESO = 5.0;

    public Double getPrecioBase() {return precioBase;}

    public String getColor() {return color;}

    public Character getConsumoEnergetico() {return consumoEnergetico;}

    public Double getPeso() {return peso;}

    public Electrodomestico(){
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico =CONSUMO_ENERGETICO;
        this.peso = PESO;
    }

    public Electrodomestico(Double precioBase, Double peso){
        this.precioBase = precioBase;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso){
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private Character comprobarConsumoEnergetico(Character letra){
        Character[] letras = {'A','B','C','D','E','F'};
        for (Character letraArreglo:letras){
            if(letra.equals(letraArreglo)){
                return letra;
            }
        }
        return 'F';
    }

    private String comprobarColor(String color){
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        for (String colorArreglo:colores){
            if((color.toUpperCase()).equals(colorArreglo)){
                return color;
            }
        }
        return "BLANCO";
    }

    public void precioFinal(){
        clasificarConsumoEnergetico();
        clasificarPeso();
    }

    private void clasificarConsumoEnergetico(){
        if(consumoEnergetico.equals('A')){precioBase+=100.0;}
        if(consumoEnergetico.equals('B')){precioBase+=80.0;}
        if(consumoEnergetico.equals('C')){precioBase+=60.0;}
        if(consumoEnergetico.equals('D')){precioBase+=50.0;}
        if(consumoEnergetico.equals('E')){precioBase+=30.0;}
        if(consumoEnergetico.equals('F')){precioBase+=10.0;}
    }

    private void clasificarPeso(){
        if(0.0<=peso && peso<=19.0){precioBase+=10.0;}
        if(20.0<=peso && peso<=49.0){precioBase+=50.0;}
        if(50.0<=peso && peso<=79.0){precioBase+=80.0;}
        if(peso>=80.0){precioBase+=100.0;}
    }
    
}
