/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.llenarmatriz2;

/**
 *
 * @author busta
 */
public class Metodos {

    public static char[][] generarTrianguloAsteriscos(int N,
            char simboloAsterisco, char simboloSimbolo) {
        char[][] matriz = new char[N][2 * N - 1];
        int centro = N - 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j >= centro - i && j <= centro + i) {
                    matriz[i][j] = simboloAsterisco;
                } else {
                    matriz[i][j] = simboloSimbolo;
                }
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(char[][] matriz) {
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
