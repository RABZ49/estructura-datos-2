/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.matrizramdom;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class MatrizRamdom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el tamaño de la matriz cuadrada (N): ");
        int N = scanner.nextInt();

        int[][] matriz = metodos.generarMatrizAleatoria(N);

        System.out.println("Matriz aleatoria generada:");
        metodos.mostrarMatriz(matriz);
    }

}
