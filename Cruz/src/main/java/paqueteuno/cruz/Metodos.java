/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.cruz;

/**
 *
 * @author busta
 */
public class Metodos {
    public static char[][] generarCruzAsteriscos(int N, 
            char simboloAsterisco, char simboloRelleno) {
        char[][] matriz = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == N / 2 || j == N / 2) {
                    matriz[i][j] = simboloAsterisco;
                } else {
                    matriz[i][j] = simboloRelleno;
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
