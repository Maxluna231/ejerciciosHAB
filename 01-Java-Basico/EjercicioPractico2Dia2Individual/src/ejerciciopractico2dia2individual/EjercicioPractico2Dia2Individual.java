
package ejerciciopractico2dia2individual;

import java.util.Scanner;

public class EjercicioPractico2Dia2Individual {

    public static void main(String[] args) {
       /* Imagina que eres un cajero en un supermercado.
       Crea un programa en Java que permita ingresar el precio de varios productos comprados
       por un cliente.
       Utiliza una estructura repetitiva (la que quieras)
       para continuar pidiendo precios hasta que el 
       usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
       Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador
       (cuando sabemos un número exacto de productos por ejemplo) o por centinela
       (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes
       aplicar un “centinela”. 
       Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.*/
       Scanner teclado = new Scanner (System.in);
       float precio;
       float total = 0;
       

        System.out.println("Escriba 0 para terminar");   
        
        while (true){
            System.out.println("Ingresa un precio");
            precio = teclado.nextFloat();
            
        if (precio ==0) {
            break;
            }
        total += precio;
          
        }
        System.out.println("Precio total: " + total);
        System.out.println("Gracias por utilizar el sistema");
        
    }
    
}
