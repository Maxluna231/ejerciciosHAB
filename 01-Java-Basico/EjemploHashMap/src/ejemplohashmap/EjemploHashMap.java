
package ejemplohashmap;

import java.util.HashMap;
import java.util.Map;


public class EjemploHashMap {


    public static void main(String[] args) {   
        //primitivo    clase especial
        //int            Integer
        //double         Double
        //boolean        Boolean
        //--             String
        //Crear un hasMap
        Map<Integer, Double > estaturas = new HashMap<>();
   
        //Agregar Estaturas
        estaturas.put(1, 1.79);
        estaturas.put(2, 1.67);
        estaturas.put(3, 1.58);
        estaturas.put(4, 1.95);
        
        //Busqueda obtener un dato que esta
        double estatura = estaturas.get(3);
        
        //Busqueda por key
        boolean estaOno = estaturas.containsKey("1.54");
        
        System.out.println(estaOno);
        System.out.println(estaturas);
    }
    
}
