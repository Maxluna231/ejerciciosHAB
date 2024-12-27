
package ejerciciopractico2dia3;

import logica.Persona;


public class EjercicioPractico2Dia3 {

    public static void main(String[] args) {
    Persona personas [] =  new Persona [5]; 
    
    personas[0] = new Persona(1 ,"Juan ",25, "calle vicente", 231234566);
    personas[1] = new Persona(2 ,"Maria ",30, "calle morelos", 231234356);
    personas[2] = new Persona(3 ,"Paola ",50, "calle ignacio", 23124526);
    personas[3] = new Persona(4 ,"Javier ",21, "calle allende", 231234796);
    personas[4] = new Persona(5 ,"Luis ",27, "calle margarita", 231234946);
    
    
        System.out.println("Personas");
    
    for(Persona persona: personas){
        System.out.println("Nombre: " + persona.getNombre() + "Edad: " + persona.getEdad());
    
      }
        System.out.println("---Antes del cambio---");
        System.out.println("persona1: " + personas[0].getNombre());
        System.out.println("persona2: " + personas[1].getNombre());
        
        personas[0].setNombre("Carlos ");
        personas[1].setNombre("Carmen ");
        
        System.out.println("---Despues del cambio");
        System.out.println("Persona1: " + personas[0].getNombre());
        System.out.println("persona2: " + personas[1].getNombre());
        
        //mostrar personas mayores a 30 años
        System.out.println("---Personas mayores a 30 años---");
        for(Persona persona: personas){
        if(persona.getEdad() >=30){
            System.out.println("Nombre:" + persona.getNombre() + "Edad:" + persona.getEdad());
        }
        
        }
    }
    
}
