
package logica;

import java.util.Calendar;
import logica.Vehiculo.Combustion;

public class Moto extends Vehiculo implements Combustion{
    private int cilindrada; 
    private String tipoMotor;

    public Moto(int cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        return anioActual - getAnio();
    }

    @Override
    public void recargarCombustible() {
           System.out.println("Recargando el tanque de la moto. Motor: " + tipoMotor + ", Cilindrada: " + cilindrada + " cc.");
    
      }

    @Override
    public String toString() {
         return super.toString() + ", Cilindrada: " + cilindrada + " cc, Tipo Motor: " + tipoMotor;
    }
    
     }
    
    


