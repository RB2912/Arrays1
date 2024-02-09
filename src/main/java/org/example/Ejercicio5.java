package org.example;
import java.util.Scanner;
//Este código crea un array con las letras del abecedario en mayúsculas y permite al usuario seleccionar letras por su índice hasta que decida terminar la ejecución introduciendo -1. Si el índice no está en el rango válido y no es -1, se le notifica al usuario que es inválido y se le solicita de nuevo.

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] abecedario = new char[26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = (char) ('A' + i);  // Llena el array con letras mayúsculas
        }

        int indice;
        do {
            System.out.println("Ingrese un índice entre 0 y 25 o -1 para salir:");
            indice = scanner.nextInt();
            if (indice >= 0 && indice < abecedario.length) {
                System.out.println("Letra: " + abecedario[indice]);
            } else if (indice != -1) {
                System.out.println("Índice inválido.");
            }
        } while (indice != -1);
        scanner.close();
    }
}

