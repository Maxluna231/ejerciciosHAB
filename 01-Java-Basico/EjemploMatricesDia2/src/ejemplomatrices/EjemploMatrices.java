
package ejemplomatrices;

import java.util.Scanner;


public class EjemploMatrices {

    
    public static void main(String[] args) {
       int edades [][] = new int[3][2];
       
       edades[0][0] = 15;
       edades[0][1] = 35;
       edades[1][0] = 35;
       edades[1][1] = 35;
       edades[2][0] = 35;
       edades[2][1] = 35;
       
       Scanner teclado = new Scanner(System.in);
       
       //cargar por teclado
       for(int f=0; f<edades.length;f++){
          for (int c=0; c<edades[0].length;c++){
           System.out.println("Ingrese el valor para la fila: " + f + "columna" + c);
           edades[f][c] = teclado.nextInt();
         }
       }
    }
}
