
package ejercicio2clasesanonimas;


import logica.PrecioReserva;
import logica.Reserva;


public class Ejercicio2ClasesAnonimas {

  
    public static void main(String[] args) {
      
       Reserva reserva = new Reserva();
       
       double valorBase = 1000.0;
   
 // Clase anónima para descuento del 10% para clientes con membresía
        PrecioReserva descuentoMembresia = new PrecioReserva() {
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase * 0.10; // 10% de descuento
            }
        };

        // Clase anónima para descuento del 20% en temporada baja
        PrecioReserva descuentoTemporadaBaja = new PrecioReserva() {
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase * 0.20; // 20% de descuento
            }
        };

        // Clase anónima para precio fijo (sin descuento) para reservas de última hora
        PrecioReserva precioFijoUltimaHora = new PrecioReserva() {
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase; // Sin descuento
            }
        };

       
        System.out.println("Precio con descuento por membresía: $" + reserva.realizarReserva(valorBase, descuentoMembresia));
      
        System.out.println("Precio con descuento por temporada baja: $" + reserva.realizarReserva(valorBase, descuentoTemporadaBaja));

        System.out.println("Precio para reservas de última hora: $" + reserva.realizarReserva(valorBase, precioFijoUltimaHora));
    }
}

