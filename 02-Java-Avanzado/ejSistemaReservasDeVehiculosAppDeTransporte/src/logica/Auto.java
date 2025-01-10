
package logica;

public class Auto {
    
    private int capacidad;

    public Auto(int capacidad) {
        this.capacidad = capacidad;
    }
    
     @Override
    public String toString(){
    return "Auto con capacidad para " + capacidad + "Pasajeros ";
    }
}
