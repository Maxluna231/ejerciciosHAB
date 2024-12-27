
package ejemploifelseanidados;

import java.util.Scanner;

public class EjemploIfElseAnidados {

   
    public static void main(String[] args) {
          /* Una universidad clasifica las notas de los estudiantes en diferentes niveles de rendimiento.
        Escribe un programa que, a partir de una nota numérica ingresada por el usuario, determine el
        nivel de rendimiento del estudiante. Las categorías son las siguientes:
            Si la nota es menor a 60, el rendimiento es "Insuficiente".
            Si la nota está entre 60 y 80, el rendimiento es "Bueno".
            Si la nota está entre 81 y 90, el rendimiento es "Notable".
            Si la nota es mayor a 90, el rendimiento es "Excelente". */
          
          System.out.println("Ingrese la nota del alumno");
          Scanner teclado = new Scanner(System.in);
          double calificacion = teclado.nextDouble();
          
          if(calificacion <60){
          System.out.println("El rendimiento del alumno es Insuficiente");
          }else{
          if(calificacion>=60 && calificacion<=80){
          System.out.println("El rendimiento del alumno es Bueno");
            }else{
          if(calificacion>=81 && calificacion<=80){
          System.out.println("El rendimiento del alumno es Notable");
          }else{
          System.out.println("El rendimiento del alumno es Exelente");
          
          }
          
           }
        }
    }
    
}
