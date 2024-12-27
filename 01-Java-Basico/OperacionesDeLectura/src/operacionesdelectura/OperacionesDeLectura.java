
package operacionesdelectura;

import java.util.Scanner;


public class OperacionesDeLectura {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un numero entero");
        int numero1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo entero");
        int numero2 = entrada.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        
        int division = numero1 / numero2;
        
      System.out.println("La suma es "  + suma);
       System.out.println("La resta es "  + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
         System.out.println("La division es " + division);
         System.out.println("Muy bien :)");
         
         //Si se divide un 0 muestra en consola 0
         //Para dar una solucion es poner una condicion en un if/else
    }
    
}
