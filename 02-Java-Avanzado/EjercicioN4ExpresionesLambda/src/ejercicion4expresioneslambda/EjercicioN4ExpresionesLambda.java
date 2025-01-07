
package ejercicion4expresioneslambda;

import logica.NotificadorLibro;


public class EjercicioN4ExpresionesLambda {

  
    public static void main(String[] args) {
       //Clase Anonima
       
      NotificadorLibro libro = new NotificadorLibro(){
           @Override
           public void enviarNotificacion(String mensaje) {
               System.out.println("Notificacion clasica: " + mensaje);
           }
       
       };
      
       
        
       //clase lambda
       NotificadorLibro libro2 = (mensaje)-> System.out.println("Notificacion Moderna: " + mensaje);
       
       //Probar ambos metodos
        libro.enviarNotificacion("Mensaje Recibido");
        libro2.enviarNotificacion("Mensaje Recibido");
    }
    
}
