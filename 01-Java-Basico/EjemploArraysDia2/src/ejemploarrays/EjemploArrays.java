
package ejemploarrays;

import java.util.Scanner;

public class EjemploArrays {

    public static void main(String[] args) {
        // vectores arreglos unidimencionales
        //declaraciones un vector
        //inicializamos nuestro vector
        
       int numeros[] = new int[5];
       
       //cargar vector maunualmente
       numeros[0] = 32;
       numeros[1] = 12;
       numeros[2] = 25;
       numeros[3] = 75;
       numeros[4] = 890;
       
       //Carga mediante teclado
        System.out.println("ingrese numeros a guardar");
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0;i<=4;i++){
        numeros[i]= teclado.nextInt();
        }
       
        //Recorrido Vector
        for(int i=0;i<=4;i++){
            System.out.println("El valor guardado en el indice;" + i  + " es: " + numeros[i] );
        }
    }
    
}
