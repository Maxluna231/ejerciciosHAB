
package logica;

public class Persona {
   //Atributos id, nombre, edad, dirección y número de teléfono
    
    int id;
    String nombre;
    int edad;
    String direccion;
    int numeroDeTelefono;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String direccion, int numeroDeTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    
}
