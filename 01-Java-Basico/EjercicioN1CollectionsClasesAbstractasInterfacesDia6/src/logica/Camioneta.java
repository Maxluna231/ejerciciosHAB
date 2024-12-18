
package logica;

import java.util.Calendar;
import logica.Vehiculo.Combustion;


public class Camioneta extends Vehiculo implements Combustion {
    
    private double capacidadTanque; 
    private double consumoCombustible; 

    public Camioneta(double capacidadTanque, double consumoCombustible, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }
    
    
    
    @Override
    public int calcularAntiguedad() {
         int anioActual = Calendar.getInstance().get(Calendar.YEAR);
         return anioActual - getAnio();
    }

    @Override
    public void recargarCombustible() {
         System.out.println("Recargando el tanque de la camioneta. Capacidad: " + capacidadTanque + " litros.");
    }

    @Override
    public String toString() {
       return super.toString() + ", Capacidad Tanque: " + capacidadTanque + " litros, Consumo: " + consumoCombustible + " L/100km";
    }
    
}
