/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.deeterminantem;

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
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calcularDeterminante(int[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0];
        }

        if (n == 2) {
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        }

        int determinante = 0;

        for (int j = 0; j < n; j++) {
            determinante += matriz[0][j] * cofactor(matriz, 0, j);
        }

        return determinante;
    }

    public static int cofactor(int[][] matriz, int fila, int columna) {
        int n = matriz.length;
        int[][] submatriz = new int[n - 1][n - 1];
        int signo = (fila + columna) % 2 == 0 ? 1 : -1;

        int p = 0;
        int q = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != fila && j != columna) {
                    submatriz[p][q++] = matriz[i][j];

                    if (q == n - 1) {
                        q = 0;
                        p++;
                    }
                }
            }
        }

        return signo * calcularDeterminante(submatriz);
    }
}
