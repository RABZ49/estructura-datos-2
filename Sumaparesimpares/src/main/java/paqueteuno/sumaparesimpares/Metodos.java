/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.sumaparesimpares;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {
        public static int[][] leerMatriz(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[filas][columnas];
        
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese los elementos de la matriz en la "
                        + "posicion "+i+"|"+j+":");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        return matriz;
    }
    
    public static int calcularSumaPares(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int suma = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    suma += matriz[i][j];
                }
            }
        }
        
        return suma;
    }
    
    public static int calcularSumaImpares(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int suma = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 != 0) {
                    suma += matriz[i][j];
                }
            }
        }
        
        return suma;
    }
    public static void printtMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
    }
}
