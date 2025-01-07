
package ejinterfazfuncional;

import logica.Mensajero;


public class EjInterfazFuncional {

    
    public static void main(String[] args) {
       
        Mensajero mensaje = new Mensajero(){
            @Override
            public void EmitirMensaje(String nombre) {
                System.out.println("Hola " + nombre + " Desde clase anonima");
            }
       
        };
       mensaje.EmitirMensaje("Max");
       
       //lambdas
       Mensajero mensajeLambda = (nombre)->{System.out.println("Hola " + nombre + " Desde lambda");};
       mensajeLambda.EmitirMensaje("Max");
    }
    
}
