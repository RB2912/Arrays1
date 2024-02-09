package org.example;
//Este código primero pide al usuario que defina la longitud del array. Luego, en un bucle, solicita al usuario que ingrese valores entre 0 y 10 para cada posición del array, repitiendo la solicitud si el valor ingresado no está en el rango.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del array:");
        int longitud = scanner.nextInt();
        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Ingrese un número entre 0 y 10 para la posición " + i + ":");
                numeros[i] = scanner.nextInt();
            } while (numeros[i] < 0 || numeros[i] > 10);
        }
        scanner.close();
    }
}

