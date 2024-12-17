
package ejerciciomatricesdia4;

import java.util.Scanner;
import logica.Producto;


public class EjercicioMatricesDia4 {

    public static void main(String[] args) {
          Producto[][] estanterias = new Producto[3][3];

        // Llenar la matriz con productos
        estanterias[0][0] = new Producto("Manzana", 0.5, "Frutas");
        estanterias[0][1] = new Producto("Pan", 1.2, "Panadería");
        estanterias[0][2] = new Producto("Leche", 1.5, "Lácteos");
        estanterias[1][0] = new Producto("Queso", 3.0, "Lácteos");
        estanterias[1][1] = new Producto("Jabón", 0.8, "Higiene");
        estanterias[1][2] = new Producto("Arroz", 1.0, "Granos");
        estanterias[2][0] = new Producto("Pollo", 5.5, "Carnes");
        estanterias[2][1] = new Producto("Zanahoria", 0.7, "Verduras");
        estanterias[2][2] = new Producto("Cereal", 2.5, "Desayuno");

        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Solicitar el nombre del producto a buscar
            System.out.print("Ingrese el nombre del producto a buscar: ");
            String nombreBuscado = scanner.nextLine();

            boolean encontrado = false;

            // Buscar el producto en la matriz
            for (int i = 0; i < estanterias.length; i++) {
                for (int j = 0; j < estanterias[i].length; j++) {
                    if (estanterias[i][j].getNombre().equalsIgnoreCase(nombreBuscado)) {
                        // Producto encontrado
                        System.out.println("\nProducto encontrado en la posición [" + i + "][" + j + "]:");
                        estanterias[i][j].mostrarInfo();
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) break;
            }

            if (!encontrado) {
                System.out.println("\nEl producto \"" + nombreBuscado + "\" no existe en las estanterías.");
            }

            // Preguntar si desea continuar buscando
            System.out.print("\n¿Desea buscar otro producto? (si/no): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nGracias por usar el sistema de búsqueda. ¡Hasta luego!");
        scanner.close();
    }
    
}
