
package ejercicioestructurarepetitiva;

import java.util.Scanner;


public class EjercicioEstructuraRepetitiva {

   
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
      int cont = 0;
      double numero;
    
    do {
        System.out.print("Ingresa un número positivo, negativo para terminar: ");
        try {
            numero = teclado.nextDouble();
            if (numero >= 0) {
                cont += numero;
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un número válido.");
            numero = -1; 
        }
    } while (numero >= 0);
    
    System.out.println("La suma total de los números positivos ingresados es: " + cont);
   }
}
