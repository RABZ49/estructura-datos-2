/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.llenarmatriz;

/**
 *
 * @author busta
 */
public class Metodos {

    public static char[][] generarCuadroAsteriscos(int N, char simboloRelleno) {
        char[][] matriz = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = simboloRelleno;
                }
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(char[][] matriz) {
        int N = matriz.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
