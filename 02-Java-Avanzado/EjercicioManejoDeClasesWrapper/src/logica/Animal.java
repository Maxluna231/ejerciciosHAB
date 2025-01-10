
package logica;

public class Animal {
    private String nombre;
    private double peso;
    
    Double w = new Double (peso);

    public Animal() {
    }

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }
    
    public void mostrarInfo(){
        System.out.println("Su nombre es: "  + nombre + "\n"+ "El peso es de: "+ peso + "\n" );
    }
}
