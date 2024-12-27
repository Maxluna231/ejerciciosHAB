
package ejercicioherenciadia5;

import logica.Auto;
import logica.Moto;
import logica.Vehiculo;


public class EjercicioHerenciaDia5 {

    
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Carro","DU",200);
        Auto auto = new Auto(2 ,"Toyota ","cupra ",2000);
        Moto moto = new Moto (4,"Indian","chooter",2010);
        
        
        System.out.println("Informacion auto");
        System.out.println("Cantidad de puertas: " + auto.getCantidadPuertas() + " Marca: " + auto.getMarca() + "Modelo: " 
                + auto.getModelo() + auto.getAnio() );
        auto.acelerar();
        
        System.out.println("Informacion moto");
        System.out.println("Cantidad de cilindradas: " + moto.getCilindrada()+ " Marca: " + moto.getMarca() + "Modelo: " 
                + moto.getModelo() + moto.getAnio() );

        moto.acelerar();
    }
    
}
