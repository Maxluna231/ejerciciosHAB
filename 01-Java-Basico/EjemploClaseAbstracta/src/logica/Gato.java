
package logica;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String color) {
        super(nombre, color);
    }  
    
    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo y soy un gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato miau miau");
    }
    
 
    
}
