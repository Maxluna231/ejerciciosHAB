
package logica;

public class Pato extends Animal implements Acuaticos,Terrestres,Voladores{

    public Pato(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void comer() {
        System.out.println("Soy un pato y como");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un pato y nado");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Soy un pato y medio intento nadar bajo el agua");
    }

    @Override
    public void caminar() {
        System.out.println("soy un pato y puedo caminar");
    }

    @Override
    public void respirarOxigeno() {
        System.out.println("soy un pato y puedo puedo respirar");
    }

    @Override
    public void volar() {
        System.out.println("soy un pato y puedo medio volar");
    }

    @Override
    public void aletear() {
        System.out.println("soy un pato y puedo aleatear");
    }
    
}
