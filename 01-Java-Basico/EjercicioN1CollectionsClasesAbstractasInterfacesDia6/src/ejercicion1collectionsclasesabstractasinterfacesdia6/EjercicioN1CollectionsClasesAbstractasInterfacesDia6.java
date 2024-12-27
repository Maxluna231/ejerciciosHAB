
package ejercicion1collectionsclasesabstractasinterfacesdia6;

import java.util.ArrayList;
import logica.Auto;
import logica.Camioneta;
import logica.Interfaces.Combustion;
import logica.Interfaces.Electrico;
import logica.Moto;
import logica.Vehiculo;

public class EjercicioN1CollectionsClasesAbstractasInterfacesDia6 {

    public static void main(String[] args) {
          ArrayList<Vehiculo> vehiculos = new ArrayList<>();
          
          Auto autoElectrico = new Auto(12, 0, 1, "ABC123", "Tesla", "Modelo1 ", 2000, 20000);
          Camioneta camionetaCombustion = new Camioneta(80, 8, 2, "DEF456", "Toyota", "Hilux", 2010,54000);
          Moto motoCombustion = new Moto(321, "4 tiempos",3, "GHI876", "Yamaha", "R3", 1990, 34500);
          
        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaCombustion);
        vehiculos.add(motoCombustion);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            System.out.println();
        }
    }
    
}
