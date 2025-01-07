
package ejerciciotiendaanonima;

import logica.Descuento;
import logica.Compra;


public class EjercicioTiendaAnonima {

    public static void main(String[] args) {
         Compra compra = new Compra();
         double precioOriginal = 350;
        //Clase Anonima para el nuevo cliente 5% de descuento
           Descuento ClienteNuevo = new Descuento () {
          @Override
        public double aplicarDescuento(double precioOriginal){
        return precioOriginal - (precioOriginal*0.5);
         }
        };
        //Clase Anonima para el cliente frecuente 10& de descuento
           Descuento ClienteFrecuente = new Descuento () {
          @Override
        public double aplicarDescuento(double precioOriginal){
        return precioOriginal - (precioOriginal*0.10);
         }
        };
        //Clase anonima para el cliente VIP 20% de descuento
           Descuento clienteVip = new Descuento() {
          @Override
        public double aplicarDescuento(double precioOriginal){
        return precioOriginal - (precioOriginal*0.20);
         }
        };
           
           compra.mostrarPrecioFinal(precioOriginal,ClienteNuevo);
    }
    
}
