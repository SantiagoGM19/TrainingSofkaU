package com.sofkau.EjerciciosPropuestos.Ejercicio17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(140.0, 35.2);
        electrodomesticos[2] = new Television();
        electrodomesticos[3] = new Television(603.43, 58.1);
        electrodomesticos[4] = new Television(723.0, "ROJO", 'A', 49.0, 2080.0,true);
        electrodomesticos[5] = new Lavadora(923.50,"GRIS",'C',24.3,2.1);
        electrodomesticos[6] = new Lavadora(3643.123,23.3);
        electrodomesticos[7] = new Television(2354.2, 123.1);
        electrodomesticos[8] = new Television(1039.23, 80.1);
        electrodomesticos[9] = new Television(999.99,77.0);

        Double sumaTotal = 0.0;
        for (Electrodomestico electrodomestico: electrodomesticos){
            electrodomestico.precioFinal();
            Double precioBaseElectrodomestico = electrodomestico.getPrecioBase();
            if(electrodomestico instanceof  Lavadora){
                System.out.println("Lavadora con precio final --> "+precioBaseElectrodomestico);
            }
            if(electrodomestico instanceof  Television){
                System.out.println("Television con precio final --> "+precioBaseElectrodomestico);
            }
            sumaTotal += precioBaseElectrodomestico;
        }

        System.out.print("La suma de todos los electrodomésticos es: "+sumaTotal);

    }
}
