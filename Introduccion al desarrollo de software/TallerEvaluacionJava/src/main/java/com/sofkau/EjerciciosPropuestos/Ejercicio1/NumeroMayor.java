package com.sofkau.EjerciciosPropuestos.Ejercicio1;



/* Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.*/

public class NumeroMayor {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 80;

        verificarMayor(numero1,numero2);
        verificarMayor(numero2,numero1);

        if(numero1 == numero2){
            System.out.println("Ambos números son iguales");
        }

    }

    public static void verificarMayor(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println(numero1+" es mayor que "+numero2);
        }
    }
}
