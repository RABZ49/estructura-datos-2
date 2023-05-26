/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresaalmacenes;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {

    private static final int numAlmacenes = 10;
    private static final int numMeses = 3;

    public static void leerVentas(int[][] ventas, Scanner scanner) {
        System.out.println("Ingrese las ventas trimestrales de los"
                + " almacenes:");

        for (int i = 0; i < numAlmacenes; i++) {
            System.out.println("Almacén " + (i + 1) + ":");
            for (int j = 0; j < numMeses; j++) {
                System.out.print("Ingrese las ventas del mes " + (j + 1) +
                        ": ");
                ventas[i][j] = scanner.nextInt();
            }
        }
    }

    public static double[] calcularMediasMensuales(int[][] ventas) {
        double[] mediasMensuales = new double[numAlmacenes];

        for (int i = 0; i < numAlmacenes; i++) {
            int sumaMensual = 0;

            for (int j = 0; j < numMeses; j++) {
                sumaMensual += ventas[i][j];
            }

            mediasMensuales[i] = (double) sumaMensual / numMeses;
        }

        return mediasMensuales;
    }

    public static void mostrarMediasMensuales(double[] mediasMensuales) {
        System.out.println("Media de las ventas mensuales para cada "
                + "almacén:");

        for (int i = 0; i < numAlmacenes; i++) {
            System.out.printf("Almacén %s: %.2f\n" 
                    ,i+1,mediasMensuales[i]);
        }
    }

    public static int[] obtenerAlmacenesSuperiores(int[][] ventas, double[] 
            mediasMensuales) {
        int[] almacenesSuperiores = new int[numAlmacenes];
        int numAlmacenesSuperiores = 0;
        double mediaTotal = calcularMediaTotal(mediasMensuales);

        for (int i = 0; i < numAlmacenes; i++) {
            if (mediasMensuales[i] > mediaTotal) {
                almacenesSuperiores[numAlmacenesSuperiores] = i + 1;
                numAlmacenesSuperiores++;
            }
        }

        int[] resultado = new int[numAlmacenesSuperiores];
        System.arraycopy(almacenesSuperiores, 0, resultado,
                0, numAlmacenesSuperiores);

        return resultado;
    }

    public static void mostrarAlmacenesSuperiores(int[] almacenesSuperiores) {
        System.out.println("Almacenes con ventas mensuales superiores"
                + " a la media total:");

        for (int i = 0; i < almacenesSuperiores.length; i++) {
            System.out.println("Almacén " + almacenesSuperiores[i]);
        }
    }

    public static double calcularMediaTotal(double[] mediasMensuales) {
        double suma = 0;

        for (int i = 0; i < numAlmacenes; i++) {
            suma += mediasMensuales[i];
        }

        return suma / numAlmacenes;
    }

    public static int obtenerMesMasProductivo(int[][] ventas) {
        int mesMasProductivo = 0;
        int maxVentas = ventas[0][0];

        for (int i = 0; i < numMeses; i++) {
            int ventasMes = 0;

            for (int j = 0; j < numMeses; j++) {
                ventasMes += ventas[j][i];
            }

            if (ventasMes > maxVentas) {
                maxVentas = ventasMes;
                mesMasProductivo = i;
            }
        }

        return mesMasProductivo;
    }

    public static int obtenerMesMenosProductivo(int[][] ventas) {
        int mesMenosProductivo = 0;
        int minVentas = ventas[0][0];

        for (int i = 0; i < numMeses; i++) {
            int ventasMes = 0;

            for (int j = 0; j < numAlmacenes; j++) {
                ventasMes += ventas[j][i];
            }

            if (ventasMes < minVentas) {
                minVentas = ventasMes;
                mesMenosProductivo = i;
            }
        }

        return mesMenosProductivo;
    }
}
