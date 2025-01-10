
package ejemplogenericscaja;

import logica.Caja;
import logica.Legajo;


public class EjemploGenericsCaja {

    public static void main(String[] args) {
        
     Caja <String> cajaString = new Caja<>();
     cajaString.poner("Texto");
     String contenido = cajaString.sacar();
     
     Caja <Integer> cajaInt = new Caja<>();
     cajaInt.poner(14);
     int num = cajaInt.sacar();
     
     Caja <Legajo> cajaLegajo = new Caja<>();
     cajaLegajo.poner(new Legajo(123, "Lejago de empleado"));
     Legajo legaj = cajaLegajo.sacar();
     
     
    }
    
}
