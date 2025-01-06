
package logica;

import java.util.HashMap;
import java.util.Map;


public class ReservaVuelos {
    private Map<String, Integer> vuelosDisponibles;
    
    public ReservaVuelos() {
        vuelosDisponibles = new HashMap<>();
        vuelosDisponibles.put("Madrid", 50);
        vuelosDisponibles.put("París", 30);
        vuelosDisponibles.put("Londres", 20);
    }
         // Método para reservar un vuelo
    public void reservarVuelos(String nombre, String destino, String fecha, int asientos) throws ReservaInvalidaException {
       
        if (nombre == null || nombre.isEmpty()) {
            throw new ReservaInvalidaException("El nombre no puede estar vacío.");
        }
        if (destino == null || destino.isEmpty()) {
            throw new ReservaInvalidaException("El destino no puede estar vacío.");
        }
        if (fecha == null || fecha.isEmpty()) {
            throw new ReservaInvalidaException("La fecha no puede estar vacía.");
        }
        if (asientos <= 0) {
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero.");
        }

        if (!vuelosDisponibles.containsKey(destino)) {
            throw new ReservaInvalidaException("Destino no disponible.");
        }

       
        int asientosDisponibles = vuelosDisponibles.get(destino);
        if (asientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para " + destino + ".");
        }

        // Realizar la reserva
        vuelosDisponibles.put(destino, asientosDisponibles - asientos);
        System.out.println("Reserva confirmada para " + nombre + ". Destino: " + destino + ", Fecha: " + fecha + ", Asientos: " + asientos);
    }
    
}
