
package logica;

public class Legajo {
    private int numLegajo;
    private String nombre;

    public Legajo() {
    }

    public Legajo(int numLegajo, String nombre) {
        this.numLegajo = numLegajo;
        this.nombre = nombre;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
