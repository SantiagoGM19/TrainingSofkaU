package com.sofkau.EjerciciosPropuestos.Ejercicio2;

import java.util.Scanner;
/*
* Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
* */
public class NumeroMayorConsola {
    public static void main(String[] args) {

        System.out.println("Ingresa los numeros para comparar");
        int numero1 = ingresarPorConsola();
        int numero2 = ingresarPorConsola();

        verificarMayor(numero1,numero2);
        verificarMayor(numero2,numero1);

        if(numero1 == numero2){
            System.out.println("Ambos números son iguales");
        }
    }

    public static int ingresarPorConsola(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Siguiente número:");
        String numero = captura.nextLine();
        return Integer.parseInt(numero);
    }

    public static void verificarMayor(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println(numero1+" es mayor que "+numero2);
        }
    }
}
