
package ejerciciolistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Articulo;

public class EjercicioListas {
    public static void main(String[] args) {
        ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
        
        JOptionPane.showMessageDialog(null,"Bienvenido");
        String[] opciones = {"Ingresar Articulo", "Buscar Articulo", "Salir"};
        int opcionSeleccionada;
        
         do {
            opcionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú de Tienda Electrónica",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcionSeleccionada) {
                case 0: 
                    ingresarArticulo(listaArticulos);
                    break;

                case 1: 
                    buscarArticulo(listaArticulos);
                    break;

                case 2: // Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. :)");
                    break;

                default: 
                    opcionSeleccionada = 2;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    break;
            }
        } while (opcionSeleccionada != 2);
    }

    // Método para ingresar productos
    public static void ingresarArticulo(ArrayList<Articulo> listaProductos) {
        while (true) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto (o 'Fin' para volver al menú):");
            if (nombre == null || nombre.equalsIgnoreCase("Fin")) {
                break;
            }
            String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del producto:");
            if (marca == null || marca.trim().isEmpty()) {
                marca = "Sin marca";
            }
            String precioString = JOptionPane.showInputDialog(null, "Ingrese el precio del producto:");
            double precio = 0.0;
            try {
                precio = Double.parseDouble(precioString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio inválido. Se asignará $0.0");
            }

            listaProductos.add(new Articulo(nombre.trim(), marca.trim(), precio));
            JOptionPane.showMessageDialog(null, "Producto agregado con éxito.");
        }
    }

    // Método Articulos
    public static void buscarArticulo(ArrayList<Articulo> listaProductos) {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de productos está vacía. Agregue productos primero.");
            return;
        }

        while (true) {
            String nombreBusqueda = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a buscar (o 'Fin' para volver al menú):");
            if (nombreBusqueda == null || nombreBusqueda.equalsIgnoreCase("Fin")) {
                break;
            }

            boolean encontrado = false;
            for (Articulo producto : listaProductos) {
                if (producto.getNombre().equalsIgnoreCase(nombreBusqueda.trim())) {
                    JOptionPane.showMessageDialog(null, producto.getInfo());
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "El producto no se encuentra. ¿Desea buscar otro?",
                    "Producto no encontrado",
                    JOptionPane.YES_NO_OPTION
                );
                if (respuesta == JOptionPane.NO_OPTION) {
                    break;
                }
            }
        }
      }
    }
    

