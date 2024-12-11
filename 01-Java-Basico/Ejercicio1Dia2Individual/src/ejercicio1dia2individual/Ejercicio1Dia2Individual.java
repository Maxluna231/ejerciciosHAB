/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1dia2individual;

import java.util.Scanner;

/**
 *
 * @author lunad
 */
public class Ejercicio1Dia2Individual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una recital permite únicamente el ingreso de mayores de 18 años.
        Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. 
        El programa debe mostrar (según cada caso) un mensaje informando la situación.*/
        System.out.println("Ingrese su edad");
        
        Scanner teclado = new Scanner (System.in);
        int edad = teclado.nextInt();
      
        
        
        if (edad >=18){
            System.out.println("Puede ingresar al evento :)");
        
        }else{
            System.out.println("Es menor de edad no puede ingresar al evento ):");
        
        }
    }
    
}
