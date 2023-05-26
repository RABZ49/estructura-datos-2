/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.deeterminantem;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class DeeterminanteM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        int[][] matriz = metodos.leerMatriz(n, scanner);

        System.out.println("Matriz ingresada:");
        metodos.mostrarMatriz(matriz);

        int determinante = metodos.calcularDeterminante(matriz);

        System.out.println("Determinante: " + determinante);
    }

}
