/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.operacionesm;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class OperacionesM {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el número de filas de la matriz 1: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz 1: ");
        int columnas = scanner.nextInt();

        int[][] matriz1 = metodos.leerMatriz(filas, columnas);
        System.out.print("Ingrese el número de filas de la matriz 2: ");
        int filas2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz 2: ");
        int columnas2 = scanner.nextInt();
        int[][] matriz2 = metodos.leerMatriz(filas2, columnas2);

        int opcion;
        do {
            metodos.mostrarMenu();
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    metodos.multiplicarMatrices(matriz1, matriz2);
                    break;
                case 2:
                    metodos.sumarMatrices(matriz1, matriz2);
                    break;
                case 3:
                    metodos.restarMatrices(matriz1, matriz2);
                    break;
                case 4:
                    System.out.print("Ingrese el escalar: ");
                    int escalar = scanner.nextInt();
                    metodos.multiplicarPorEscalar(matriz1, matriz2, escalar);
                    break;
                case 5:
                    metodos.calcularTraspuesta(matriz1,matriz2);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

 
}