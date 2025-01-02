
package logica;

public class MiHilo implements Runnable{
  
    @Override
    public void run() {
        for(int i=0; i<5;i++){
            System.out.println( "Estoy en la vuelta" + i);
        }
        
    }
    
}
