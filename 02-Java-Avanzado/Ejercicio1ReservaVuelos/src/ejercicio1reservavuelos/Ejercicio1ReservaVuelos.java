
package ejercicio1reservavuelos;

import java.util.InputMismatchException;
import java.util.Scanner;
import logica.ReservaInvalidaException;
import logica.ReservaVuelos;


public class Ejercicio1ReservaVuelos {


    public static void main(String[] args) {
       ReservaVuelos sistema = new ReservaVuelos();
       Scanner teclado = new Scanner(System.in);
        System.out.println("Destinos Disponibles");
        System.out.println("Madrid\nParis\nLondres ");
       
          try {
            System.out.print("Ingrese su nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese su destino: ");
            String destino = teclado.nextLine();

            System.out.print("Ingrese la fecha de viaje (YYYY-MM-DD): ");
            String fecha = teclado.nextLine();

            System.out.print("Ingrese el número de asientos: ");
            int asientos = teclado.nextInt();

            
           sistema.reservarVuelos(nombre, destino, fecha, asientos);
        } catch (ReservaInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada no válida.");
        } finally {
            teclado.close();
        }
    }
    
}
