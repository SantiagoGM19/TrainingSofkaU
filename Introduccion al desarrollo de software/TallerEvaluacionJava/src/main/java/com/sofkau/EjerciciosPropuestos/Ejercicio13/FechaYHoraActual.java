package com.sofkau.EjerciciosPropuestos.Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)*/

public class FechaYHoraActual {
    public static void main(String[] args) {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime fechaTiempoActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual en el formato yyyy/MM/dd HH:mm:ss");
        System.out.println(formateador.format(fechaTiempoActual));
    }

}
