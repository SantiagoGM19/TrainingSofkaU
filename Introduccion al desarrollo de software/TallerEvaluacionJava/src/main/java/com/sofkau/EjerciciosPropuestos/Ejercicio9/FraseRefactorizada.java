package com.sofkau.EjerciciosPropuestos.Ejercicio9;


/* Del texto, La sonrisa sera la mejor arma contra la tristeza
Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta
frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas. */

public class FraseRefactorizada {

    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String textoNuevo = texto.replace("a","e");
        String frase = textoNuevo.concat(", eso te hará el mejor guerrero contra la maldad.");
        System.out.println(frase);
    }


}
