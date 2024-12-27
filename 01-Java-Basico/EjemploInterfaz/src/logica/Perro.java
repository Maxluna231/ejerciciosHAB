
package logica;

public class Perro extends Animal implements Terrestres{

    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void comer() {
        System.out.println("Soy un perro y como");
    }

    @Override
    public void caminar() {
        System.out.println("Camino y soy perro");
    }

    @Override
    public void respirarOxigeno() {
        System.out.println("Respito oxigeno");
    }
    
}
