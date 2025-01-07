
package ejgimnaciolambda;

import logica.NotificadorClase;


public class EjGimnacioLambda {

    public static void main(String[] args) {
       //Mediante clases anonimas
      NotificadorClase noti = new NotificadorClase (){
           @Override
           public void enviarRecordatorio(String msje) {
               System.out.println("Recuerde que tiene clase de " + msje);
           }
       };
       
       noti.enviarRecordatorio("Zumba");
       
       //Mediante Lambdas
       //Parametro + ->> + setencia
       //Valor que quiero pasar + funcion flecha -> codigo que quiero que tenga el metodo
       
      NotificadorClase notif2 =  (mensaje) -> System.out.println("Recuerde que tiene clases de " + mensaje);
      notif2.enviarRecordatorio("Pilates");
    }
    
}
