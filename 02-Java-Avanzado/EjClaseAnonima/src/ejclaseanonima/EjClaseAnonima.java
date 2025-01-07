
package ejclaseanonima;

import logica.Vehiculo;

public class EjClaseAnonima {

   
    public static void main(String[] args) {
        
        new Vehiculo() {
        private int numeroPasajeros;
        
        public void conducir(){
            System.out.println("Estoy conduciendo un carro");
        }
            
        }.conducir();
    }
    
}
