package com.sofkau.EjerciciosPropuestos.Ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

/*Crea una aplicación por consola que nos pida un día de la semana y
que nos diga si es un día laboral o no. Usa un switch para ello.*/

public class DiaLaboral {

    public static void main(String[] args) {

        String dia = ingresarPorConsola();
        String lowerCaseDia = dia.toLowerCase();
        verificarDiaLaboral(lowerCaseDia);
        int esDiaLaboral = verificarDiaLaboral(lowerCaseDia);
        switch (esDiaLaboral) {
            case 1: {
                System.out.println("Es día laboral");
                break;
            }
            default: {
                System.out.println("No es día laboral");
                break;
            }
        }

    }

    public static int verificarDiaLaboral(String lowerCaseDia){
        boolean esDiaNormal = verificarDia(lowerCaseDia);
        int esDiaLaboral = esDiaNormal?1:0;
        return esDiaLaboral;
    }

    public static boolean verificarDia(String lowerCaseDia){
        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        boolean esDiaNormal = Arrays.stream(dias).anyMatch(x -> x.equals(lowerCaseDia));
        return esDiaNormal;
    }

    public static String ingresarPorConsola(){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana:");
        String dia = captura.nextLine();
        return dia;
    }
}
