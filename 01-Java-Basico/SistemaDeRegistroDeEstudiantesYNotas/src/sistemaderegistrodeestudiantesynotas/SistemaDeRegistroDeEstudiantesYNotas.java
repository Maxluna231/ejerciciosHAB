
package sistemaderegistrodeestudiantesynotas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SistemaDeRegistroDeEstudiantesYNotas {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Map<Integer,Double> listaPromedios = new HashMap<>();
        
        listaPromedios.put(1, 9.9);
        listaPromedios.put(2, 8.0);
        listaPromedios.put(3, 7.0);
        listaPromedios.put(4, 6.0);
        
        System.out.println("Ingrese un promedio a buscar");
        
        if(teclado.hasNextDouble()) {
        double promedioBuscado = teclado.nextDouble();
        boolean encontrado = false;
        
        for(Map.Entry<Integer, Double> entrada: listaPromedios.entrySet()){
        if(entrada.getValue() == promedioBuscado) {
            System.out.println("Estudiante encontrado " + entrada.getKey() + "Promedio " + entrada.getValue());
            encontrado = true;
         }
        }
        
        if(!encontrado){}
            System.out.println("No encontrado");
        }else{
            System.out.println("Ingresa un numero decimal");
        }
         
        
        
    }
    
}
