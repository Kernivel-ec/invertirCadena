package com.kernivel.invertircadena;

/**
 * @author ING. Roberto Calero
 * www.kernivel.com
 * www.buymeacoffee.com/kernivel
 */

/*
 * Reto INVERTIR CADENA
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class InvertirCadena {

    public static void main(String[] args) {
        //Titulo de la aplicacion
        System.out.println("Invertir cadena");
        //Variables
        String cadena ="Hola mundo";
        String cadenaInvertida="";
        //For que recorra cada caracter de la cadena de manera inversa y y lo gurade en la cadenaInversa
        for(int x = cadena.length() - 1 ; x >= 0 ; x--){
            //Concatenamos cada caracter con el anterior
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
            
        }
        //Mostramos la cadena y cadenaInversa por consola
        System.out.println("Cadena: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
    }
}
