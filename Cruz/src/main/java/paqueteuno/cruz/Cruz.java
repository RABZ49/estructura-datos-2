/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.cruz;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Cruz {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (N, impar): ");
        int N = scanner.nextInt();

        char[][] matriz = metodos.generarCruzAsteriscos(N, 
                '*', '-');

        System.out.println("Cruz de asteriscos generada:");
        metodos.mostrarMatriz(matriz);
    }

    
}
    
