/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.empresaalmacenes;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Empresaalmacenes {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        int[][] ventas = new int[10][3];
        metodos.leerVentas(ventas, scanner);

        double[] mediasMensuales = metodos.calcularMediasMensuales(ventas);
        metodos.mostrarMediasMensuales(mediasMensuales);

        int[] almacenesSuperiores = metodos.obtenerAlmacenesSuperiores(ventas,
                mediasMensuales);
        metodos.mostrarAlmacenesSuperiores(almacenesSuperiores);

        int mesMasProductivo = metodos.obtenerMesMasProductivo(ventas);
        int mesMenosProductivo = metodos.obtenerMesMenosProductivo(ventas);

        System.out.println("Mes más productivo: " + (mesMasProductivo + 1));
        System.out.println("Mes menos productivo: " + (mesMenosProductivo + 1));
    }

    
}
