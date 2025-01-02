
package logica;

public class MiRunnable implements Runnable {
    Sincronizar ejemplo = new Sincronizar();
    
    
     @Override
    public void run() {
        for(int i=0; i<5;i++){
            System.out.println( "Estoy en la vuelta" + i);
            ejemplo.incrementar();
        }
        
    }
}
