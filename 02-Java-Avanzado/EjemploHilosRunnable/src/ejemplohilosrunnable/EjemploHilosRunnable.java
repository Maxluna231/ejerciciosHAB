
package ejemplohilosrunnable;

import logica.MiHilo;


public class EjemploHilosRunnable {

    public static void main(String[] args) {
       Runnable miRunnable = new MiHilo();
       
       Thread hilo = new Thread(miRunnable);
       hilo.start();
       
    }
    
}
