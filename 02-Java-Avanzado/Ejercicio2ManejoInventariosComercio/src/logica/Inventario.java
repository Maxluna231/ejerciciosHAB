
package logica;

import java.util.HashMap;
import java.util.Map;


public class Inventario {
     private Map<String, Producto> inventario;
     
        public Inventario() {
        inventario = new HashMap<>();
    }
      
         public void agregarProducto(String nombre, double precio, int cantidad) throws ProductoInvalidoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new ProductoInvalidoException("El nombre del producto no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio debe ser mayor que cero.");
        }
        if (cantidad < 0) {
            throw new ProductoInvalidoException("La cantidad no puede ser negativa.");
        }

        if (inventario.containsKey(nombre)) {
            Producto productoExistente = inventario.get(nombre);
            productoExistente.setCantidad(productoExistente.getCantidad() + cantidad);
        } else {
            inventario.put(nombre, new Producto(nombre, precio, cantidad));
        }
        System.out.println("Producto agregado/actualizado: " + nombre);
    }

    public void mostrarInventario() {
        for (Producto producto : inventario.values()) {
            System.out.println(producto);
        }
    }
}
