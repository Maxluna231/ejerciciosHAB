
package ejercicio2manejoinventarioscomercio;

import java.util.InputMismatchException;
import java.util.Scanner;
import logica.Inventario;
import logica.ProductoInvalidoException;


public class Ejercicio2ManejoInventariosComercio {

   
    public static void main(String[] args) {
         Inventario sistema = new Inventario();
        Scanner scanner = new Scanner(System.in);

        try {
            // Probar el sistema de inventario
            System.out.print("Ingrese el nombre del producto: ");
            String productoNombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = scanner.nextInt();

           sistema.agregarProducto(productoNombre, precio, cantidad);
            sistema.mostrarInventario();

        } catch (ProductoInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
    
}
