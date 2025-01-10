
package ejpagos;

import logica.Cripto;
import logica.Dolar;
import logica.Euro;
import logica.Pago;
import logica.Paypal;
import logica.Tarjeta;
import logica.Transferencia;

public class EjPagos {

   
    public static void main(String[] args) {
        
        Pago<Dolar,Transferencia> pagoDolares = new Pago<>(new Dolar(),500.0,new Transferencia());
        Pago<Euro,Paypal> pagoEuro = new Pago<>(new Euro(),500.0,new Paypal());
        Pago<Cripto,Tarjeta> pagoCripto =new Pago<>(new Cripto(),500.50,new Tarjeta());
        
        pagoDolares.procesarPago();
        pagoEuro.procesarPago();
        pagoCripto.procesarPago();
    }
    
}
