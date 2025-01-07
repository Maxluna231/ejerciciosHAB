
package ejcalculadora;

import logica.Operador;


public class EjCalculadora {

    public static void main(String[] args) {
        
      
      Operador operador = new Operador (){
           @Override
           public void operacion(int a, int b) {
               int resultado = a + b;
               System.out.println("EL resultado de la suma usando clases anonimas es: " + resultado);
           }
       
       };
        operador.operacion(2,2);
        
          //clase lambda
       Operador operador1 = (int a , int b)-> {
       int resultado = a + b;
       System.out.println("El resultado de la suma usando lambdas es: " + resultado);
       };
    operador1.operacion(5, 5);
       
    }
    
}
