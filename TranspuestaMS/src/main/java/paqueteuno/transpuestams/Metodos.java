/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.transpuestams;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {

    public static int[][] leerMatriz(int n, Scanner scanner) {
        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizTranspuesta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTranspuesta[i][j] = matriz[n - j - 1][n - i - 1];
            }
        }

        return matrizTranspuesta;
    }
}
