
package ejrefmetodoconstructor;

import java.util.function.BiFunction;
import logica.Persona;


public class EjRefMetodoConstructor {

   
    public static void main(String[] args) {
        //Referencia al constructor de Persona
        BiFunction<String,Integer,Persona> constructor = Persona::new;
        
        Persona pers = constructor.apply("max", 23);
        System.out.println(pers);
        
        //forma normal
        Persona pers1 = new Persona("Max",23);
        System.out.println(pers1);
    }
    
}
