
package ejrefmetodoestatico;

import java.util.function.Function;


public class EjRefMetodoEstatico {

    
    public static void main(String[] args) {
       //convertir un entero a un string
       //con lambdas
       //(int num)-> String.valueOf(num);
       
       //referencia a metodos
       //String::valueOf;
       
        //Function<Integer, String> convertidor1 = (num)-> String::valueOf(num);
        
       //Referencia a metodos
        Function<Integer, String> convertidor = String::valueOf;
        System.out.println("El valor de salida es: "+ convertidor.apply(35));
        
        //Normal
        String resultado = String.valueOf(35);
        System.out.println("El valor de salida es" + resultado);
    }
    
}
