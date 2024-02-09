package org.example;
//Este código crea un array de 10 elementos y lo llena con números aleatorios entre 0 y 10, imprimiéndolos luego en la consola.
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];  // Cambia el 10 por cualquier otro valor para cambiar la longitud del array

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(11);  // Genera un número aleatorio entre 0 y 10
            System.out.println(numeros[i]);
        }
    }
}
