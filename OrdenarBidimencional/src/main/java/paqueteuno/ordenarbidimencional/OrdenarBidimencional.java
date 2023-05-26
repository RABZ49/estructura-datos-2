/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.ordenarbidimencional;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class OrdenarBidimencional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = metodos.leerMatriz(filas, columnas, scanner);

        System.out.println("Matriz original:");
        metodos.mostrarMatriz(matriz);

        metodos.ordenarMatriz(matriz);

        System.out.println("\nMatriz ordenada:");
        metodos.mostrarMatriz(matriz);
    }


}
