
package logica;


public class MiHilo extends Thread {
    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
       
        for(int i=0; i<5;i++){
            System.out.println("hilo" + nombre + "Estoy en la vuelta" + i);
        }
        
    }
    
    
}
