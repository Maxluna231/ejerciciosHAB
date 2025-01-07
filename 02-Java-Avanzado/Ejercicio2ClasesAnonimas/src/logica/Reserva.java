
package logica;

public class Reserva {
     public double realizarReserva(double valorBase, PrecioReserva estrategiaPrecio) {
        return estrategiaPrecio.calcularPrecio(valorBase);
    }
}
