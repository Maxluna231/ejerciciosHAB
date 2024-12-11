
package ejemplowhile;

import java.util.Scanner;


public class EjemploWhile {


    public static void main(String[] args) {
        // Crear un programa que cuente de 0 a 10
        
        /*int cont = 0;
        
        while(cont<=10){
            System.out.println("Estoy en el numero:" + cont);
           // cont = cont +1;
           cont++;
        }*/
        
        /*Crear un programa que permita ingresar las edades de personas y que para su ejecucion al encontrar una persona
        mayor a 70 años*/
        
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        
        int edad = teclado.nextInt();
        
        while(edad<=70){
            System.out.println("Ingrese su edad");
            edad = teclado.nextInt();
        }
        System.out.println("Persona encontrada");
    }
    
}
