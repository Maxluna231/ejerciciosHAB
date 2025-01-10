
package ejerciciointegradorlambdasstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.Vehiculo;

public class EjercicioIntegradorLambdasStreams {

    
    public static void main(String[] args) {
      List<Vehiculo> carros = new ArrayList<>();
   carros.add(new Vehiculo("Vado", "Fiesta", 1000));
   carros.add(new Vehiculo("Vado", "Enfocar", 1200));
   carros.add(new Vehiculo("Vado", "Explorador", 2500));
   carros.add(new Vehiculo("Fiat", "Uno", 500));
   carros.add(new Vehiculo("Fiat", "Cronos", 1000));
   carros.add(new Vehiculo("Fiat", "Turín", 1250));
   carros.add(new Vehiculo("Chevrolet", "Aveo", 1250));
   carros.add(new Vehiculo("Chevrolet", "Girar", 2500));
   carros.add(new Vehiculo("Toyota", "Corola", 1200));
   carros.add(new Vehiculo("Toyota", "Fortuna", 3000));
   carros.add(new Vehiculo("Renault", "Logan", 950));

    //1.Ordenar de menor a mayor
    List<Vehiculo> ordenadosPorCosto = carros.stream()
            .sorted(Comparator.comparingDouble(Vehiculo::getCosto).reversed())
            .collect(Collectors.toList());
    
        System.out.println("Carros ordenados por costo de menor a mayor");
        ordenadosPorCosto.forEach(System.out::println);
        
       System.out.println("-------------------------------------------------------------");
   
    //2. Ordenar marca y precio
    
    List<Vehiculo> ordenadosCarro = carros.stream()
            .sorted(Comparator.comparing(Vehiculo::getMarca)
                   .thenComparing(Vehiculo::getCosto))
                   .collect(Collectors.toList());
    
        System.out.println("Servicios ordenados por marca y costo");
        ordenadosCarro.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
            
       //3. Lista de servicios con precio no mayor a 1000
       List<Vehiculo>precioMenor = carros.stream()
               .filter(veh->veh.getCosto()<1000)
               .collect(Collectors.toList());
       
        System.out.println("Carros con costo menor a 1000");
        precioMenor.forEach(System.out::println);
        
        
         //4. Lista de servicios con precio iguaal o mayor a 1000
         List<Vehiculo>precioMayor = carros.stream()
               .filter(veh->veh.getCosto()>=1000)
               .collect(Collectors.toList());
       
        System.out.println("Carros con costo igual o mayor a 1000");
        precioMenor.forEach(System.out::println);
       
       System.out.println("-------------------------------------------------------------");
       
       //5. PrecioTotal
       double SumaCostos = carros.stream()
               .mapToDouble(Vehiculo::getCosto)
               .average()
               .orElse(0);
       
        System.out.println("El costo de los coches es: " + SumaCostos);
        
         // Filtrar vehículos de marca Chevrolet y Fiat
        List<Vehiculo> chevroletYFiat = carros.stream()
                .filter(vehi -> vehi.getMarca().equals("Chevrolet") || vehi.getMarca().equals("Fiat"))
                .collect(Collectors.toList());
        System.out.println("\nVehículos de marca Chevrolet y Fiat:");
        chevroletYFiat.forEach(System.out::println);

        System.out.println("----------------------------------------------");
        
        // Filtrar vehículos cuyo modelo contenga al menos una letra "c"
        List<Vehiculo> modelosConLetraC = carros.stream()
                .filter(vehi -> vehi.getModelo().toLowerCase().contains("c"))
                .collect(Collectors.toList());
        System.out.println("\nVehículos cuyos modelos contienen la letra 'c':");
        modelosConLetraC.forEach(System.out::println);
        
        
    }
    
}
