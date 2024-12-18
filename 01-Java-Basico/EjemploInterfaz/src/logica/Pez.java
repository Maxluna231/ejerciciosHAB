
package logica;


public class Pez extends Animal implements Acuaticos {

    public Pez(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void comer() {
        System.out.println("Como y soy un pez");
    }

    @Override
    public void nadar() {
        System.out.println("Nado y soy pez");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Respiro bajo el agua y soy pez");
    }
    
}
