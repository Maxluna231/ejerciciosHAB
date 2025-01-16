
package logica;


public class Empleado {
   private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;

    public Empleado(String nombre, String apellido, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}
