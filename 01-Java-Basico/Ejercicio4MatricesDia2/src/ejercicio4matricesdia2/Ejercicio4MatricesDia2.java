
package ejercicio4matricesdia2;

import java.util.Scanner;

public class Ejercicio4MatricesDia2 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       char  [][] asientos = new char [5][5]; //matris
       
       
       for(int i = 0; i<asientos.length;i++){
        for(int j = 0; j<asientos.length;j++){
        asientos[i][j] = 'O';
        }
       }
       
       
       boolean continuar = true;
       
       // mostrar asientos
    
     while(continuar){
            System.out.println("---Asientos---");
            System.out.println("Uno Dos Tres Cuatro Cinco");
            for(int i=0;i<asientos.length;i++){
             for(int j=0;j<asientos[i].length;j++){   
                 System.out.print(asientos[i][j] + "    ");
                 
             }
             System.out.println();
            }     
            
        System.out.println("Eliga la fila 1 al 5");
        int fila = teclado.nextInt() -1;
        System.out.println("Ingrese el asiento del 1 al 5");
        int asiento = teclado.nextInt() -1;
        
        //asientos validos si o no 
        
         if (fila < 0 || fila >= 5 || asiento < 0 || asiento >= 5) {
                System.out.println("Fila o asiento inválido. Por favor, intente de nuevo.");
                continue;
               
            }
              // Verificar si el asiento está ocupado
            if (asientos[fila][asiento] == 'X') {
                System.out.println("El asiento ya está ocupado. Por favor, elija otro.");
            } else {
                // Marcar el asiento como ocupado
                asientos[fila][asiento] = 'X';
                System.out.println("Reserva realizada con éxito.");
            }
            System.out.println("Quiere reservar otro asiento s/n?");
            char respuesta = teclado.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                continuar = false;
            }
            
            
        }
        System.out.println("Gracias por usar sistema");
    }
    }
     
  

