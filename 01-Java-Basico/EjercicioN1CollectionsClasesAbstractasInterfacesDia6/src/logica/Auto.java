
package logica;

import java.util.Calendar;
import logica.Vehiculo.Electrico;


public class Auto extends Vehiculo implements Electrico{
   private int capacidadBateria;  
   private int autonomia; 

    public Auto(int capacidadBateria, int autonomia, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
    
    
    @Override
    public int calcularAntiguedad() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        return anioActual - getAnio();
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando la batería del auto eléctrico (" + capacidadBateria + " mAh). Tiempo estimado: " + autonomia + " horas.");
    }

    @Override
    public String toString() {
               return super.toString() + ", Capacidad Batería: " + capacidadBateria + " mAh, Autonomía: " + autonomia + " horas";
    }
    
}
