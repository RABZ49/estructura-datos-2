/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.piramidein;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class PiramideIn {

    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del triángulo (N, impar): ");
        int N = scanner.nextInt();

        char[][] matriz = metodos.generarPiramide(N, 
                '*', '-');

        System.out.println("Triángulo invertido de asteriscos generado:");
        metodos.mostrarMatriz(matriz);
    }

}
