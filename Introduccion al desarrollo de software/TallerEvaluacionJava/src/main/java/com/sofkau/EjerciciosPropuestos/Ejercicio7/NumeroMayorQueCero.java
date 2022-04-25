package com.sofkau.EjerciciosPropuestos.Ejercicio7;

import java.util.Scanner;

/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/

public class NumeroMayorQueCero {
    public static void main(String[] args) {
        int numero = 0;
        do {
            System.out.println("Ingresa un numero positivo");
            numero = ingresarPorConsola();
        }while(numero < 0);
        System.out.println("");
        System.out.println("----->"+numero);
    }

    public static int ingresarPorConsola(){

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        String radio = captura.nextLine();
        return Integer.parseInt(radio);
    }
}
