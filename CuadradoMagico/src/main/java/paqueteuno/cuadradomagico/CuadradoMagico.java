/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class CuadradoMagico {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
        int[][] M = metodos.crearArray();

        
        metodos.cuadradoMagico(M);

        
        metodos.mostrarCuadradoMagico(M);
    }

}
