package org.example;
//Este código reutiliza el array del ejercicio 1, calcula la suma de todos sus elementos y luego calcula la media de estos valores.

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }
        double media = suma / (double) numeros.length;
        System.out.println("Suma: " + suma + ", Media: " + media);
    }
}

