/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.ordenarbidimencional;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {
        public static int[][] leerMatriz(int filas, int columnas, Scanner scanner) {
        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void ordenarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[] temp = new int[filas * columnas];
        int index = 0;

        // Copiar todos los elementos de la matriz en un arreglo temporal
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                temp[index++] = matriz[i][j];
            }
        }

        // Ordenar el arreglo temporal
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int tempValue = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempValue;
                }
            }
        }

        index = 0;

        // Copiar los elementos ordenados del arreglo temporal de vuelta a la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = temp[index++];
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
