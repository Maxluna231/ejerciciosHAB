
package logica;


public class Persona {
    String nombre;
    
    public void saludar(){
        System.out.println("Hola, mi nombres " + nombre);
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
