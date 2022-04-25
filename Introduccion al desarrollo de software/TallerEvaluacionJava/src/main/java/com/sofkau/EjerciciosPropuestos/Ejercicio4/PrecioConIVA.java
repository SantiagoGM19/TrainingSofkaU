package com.sofkau.EjerciciosPropuestos.Ejercicio4;


import java.util.Scanner;

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales)
y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/
public class PrecioConIVA {
    public static void main(String[] args) {

        Double precio = ingresarPorConsola();
        Double IVA = 0.21;
        Double precioFinal = precio*1.21;
        System.out.println("El precio final con IVA es: "+precioFinal);
    }

    public static Double ingresarPorConsola(){

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        String radio = captura.nextLine();
        return Double.parseDouble(radio);
    }
}
