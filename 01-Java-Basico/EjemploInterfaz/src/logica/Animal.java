
package logica;

public abstract class Animal {
  
    String nombre;
    String color;

    protected Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public abstract void comer();
    
}
