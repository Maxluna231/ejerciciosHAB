
package ejemplostreams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class EjemploStreams {

  
    public static void main(String[] args) {
        //Lista de paises
        List<String> paises = Arrays.asList(
        
        "España","Mexico","Argentina","Francia","Italia",
                "Alemania","Portugal","chile","Colombia","Peru"
        );
        
        //filtrar por los paise que tengan una letra "a"
        paises.stream()
                .filter(pais-> pais.toLowerCase().contains("a"))
                .forEach(System.out::println);
    }
    
}
