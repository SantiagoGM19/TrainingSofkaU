package com.sofka.PrimerProyecto;

import java.util.Scanner;

public class InformacionPorConsola {
    public static void main(String[] args) {

        System.out.println("Primer proyecto Java!");

        Scanner capturaNombreUsuario = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");

        String nombreUsuario = capturaNombreUsuario.nextLine();

        Scanner capturaCelular = new Scanner(System.in);
        System.out.println("Ingrese el número de celular:");

        String celular = capturaCelular.nextLine();

        Scanner capturaEdad = new Scanner(System.in);
        System.out.println("Ingrese la edad:");

        String edad = capturaEdad.nextLine();

        System.out.println("Bienvenido señor "+nombreUsuario+", es un placer para nosotros contar con " +
                "una persona de "+edad+" años.");
        System.out.println("Próximamente nos comunicaremos con usted al número "+celular+".\nFeliz día.");
    }
}
