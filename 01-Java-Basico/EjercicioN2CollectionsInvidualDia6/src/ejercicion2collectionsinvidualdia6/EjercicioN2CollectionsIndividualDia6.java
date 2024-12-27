
package ejercicion2collectionsinvidualdia6;

import java.util.ArrayList;
import java.util.Collections;
import logica.Producto;


public class EjercicioN2CollectionsIndividualDia6 {

   
    public static void main(String[] args) {
       
        
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P001", "Teléfono", "Samsung", "Electronico", 300, 500, 20));
        productos.add(new Producto("P002", "Laptop", "Dell", "Computadora", 700, 1000, 10));
        productos.add(new Producto("P003", "Auriculares", "Sony", "Accesorio", 50, 80, 50));
        productos.add(new Producto("P004", "Cargador", "Anker", "Accesorio", 20, 40, 100));
        productos.add(new Producto("P005", "Tablet", "Apple", "Electronico", 400, 600, 15));
        productos.add(new Producto("P006", "Monitor", "LG", "Periférico", 200, 300, 25));
        productos.add(new Producto("P007", "Teclado", "Logitech", "Periferico", 30, 50, 60));
        productos.add(new Producto("P008", "Mouse", "Razer", "Periferico", 25, 45, 70));
        productos.add(new Producto("P009", "Smartwatch", "Garmin", "Electrónico", 250, 350, 30));
        productos.add(new Producto("P010", "Camara", "Canon", "Electrónico", 500, 800, 8));

        System.out.println("Productos creados y agregados al ArrayList.\n");

        Producto maxPrecioVenta = Collections.max(productos, (p1, p2) -> Double.compare(p1.getPrecioVenta(), p2.getPrecioVenta()));
        System.out.println("Producto con mayor precio de venta: " + maxPrecioVenta + "\n");

        
        Producto minPrecioCosto = Collections.min(productos, (p1, p2) -> Double.compare(p1.getPrecioCosto(), p2.getPrecioCosto()));
        System.out.println("Producto con menor precio de costo: " + minPrecioCosto + "\n");

       
        productos.remove(4);
        System.out.println("Producto en la posición 5 eliminado.\n");

        Producto maxCantidadStock = Collections.max(productos, (p1, p2) -> Integer.compare(p1.getCantidadStock(), p2.getCantidadStock()));
        System.out.println("Producto con mayor cantidad en stock: " + maxCantidadStock);
        maxCantidadStock.setCantidadStock(maxCantidadStock.getCantidadStock() - 3);
        System.out.println("Se descontaron 3 unidades del stock. Stock actualizado: " + maxCantidadStock + "\n");

       
        System.out.println("Lista de productos actualizada:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
}
