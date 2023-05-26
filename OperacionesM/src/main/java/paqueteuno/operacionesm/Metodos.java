/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.operacionesm;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {

    Scanner scanner = new Scanner(System.in);

    public static int[][] leerMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j
                        + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("Matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMenu() {
        System.out.println("Menú de operaciones:");
        System.out.println("1. Multiplicación de matrices");
        System.out.println("2. Suma de matrices");
        System.out.println("3. Resta de matrices");
        System.out.println("4. Multiplicación por un escalar");
        System.out.println("5. Traspuesta de una matriz");
        System.out.println("0. Salir");
    }

    public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;

        if (columnas1 != filas2) {
            System.out.println("No se pueden multiplicar las matrices."
                    + " El número de columnas de la matriz 1 debe ser igual "
                    + "al número de filas de la matriz 2.");
            return;
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado de la multiplicación de matrices:");
        mostrarMatriz(resultado);
    }

    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (filas != matriz2.length || columnas != matriz2[0].length) {
            System.out.println("No se pueden sumar las matrices. Deben "
                    + "tener la misma dimensión.");
            return;
        }

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado de la suma de matrices:");
        mostrarMatriz(resultado);
    }

    public static void restarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (filas != matriz2.length || columnas != matriz2[0].length) {
            System.out.println("No se pueden restar las matrices. "
                    + "Deben tener la misma dimensión.");
            return;
        }

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("Resultado de la resta de matrices:");
        mostrarMatriz(resultado);
    }

    public static void multiplicarPorEscalar(int[][] matriz, int[][] matriz2,
            int escalar) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println("Que matriz desea operar?");
        op = scanner.nextInt();
        int[][] resultado = new int[filas][columnas];
        if (op == 1) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matriz[i][j] * escalar;
                }

            }
            System.out.println("Resultado de la multiplicación por escalar:");
            mostrarMatriz(resultado);
        } else {
            if (op == 2) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matriz2[i][j] * escalar;
                    }

                }
                System.out.println("Resultado de la multiplicación por escalar:");
                mostrarMatriz(resultado);
            } else {
                System.out.println("Matriz no encontrada.");
            }
        }

    }

    public static void calcularTraspuesta(int[][] matriz, int[][] matriz2) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] traspuesta = new int[columnas][filas];
        System.out.println("Que matriz desea operar?");
        op = scanner.nextInt();
        if (op == 1) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    traspuesta[j][i] = matriz[i][j];
                }
            }
            System.out.println("Traspuesta de la matriz:");
            mostrarMatriz(traspuesta);
        } else {
            if (op == 2) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        traspuesta[j][i] = matriz2[i][j];
                    }
                }
                System.out.println("Traspuesta de la matriz:");
                mostrarMatriz(traspuesta);
            } else {
                System.out.println("Matriz no encontrada.");
            }

        }
    }
}
