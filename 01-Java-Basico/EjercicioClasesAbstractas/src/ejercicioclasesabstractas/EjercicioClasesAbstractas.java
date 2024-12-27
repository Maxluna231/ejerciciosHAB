
package ejercicioclasesabstractas;

import logica.Nintendo64;
import logica.PlayStation2;
import logica.XboxOne;


public class EjercicioClasesAbstractas {

    public static void main(String[] args) {
   // crear las instancias
   Nintendo64  nintendo64 = new Nintendo64();
   PlayStation2 playstation2 = new PlayStation2();
   XboxOne xboxOne = new XboxOne();
   

        nintendo64.cargarJuego();
        nintendo64.leerCartucho("Banjo Kazooie");

     
        playstation2.cargarJuego();
        playstation2.leerDvd("Fifa 2009");
        playstation2.grabarEnMemory();

     
        xboxOne.cargarJuego();
        xboxOne.leerJuegoDigital("GTA V");
   
    }
    
}
