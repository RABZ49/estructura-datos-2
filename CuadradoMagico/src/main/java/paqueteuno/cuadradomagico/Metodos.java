/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {
    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do {
            System.out.print("Número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);
        
        int[][] A = new int[filas][filas];
        return A;
    }

    public static void cuadradoMagico(int[][] matriz) {
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont;
        for (cont = 2; cont <= N * N; cont++) {
            if (!multiplo) {
                i--;
                if (i < 0) {
                    i = N - 1;
                }
                j++;
                if (j >= N) {
                    j = 0;
                }
            } else {
                i++;
                if (i >= N) {
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            if (cont % N == 0) {
                multiplo = true;
            } else {
                multiplo = false;
            }
        }
    }

    public static void mostrarCuadradoMagico(int[][] cuadradoMagico) {
        int N = cuadradoMagico.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cuadradoMagico[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
