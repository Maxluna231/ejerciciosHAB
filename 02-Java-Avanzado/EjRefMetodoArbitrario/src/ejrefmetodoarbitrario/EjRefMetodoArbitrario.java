
package ejrefmetodoarbitrario;

import java.util.ArrayList;
import java.util.List;
import logica.Persona;


public class EjRefMetodoArbitrario {

  
    public static void main(String[] args) {
        List<Persona>listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Maria"));
        listaPersonas.add(new Persona("Flor"));
        listaPersonas.add(new Persona("Alex"));
          
        listaPersonas.forEach(Persona::saludar);
        
        //codigo formal
        for(Persona per: listaPersonas){
        per.saludar();
        }
    }
    
}
