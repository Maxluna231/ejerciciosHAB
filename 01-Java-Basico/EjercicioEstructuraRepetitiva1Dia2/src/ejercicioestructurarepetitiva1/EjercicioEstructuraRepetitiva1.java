
package ejercicioestructurarepetitiva1;

import java.util.Scanner;


public class EjercicioEstructuraRepetitiva1 {

  
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        int numero;
      
        do {
            System.out.print("Ingrese un número entero positivo para multiplicar: ");
            
            numero = teclado.nextInt();
         
        } while (numero <= 0);
        
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
        
      
    }
}
    

