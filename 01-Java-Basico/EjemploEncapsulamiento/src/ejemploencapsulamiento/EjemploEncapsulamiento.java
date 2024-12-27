
package ejemploencapsulamiento;

import logica.Mascota;

public class EjemploEncapsulamiento {

    
    public static void main(String[] args) {
        
        Mascota mascota = new Mascota();
        mascota.setNombre("libra");
        mascota.getNombre();
        
        String nombre = mascota.nombre;
        System.out.println("nombre");
        
    }
    
}
