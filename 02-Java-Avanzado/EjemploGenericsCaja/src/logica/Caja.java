
package logica;


 public class Caja <T> {
    private T contenido;
    
    public void poner(T contenido){
    this.contenido = contenido;
   
    }
    public T sacar(){
    return contenido;
    }
    
}
