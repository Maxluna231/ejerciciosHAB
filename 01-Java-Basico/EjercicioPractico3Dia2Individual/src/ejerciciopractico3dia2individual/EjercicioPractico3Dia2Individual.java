
package ejerciciopractico3dia2individual;

import java.util.Scanner;

public class EjercicioPractico3Dia2Individual {

    public static void main(String[] args) {
        /*Una web de meteorología necesita de un programa que,al ingresar las 7 temperaturas
        máximas de la última semana,calcule la temperatura máxima promedio que hubo.
        
        Para ello, deberá manejar un vector donde en cada posición se almacene 
        la correspondiente temperatura máxima de cada día. Una vez almacenadas las
        temperaturas, deberá calcular el promedio de las mismas recorriendo el vector 
        y mostrando el resultado por pantalla.*/
        Scanner teclado = new Scanner (System.in);
        int [] temperatura = new int [7];
        int total= 0;
        
        System.out.println("Ingrese las temperaturas maximas de la ultima semana");
        
        for(int i = 0; i <temperatura.length;i++){
            System.out.print("Día " + (i + 1) + ": ");
            temperatura[i] = teclado.nextInt(); 
            total += temperatura[i];
        }
         float promedio = (float)total / temperatura.length;
        System.out.println("La temperatura maxima promedio de la ultima semana es: " + promedio);
    }
    
}
