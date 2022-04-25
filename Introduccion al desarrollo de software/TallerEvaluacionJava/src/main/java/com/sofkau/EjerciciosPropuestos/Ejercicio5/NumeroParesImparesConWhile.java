package com.sofkau.EjerciciosPropuestos.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class NumeroParesImparesConWhile {
    public static void main(String[] args) {

        System.out.println("números pares:");
        mostrarPares_Impares(100, true);
        System.out.println("números impares:");
        mostrarPares_Impares(100, false);

    }

    public static void mostrarPares_Impares(int limite, boolean sonPares){
        int numero = verificarPar(sonPares);
        while(numero <= limite){
            System.out.print(numero);
            System.out.print("   ");
            numero += 2;
        }
        System.out.println("");
    }

    public static int verificarPar(boolean sonPares){
        int numero = 2;
        if(!sonPares){
            numero = 1;
        }
        return numero;
    }
}
