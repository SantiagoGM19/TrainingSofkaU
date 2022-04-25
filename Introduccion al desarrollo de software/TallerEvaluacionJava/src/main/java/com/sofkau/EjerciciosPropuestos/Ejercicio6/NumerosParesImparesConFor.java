package com.sofkau.EjerciciosPropuestos.Ejercicio6;

public class NumerosParesImparesConFor {
    public static void main(String[] args) {

        System.out.println("números pares:");
        mostrarPares_Impares(200, true);
        System.out.println("números impares:");
        mostrarPares_Impares(200, false);

    }

    public static void mostrarPares_Impares(int limite, boolean sonPares){
        for (int numero = verificarPar(sonPares); numero <= limite; numero+=2){
            System.out.print(numero);
            System.out.print("   ");
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
