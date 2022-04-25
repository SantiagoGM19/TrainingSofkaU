package com.sofkau.EjerciciosPropuestos.Ejercicio12;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.*/
public class PalabrasIguales {
    public static void main(String[] args) {

        String palabra1 = ingresarPorConsola();
        String palabra2 = ingresarPorConsola();

        System.out.println("-----------------------------------------------------------");

        if(verificarIgualdad(palabra1,palabra2)){
            System.out.println("ambas palabras son iguales");
            System.out.println("-----------------------------------------------------------");
            return;
        }
        System.out.println("Las palabras ingresadas no son iguales  ");
        System.out.println(" ");
        compararLongitud(palabra1, palabra2);
        System.out.println(" ");
        System.out.println("Esta es la comparación letra a letra de las palabras: ");
        mostrarDiferencias(palabra1, palabra2);
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
    }

    public static void compararLongitud(String palabra1, String palabra2){
        if(palabra1.length() == palabra2.length()){
            System.out.println("ambas palabras tienen la misma longitud");
            System.out.println("Quiere decir que difieren solo en sus letras");
            return;
        }
        System.out.println("las palabras tienen diferente longitud: ");
        System.out.print("La palabra 1 tiene una longitud de "+palabra1.length()+
                " caracteres y la palabra 2 de "+palabra2.length()+" caracteres");
    }

    public static Boolean verificarIgualdad(String palabra1, String palabra2){
        return palabra1.equals(palabra2);
    }

    public static void mostrarDiferencias(String palabra1, String palabra2){

        String[] arrayPalabras1 = palabra1.split("");
        String[] arrayPalabras2 = palabra2.split("");

        Arrays.stream(arrayPalabras1).forEach(x-> System.out.print(x+" - "+""));
        System.out.println(" ");
        Arrays.stream(arrayPalabras1).forEach(x-> System.out.print("|   "));
        System.out.println(" ");
        Arrays.stream(arrayPalabras2).forEach(x-> System.out.print(x+" - "+""));
    }

    public static String ingresarPorConsola(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese una palabra cualquiera: ");
        String palabra = captura.nextLine();
        return palabra;
    }
}
