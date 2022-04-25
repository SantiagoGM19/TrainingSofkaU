package com.sofkau.EjerciciosPropuestos.Ejercicio16;


import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;
    private Character sexo;
    private Double peso; // en kilogramos
    private Double altura; //en metros

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setEdad(Integer edad) {this.edad = edad;}

    public void setSexo(Character sexo) {this.sexo = sexo;}

    public void setPeso(Double peso) {this.peso = peso;}

    public void setAltura(Double altura) {this.altura = altura;}

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = Character.valueOf('H');
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, Character sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String comprobarPeso(){
        if(calcularIMC() == -1){
            return nombre+" Está en su peso ideal";
        }
        if(calcularIMC() == 0){
            return nombre+" Está por debajo de su peso ideal ";
        }
        return nombre+" Está por encima de su peso ideal";
    }

    public Integer calcularIMC(){
        Double IMC = peso/Math.pow(altura,2);
        if(IMC<20){
            return -1;
        }
        if(20<=IMC && IMC<= 25){
            return 0;
        }
        return 1;
    }

    public String comprobarEsMayorDeEdad(){
        return esMayorDeEdad()?nombre+" Es mayor de edad":nombre+" No es mayor de edad";
    }

    public Boolean esMayorDeEdad(){return edad>=18;}

    private Character comprobarSexo(Character sexo){
        return (sexo == 'H' || sexo=='M')?sexo:'H';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generarDNI(){
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Double factor = Math.pow(10,7);
        Long numero = threadLocalRandom.nextLong(Math.round(factor),Math.round(9*factor));
        Random random = new Random();
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWZ";
        int randomInt = random.nextInt(abecedario.length());
        Character letra = abecedario.charAt(randomInt);
        return numero.toString()+letra;
    }
}
