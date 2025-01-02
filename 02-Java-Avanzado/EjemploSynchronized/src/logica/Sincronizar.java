
package logica;


public class Sincronizar {
    private int contador = 0;
    
    
    public synchronized void incrementar () {
    contador++;
        System.out.println("Estoy en el valor: " + contador);
    }
    
    public synchronized int obtenerContador () {
    return contador;
    
    }
}
