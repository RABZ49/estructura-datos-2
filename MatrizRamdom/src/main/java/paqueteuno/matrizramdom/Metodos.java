/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.matrizramdom;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author busta
 */
public class Metodos {

    public static int[][] generarMatrizAleatoria(int N) {
        int[][] matriz = new int[N][N];
        Random random = new Random();
        Set<Integer> numerosUtilizados = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int numeroAleatorio = generarNumeroAleatorio(N * N,
                        numerosUtilizados, random);
                matriz[i][j] = numeroAleatorio;
                numerosUtilizados.add(numeroAleatorio);
            }
        }

        return matriz;
    }

    public static int generarNumeroAleatorio(int maximo,
            Set<Integer> numerosUtilizados, Random random) {
        int numeroAleatorio = random.nextInt(maximo) + 1;

        while (numerosUtilizados.contains(numeroAleatorio)) {
            numeroAleatorio = random.nextInt(maximo) + 1;
        }

        return numeroAleatorio;
    }

    public static void mostrarMatriz(int[][] matriz) {
        int N = matriz.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
