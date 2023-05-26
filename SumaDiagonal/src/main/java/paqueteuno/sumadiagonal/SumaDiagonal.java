/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.sumadiagonal;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class SumaDiagonal {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = metodos.leerMatriz(filas, columnas);
        
        int sumaDiagonal = metodos.calcularSumaDiagonal(matriz);
        System.out.println("Matriz original: ");
        metodos.printtMatriz(matriz);
        System.out.println("La suma de los elementos de la diagonal invertida "
                + "es: " + sumaDiagonal);
    }
    

}
