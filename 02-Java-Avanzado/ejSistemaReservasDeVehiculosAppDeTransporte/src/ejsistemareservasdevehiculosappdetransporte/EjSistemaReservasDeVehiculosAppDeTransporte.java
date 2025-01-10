
package ejsistemareservasdevehiculosappdetransporte;

import logica.Auto;
import logica.Bicicleta;
import logica.Moto;
import logica.Reserva;

public class EjSistemaReservasDeVehiculosAppDeTransporte {

    public static void main(String[] args) {
        Auto auto = new Auto(3);
        Moto moto = new Moto();
        Bicicleta bicicletaElectrica = new Bicicleta(true);
        Bicicleta bicicletaManual = new Bicicleta(false);
        
       Reserva <Auto> reservaAuto = new Reserva<>(auto,"online");
       Reserva <Moto> reservaMoto = new Reserva<>(moto,"presencial");
       Reserva<Bicicleta> reservaBicicletaElectrica = new Reserva<>(bicicletaElectrica, "online");
       Reserva<Bicicleta> reservaBicicletaManual = new Reserva<>(bicicletaManual, "presencial");
       
       reservaAuto.procesarReserva();
       reservaMoto.procesarReserva();
       reservaBicicletaElectrica.procesarReserva();
       reservaBicicletaManual.procesarReserva();
       
    }
    
}
  