package com.sofkau.EjerciciosPropuestos.Ejercicio15;

import javax.swing.*;
import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Integer opcion = 1;
        while (opcion!=8){
            if (opcion>9 || opcion<1){
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA, POR FAVOR SELECCIONE UNA DE LAS OCHO OPCIONES");
            }
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            opcion = ingresarPorConsola();
        }
        JOptionPane.showMessageDialog(null, "MENU CERRADO");
    }

    public static Integer ingresarPorConsola() {
        try {
            Scanner captura = new Scanner(System.in);
            System.out.println("ELIJA UNA OPCION: ");
            String palabra = captura.nextLine();
            return Integer.parseInt(palabra);
        }catch (Exception e){
            return 0;
        }
    }
}
