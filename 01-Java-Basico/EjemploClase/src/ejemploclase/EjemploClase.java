
package ejemploclase;

import java.time.LocalDate;
import logica.Persona;

public class EjemploClase {

    public static void main(String[] args) {
        Persona perso = new Persona();
        Persona perso2 = new Persona(1, "Maximino", "Luna",  LocalDate.of(2024,11,15), "Morelos");
        
        System.out.println("---ANTES---");
        
        System.out.println("El nombre es: " + perso2.getNombre() + " El apellido es: " + perso2.getApellido()+
        "la direccion es: " + perso2.getDireccion());
     
        System.out.println("---DESPUES---");
        
        perso2.setNombre("Max");
        System.out.println("El nombre es: " + perso2.getNombre() + " El apellido es: " + perso2.getApellido()+
        "la direccion es: " + perso2.getDireccion());
    }
    
}