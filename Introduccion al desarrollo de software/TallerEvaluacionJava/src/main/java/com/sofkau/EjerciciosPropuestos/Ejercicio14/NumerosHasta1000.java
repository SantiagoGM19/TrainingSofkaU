package com.sofkau.EjerciciosPropuestos.Ejercicio14;

import java.awt.font.ImageGraphicAttribute;
import java.util.Scanner;


/*Crear un programa que pida un numero por teclado y que imprima por pantalla
los números desde el numero introducido hasta 1000 con saldos de 2 en 2.*/
public class NumerosHasta1000 {
    public static void main(String[] args) {

        Integer numero = ingresarPorConsola();
        System.out.println("-----------------------------------------------------");
        if(!verificarPar(numero)){
            System.out.println(numero);
            numero++;
        }
        for (int i=numero; i<=1000;i+=2){
            System.out.print(i+", ");
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------");
    }

    public static Boolean verificarPar(Integer numero){
        return (numero%2==0);
    }

    public static Integer ingresarPorConsola() {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera: ");
        String palabra = captura.nextLine();
        return Integer.parseInt(palabra);
    }
}
