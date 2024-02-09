package org.example;
//Este código crea un array de enteros de longitud 100, lo llena con los números del 1 al 100 y luego los imprime en la consola.

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }
    }
}

