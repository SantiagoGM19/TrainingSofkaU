package com.sofkau.EjerciciosPropuestos.Ejercicio10;

import java.util.Scanner;

/*Realizar una aplicación de consola, que al ingresar una frase por teclado
elimine los espacios que esta contenga.*/


public class EspaciosEliminados {
    public static void main(String[] args) {
        String frase = ingresarPorConsola();
        System.out.println(frase.replace(" ",""));
    }

    public static String ingresarPorConsola(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera: ");
        String frase = captura.nextLine();
        return frase;
    }
}
