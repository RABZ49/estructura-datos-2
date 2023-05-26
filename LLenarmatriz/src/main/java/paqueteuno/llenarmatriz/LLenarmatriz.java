/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.llenarmatriz;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class LLenarmatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el tamaño de la matriz cuadrada (N, impar): ");
        int N = scanner.nextInt();

        char[][] matriz = metodos.generarCuadroAsteriscos(N, '-');

        System.out.println("Cuadro de asteriscos generado:");
        metodos.mostrarMatriz(matriz);
    }

}
