package com.sofkau.EjerciciosPropuestos.Ejercicio11;

/*Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de a,e,i,o,u.*/

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmoFrase {

    public static void main(String[] args) {
        String frase = ingresarPorConsola();
        int longitudFrase = frase.length();
        long cantidad_a, cantidad_e, cantidad_i, cantidad_o, cantidad_u;
        String[] arrayFrase = frase.replace(" ","").split("");
        System.out.println("La frase ingresada tiene una longitud de "+longitudFrase+
                            " caracteres y tiene la siguiente cantidad de vocales");
        contarLetras(arrayFrase, "a");
        contarLetras(arrayFrase, "e");
        contarLetras(arrayFrase, "i");
        contarLetras(arrayFrase, "o");
        contarLetras(arrayFrase, "u");
    }

    public static void contarLetras(String[] arrayFrase, String letraComparacion){
        long contador = Arrays.stream(arrayFrase).filter(x->x.equals(letraComparacion)).count();
        System.out.println("vocal "+letraComparacion+" -->"+contador);
    }

    public static String ingresarPorConsola(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera: ");
        String frase = captura.nextLine();
        return frase;
    }

}
