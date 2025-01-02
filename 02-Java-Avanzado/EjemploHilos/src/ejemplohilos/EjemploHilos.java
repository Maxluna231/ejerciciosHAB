/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohilos;

import logica.MiHilo;

/**
 *
 * @author lunad
 */
public class EjemploHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear hilos mediante una clase Llamada Thread
        MiHilo hilo = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");
        
        
        hilo.start();
        hilo2.start();
        hilo3.start();
    }
    
}
