
package ejerciciomatrices1dia2;

import java.util.Scanner;


public class EjercicioMatrices1Dia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introducir las notas de los alumnos");
        
        
      int promedios [][] = new int [4][4];
        
      for(int i = 0; i< promedios.length;i++) {
      int suma = 0;
      
        for (int j = 0; j < 3; j++) {
                System.out.print("  Nota " + (j + 1) + ": ");
                promedios[i][j] = teclado.nextInt();
                suma += promedios[i][j];
            }
  
            promedios[i][3] = suma / 3; //sumar y dividir entre 3
        }
       
        System.out.println("\nNotas y promedios de los alumnos:");
        System.out.println("Alumno\tNota 1\tNota 2\tNota 3\tProm.");
        for (int i = 0; i < promedios.length; i++) {
            System.out.print("Alumno " + (i + 1) + "\t");
            for (int j = 0; j < promedios[i].length; j++) {
                System.out.print(promedios[i][j] + "\t");
            }
            System.out.println();
        }
      }
    }
