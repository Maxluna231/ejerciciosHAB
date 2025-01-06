
package ejercicio3vectoresyexcepciones;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio3VectoresYExcepciones {

   
    public static void main(String[] args) {
          Vector<Integer> vector = new Vector<>(5);

        // Agregar datos al vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Mostrar el vector
        System.out.println("Vector: " + vector);
      
        Scanner scanner = new Scanner(System.in);
        try {
           
            System.out.print("Introduce el índice al que deseas acceder: ");
            int index = scanner.nextInt();

           
            int value = vector.get(index);
            System.out.println("Elemento en el índice " + index + ": " + value);

        } catch (IndexOutOfBoundsException e) {
           
            System.out.println("Error: Estás intentando acceder a una posición inválida en el vector.");
        } catch (Exception e) {
          
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            // Cerrar el escáner
            scanner.close();
        }
    }
    
}
