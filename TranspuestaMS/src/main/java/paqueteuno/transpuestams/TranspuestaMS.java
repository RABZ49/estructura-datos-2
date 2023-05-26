/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.transpuestams;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class TranspuestaMS {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Metodos metodos = new Metodos();
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        int[][] matriz = metodos.leerMatriz(n, scanner);

        System.out.println("Matriz original:");
        metodos.mostrarMatriz(matriz);

        int[][] matrizTranspuesta = metodos.transponerMatriz(matriz);

        System.out.println("Matriz transpuesta:");
        metodos.mostrarMatriz(matrizTranspuesta);
    }

    
}
