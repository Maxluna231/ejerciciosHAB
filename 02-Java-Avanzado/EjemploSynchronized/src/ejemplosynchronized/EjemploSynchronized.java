
package ejemplosynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.MiRunnable;
import logica.Sincronizar;

public class EjemploSynchronized {

    public static void main(String[] args) {
      
       
       Thread hilo1 = new Thread (new MiRunnable());
       
       Thread hilo2 = new Thread (new MiRunnable());
       
       hilo1.start();
       hilo2.start();
       
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploSynchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
    }
    
}
