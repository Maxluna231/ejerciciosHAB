
package ejercicioifdia1;

import java.util.Scanner;


public class EjercicioIFDia1 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese su peso");
        double numero1 = teclado.nextInt();
        
        double resta = 100;
        
        if(100 <= numero1 ){
        System.out.println("Si puede subirse :)");
        }else{
            
        double exceso = numero1 - resta; // Calcula el exceso
       System.out.println("No puede subirse, excede el límite por " + exceso + " kilos.");
        
        }
    }
    
}
