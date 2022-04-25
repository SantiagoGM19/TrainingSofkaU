package com.sofkau.EjerciciosPropuestos.Ejercicio16;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("INGRESAR DATOS PARA LA PERSONA 1");

        System.out.println("NOMBRE:");
        String nombre1 = ingresarPorConsola();
        System.out.println("EDAD:");
        Integer edad1 = Integer.parseInt(ingresarPorConsola());
        System.out.println("SEXO --> H-HOMBRE M-MUJER :");
        Character sexo1 = ingresarPorConsola().charAt(0);
        System.out.println("PESO (EN KILOGRAMOS):");
        Double peso1 = Double.parseDouble(ingresarPorConsola());
        System.out.println("ALTURA (EN METROS):");
        Double altura1 = Double.parseDouble(ingresarPorConsola());
        System.out.println("");

        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);

        System.out.println("INGRESAR DATOS PARA LA PERSONA 2");
        System.out.println("NOMBRE:");
        String nombre2 = ingresarPorConsola();
        System.out.println("EDAD:");
        Integer edad2 = Integer.parseInt(ingresarPorConsola());
        System.out.println("SEXO --> H-HOMBRE M-MUJER :");
        Character sexo2 = ingresarPorConsola().charAt(0);
        System.out.println("PESO (EN KILOGRAMOS):");
        System.out.println("");

        Persona persona2 = new Persona(nombre2, edad2, sexo2);
/*        persona2.setPeso(73.0);
        persona2.setAltura(1.76);*/
        Persona persona3 = new Persona();
        persona3.setNombre("Daniela");
        persona3.setEdad(23);
        persona3.setSexo('M');
        persona3.setPeso(50.4);
        persona3.setAltura(1.64);

        System.out.println("COMPROBANDO PESO IDEAL DE LAS TRES PERSONAS");
        System.out.println(persona1.comprobarPeso());
        System.out.println(persona2.comprobarPeso());
        System.out.println(persona3.comprobarPeso());
        System.out.println("");


        System.out.println("COMPROBANDO SI SON MAYOR DE EDAD");
        System.out.println(persona1.comprobarEsMayorDeEdad());
        System.out.println(persona2.comprobarEsMayorDeEdad());
        System.out.println(persona3.comprobarEsMayorDeEdad());
        System.out.println("");

        System.out.println("INFORMACION DE CADA PERSONA");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public static String ingresarPorConsola() {
        Scanner captura = new Scanner(System.in);
        String dato = captura.nextLine();
        return dato;
    }
}
