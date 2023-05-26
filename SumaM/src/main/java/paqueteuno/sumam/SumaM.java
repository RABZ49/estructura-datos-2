/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.sumam;

import java.util.Scanner;



/**
 *
 * @author busta
 */
public class SumaM {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = metodos.leerMatriz(filas, columnas);

        int[] sumaFilas = metodos.calcularSumaFilas(matriz);
        int[] sumaColumnas = metodos.calcularSumaColumnas(matriz);
        System.out.println("Matriz original:");
        metodos.printtMatriz(matriz);

        System.out.println("Suma de filas:");
        metodos.mostrarVector(sumaFilas);

        System.out.println("Suma de columnas:");
        metodos.mostrarVector(sumaColumnas);
    }


}
