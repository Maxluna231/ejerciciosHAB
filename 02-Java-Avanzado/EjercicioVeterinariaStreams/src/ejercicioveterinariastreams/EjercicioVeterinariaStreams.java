
package ejercicioveterinariastreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.ServicioVeterinario;


public class EjercicioVeterinariaStreams {

   
    public static void main(String[] args) {
       List<ServicioVeterinario> servicios = new ArrayList<>();
        servicios.add(new ServicioVeterinario("Consulta general", 500));
        servicios.add(new ServicioVeterinario("Vacunación", 300));
        servicios.add(new ServicioVeterinario("Desparasitación", 200));
        servicios.add(new ServicioVeterinario("Cirugía menor", 1500));
        servicios.add(new ServicioVeterinario("Consulta general", 400));
        servicios.add(new ServicioVeterinario("Emergencia", 2000));
        servicios.add(new ServicioVeterinario("Vacunación", 250));
        servicios.add(new ServicioVeterinario("Desparasitación", 180));
        servicios.add(new ServicioVeterinario("Consulta general", 350));
         
         //1. Ordenar por costo de menor a mayor
         List<ServicioVeterinario> ordenadosPorCosto = servicios.stream()
                 .sorted(Comparator.comparingDouble(ServicioVeterinario::getCosto))
                 .collect(Collectors.toList());
         
         System.out.println("Servicios ordenados por costo de menor a mayor");
         ordenadosPorCosto.forEach(System.out::println);
        
         System.out.println("-------------------------------------------------------------");
         
         //2. Ordenar por tipo de servicio y luego por costo en caso de servicio repetido
         List<ServicioVeterinario> ordenadosPorServicio = servicios.stream()
                 .sorted(Comparator.comparing(ServicioVeterinario::getTipo)
                                                        .thenComparing(ServicioVeterinario::getCosto))
                 .collect(Collectors.toList());
         
         System.out.println("Servicios ordenados por tipo y costo");
         ordenadosPorServicio.forEach(System.out::println);

         System.out.println("-------------------------------------------------------------");
         //3. Lista de servicios que valen menos de 500
         List<ServicioVeterinario> serviciosMenores500 = servicios.stream()
                 .filter(serv->serv.getCosto()<500)
                 .collect(Collectors.toList());
         
         System.out.println("Servicios con costo menor a 500");
         serviciosMenores500.forEach(System.out::println);
         System.out.println("-------------------------------------------------------------");
         //4. Lista de servicios que valen más de 500
         List<ServicioVeterinario> serviciosMayores500 = servicios.stream()
                 .filter(serv->serv.getCosto()>=500)
                 .collect(Collectors.toList());
         
         System.out.println("Servicios con costo mayor o igual a 500");
         serviciosMayores500.forEach(System.out::println);         
         System.out.println("-------------------------------------------------------------");
         //5. Promedio de costos de todos los servicios
         double promedioCostos = servicios.stream()
                 .mapToDouble(ServicioVeterinario::getCosto)
                 .average()
                 .orElse(0);
         
         System.out.println("El promedio de costos es: " + promedioCostos);
         
    }
    
}
