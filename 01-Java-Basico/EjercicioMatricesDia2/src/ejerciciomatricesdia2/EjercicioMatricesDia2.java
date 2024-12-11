
package ejerciciomatricesdia2;

import java.util.Scanner;


public class EjercicioMatricesDia2 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
        
        int[] numeros = new int[15];
        
        int cont = 0;
        
        for(int i = 0; i< numeros.length; i++){
              System.out.print("Número " + ": ");
              numeros[i] = teclado.nextInt();
            
            //incrementar si es 7
            if(numeros[i] == 7){
            cont++;
            }
        }  
        System.out.println("se ingreso el numero " + cont + " Veces");
        teclado.close();
    }
    
}
