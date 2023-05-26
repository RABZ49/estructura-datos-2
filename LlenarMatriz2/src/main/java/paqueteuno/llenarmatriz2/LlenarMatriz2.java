/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.llenarmatriz2;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class LlenarMatriz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el tamaño del triángulo (N, impar): ");
        int N = scanner.nextInt();

        char[][] matriz = metodos.generarTrianguloAsteriscos(N, '*',
                '-');

        System.out.println("Triángulo de asteriscos generado:");
        metodos.mostrarMatriz(matriz);
    }

}
