
package ejemploherencia;

import logica.Gato;
import logica.Perro;

public class EjemploHerencia {

  
    public static void main(String[] args) {
        Perro perro = new Perro(6,"dino ", 12 ,"cafe ");
        Gato gato = new Gato(14,"romino ",12,"anaranjado ");
        
        /* Animal listaAnimales []  */
        
        perro.comer();
        gato.comer();
        
        perro.ladrar();
        gato.maullar();
    }
    
}
