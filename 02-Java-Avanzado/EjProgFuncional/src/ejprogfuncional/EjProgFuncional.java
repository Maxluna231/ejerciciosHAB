
package ejprogfuncional;

import java.util.ArrayList;
import java.util.List;


public class EjProgFuncional {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(35);
        listaNumeros.add(23);
        listaNumeros.add(64);
        
        //Recorrer la lista
        //Multiplicar por 2 cada numero
        //mostrar por pantalla
        //a la antigua
        //
        System.out.println("----Clasico----");
        multiplicarNumeros(listaNumeros);
        
        //simplificar esto con lambdas
        System.out.println("----Con lambdas----");
        listaNumeros.forEach(numero -> System.out.println(numero * 2));
        }
        
        public static void multiplicarNumeros(List<Integer>listaNumeros){
        for (int numero:listaNumeros) {
            System.out.println(numero * 2);
        }
      }
    }

