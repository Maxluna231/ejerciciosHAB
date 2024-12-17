
package logica;

public class Gato extends Animal {
    int cantidadAraniazos;

    public Gato() {
    }

    public Gato(int cantidadAraniazos, String nombre, int edad, String color) {
        super(nombre, edad, color);
        this.cantidadAraniazos = cantidadAraniazos;
    }

    public int getCantidadAraniazos() {
        return cantidadAraniazos;
    }

    public void setCantidadAraniazos(int cantidadAraniazos) {
        this.cantidadAraniazos = cantidadAraniazos;
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
    
    public void maullar() {
        System.out.println("Soy un gato y maullo");
    }
}
