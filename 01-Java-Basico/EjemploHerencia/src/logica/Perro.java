
package logica;


public class Perro extends Animal {
    private int cantidadMordidas;

    public Perro() {
    }
    
    public Perro(int cantidadMordidas, String nombre, int edad, String color) {
        super(nombre, edad, color);
        this.cantidadMordidas = cantidadMordidas;
    }

    public int getCantidadMordidas() {
        return cantidadMordidas;
    }

    public void setCantidadMordidas(int cantidadMordidas) {
        this.cantidadMordidas = cantidadMordidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void ladrar() {
        System.out.println( "soy un perro y ladro");
    }
    
}
