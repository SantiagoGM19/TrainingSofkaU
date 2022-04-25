package com.sofkau.EjerciciosPropuestos.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

/*Haz una aplicación que calcule el área de un círculo(pi*R2).
El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
Usa la constante PI y el método pow de Math.*/
public class CalculoArea {

    public static void main(String[] args) {

        Double radio = ingresarPorConsola();
        Double area = Math.PI*Math.pow(radio,2);
        System.out.println("El area del círculo es: "+area);

    }



    public static Double ingresarPorConsola(){

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese radio del círculo:");
        String radio = captura.nextLine();
        return Double.parseDouble(radio);
    }


}
