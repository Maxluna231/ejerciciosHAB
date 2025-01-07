
package ejclaseanoninter;

import logica.Saludo;


public class EjClaseAnoninter {

    
    public static void main(String[] args) {
        
         Saludo sal = new Saludo () {
            @Override
            public void saludar() {
                System.out.println("Hola saludando desde clase anónima");
            }
        
        };
        
        sal.saludar();
        
    }
    
}

