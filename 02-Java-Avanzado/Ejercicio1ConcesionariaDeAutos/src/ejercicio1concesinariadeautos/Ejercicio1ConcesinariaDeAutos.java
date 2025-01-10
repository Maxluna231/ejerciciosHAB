
package ejercicio1concesinariadeautos;

import java.util.List;
import logica.Auto;
import logica.InventarioAutos;


public class Ejercicio1ConcesinariaDeAutos {

    
    public static void main(String[] args) {
        InventarioAutos inventario = new InventarioAutos();

        // Agregar autos al inventario
        inventario.agregarAuto(new Auto("Toyota", "Corolla", 2020, 20000));
        inventario.agregarAuto(new Auto("Honda", "Civic", 2018, 18000));
        inventario.agregarAuto(new Auto("Ford", "Mustang", 2021, 30000));
        inventario.agregarAuto(new Auto("Toyota", "Camry", 2020, 25000));

        
        System.out.println("\nAutos marca Toyota:");
        List<Auto> toyotas = inventario.buscarPorMarca("Toyota");
        toyotas.forEach(System.out::println);

       
        System.out.println("\nAutos del año 2020:");
        List<Auto> autos2020 = inventario.buscarPorAño(2020);
        autos2020.forEach(System.out::println);

 
        double valorTotal = inventario.calcularValorTotal();
        System.out.printf("\nValor total del inventario: %.2f\n", valorTotal);
      }
     }
    

