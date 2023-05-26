/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.estudiantes;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Estudiantes {
    private static final int NumEstudiantes = 20;
    private static final int NumAsignaturas = 5;

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
                Scanner scanner = new Scanner(System.in);

        int[][] notas = new int[NumEstudiantes][NumAsignaturas];
        int[] coeficientes = new int[NumAsignaturas];
        
        metodos.leerNotas(notas, scanner);
        metodos.leerCoeficientes(coeficientes, scanner);
        
        metodos.calcularMediaAlumnos(notas);
        metodos.calcularMediaGeneral(notas, coeficientes);
        metodos.calcularMediaPorAsignatura(notas, coeficientes);
        metodos.calcularPorcentajeFaltas(notas);
    }
    
    
}
