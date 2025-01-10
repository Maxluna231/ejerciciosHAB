
package logica;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventarioAutos {
    
private List<Auto> inventario;

    // Constructor
    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    
    public void agregarAuto(Auto auto) {
        inventario.add(auto);
        System.out.println("Auto agregado: " + auto);
    }


    public List<Auto> buscarPorMarca(String marca) {
        return inventario.stream()
                         .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                         .collect(Collectors.toList());
    }

   
    public List<Auto> buscarPorAño(int año) {
        return inventario.stream()
                         .filter(auto -> auto.getAño() == año)
                         .collect(Collectors.toList());
    }
    
    
    public double calcularValorTotal() {
        return inventario.stream()
                         .mapToDouble(Auto::getPrecio)
                         .sum();
    }
}
