/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.estudiantes;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {
    private static final int NumEstudiantes = 20;
    private static final int NumAsignaturas = 5;
   public static void leerNotas(int[][] notas, Scanner scanner) {
        System.out.println("Ingrese las notas de los estudiantes:");

        for (int i = 0; i < NumEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < NumAsignaturas; j++) {
                System.out.print("Ingrese la nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void leerCoeficientes(int[] coeficientes, Scanner scanner) {
        System.out.println("Ingrese los coeficientes de las asignaturas:");

        for (int i = 0; i < NumAsignaturas; i++) {
            System.out.print("Ingrese el coeficiente de la asignatura " + (i + 1) + ": ");
            coeficientes[i] = scanner.nextInt();
        }
    }
    
    public static void calcularMediaAlumnos(int[][] notas) {
        System.out.println("Media de cada alumno:");

        for (int i = 0; i < NumEstudiantes; i++) {
            int suma = 0;
            int numAsignaturas = 0;
            
            for (int j = 0; j < NumAsignaturas; j++) {
                if (notas[i][j] != 0) {
                    suma += notas[i][j];
                    numAsignaturas++;
                }
            }
            
            double media = (double) suma / numAsignaturas;
            System.out.printf("Alumno %s : %.2f\n\n" ,i+1,media);
        }
    }
    
    public static void calcularMediaGeneral(int[][] notas, int[] coeficientes) {
        int sumaTotal = 0;
        int numNotas = 0;
        
        for (int i = 0; i < NumEstudiantes; i++) {
            for (int j = 0; j < NumAsignaturas; j++) {
                if (notas[i][j] != 0) {
                    sumaTotal += notas[i][j] * coeficientes[j];
                    numNotas += coeficientes[j];
                }
            }
        }
        
        double mediaGeneral = (double) sumaTotal / numNotas;
        System.out.printf("Media general de la clase: %.2f\n" , mediaGeneral);
    }
    
    public static void calcularMediaPorAsignatura(int[][] notas, int[] coeficientes) {
        System.out.println("Media de la clase en cada asignatura:");
        
        for (int j = 0; j < NumAsignaturas; j++) {
            int sumaAsignatura = 0;
            int numNotas = 0;
            
            for (int i = 0; i < NumEstudiantes; i++) {
                if (notas[i][j] != 0) {
                    sumaAsignatura += notas[i][j] * coeficientes[j];
                    numNotas += coeficientes[j];
                }
            }
            
            double mediaAsignatura = (double) sumaAsignatura / numNotas;
            System.out.printf("Asignatura %s: %.2f\n " ,j+1, mediaAsignatura);
        }
    }
    
    public static void calcularPorcentajeFaltas(int[][] notas) {
        int faltas = 0;
        int totalNotas = NumEstudiantes * NumAsignaturas;

        for (int i = 0; i < NumEstudiantes; i++) {
            for (int j = 0; j < NumAsignaturas; j++) {
                if (notas[i][j] == 0) {
                    faltas++;
                }
            }
        }

        double porcentajeFaltas = (double) faltas / totalNotas * 100;
        System.out.println("Porcentaje de faltas: " + porcentajeFaltas + "%");
    } 
}
