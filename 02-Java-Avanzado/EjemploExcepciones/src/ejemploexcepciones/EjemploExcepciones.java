
package ejemploexcepciones;

import java.util.Scanner;
import logica.ExcepcionDatoIncorrecto;


public class EjemploExcepciones {

   
    public static void main(String[] args) throws ExcepcionDatoIncorrecto {
        int dato = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un dato por teclado. El mismo que sea numero entre 1 y 10");
        dato = teclado.nextInt();
        
        
        if(dato <=0 || dato>=10){
        throw new ExcepcionDatoIncorrecto("Ingreso un valor no valido");
        
        }
    }
    
}
