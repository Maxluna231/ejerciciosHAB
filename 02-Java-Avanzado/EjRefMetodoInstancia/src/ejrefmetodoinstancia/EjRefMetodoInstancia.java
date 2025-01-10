
package ejrefmetodoinstancia;

import logica.Persona;


public class EjRefMetodoInstancia {

    public static void main(String[] args) {
       Persona pers = new Persona();
       pers.setNombre("Max");
       
       //usar la referencia a metodos
       //necesito una interfaz funcional
       Runnable saludo = pers::saludar;
       saludo.run();
       
       //forma normal
       pers.saludar();
    }
    
}
