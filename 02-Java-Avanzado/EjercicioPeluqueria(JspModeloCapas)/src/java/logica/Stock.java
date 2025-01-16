
package logica;


public class Stock {
    Long id;
    String codigo_Insumo;
    String nombre;
    String cantidad;
    String fechaCaducidad;

    public Stock() {
    }

    public Stock( String codigo_Insumo, String nombre, String cantidad, String fechaCaducidad) {
        this.codigo_Insumo = codigo_Insumo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo_Insumo() {
        return codigo_Insumo;
    }

    public void setCodigo_Insumo(String codigo_Insumo) {
        this.codigo_Insumo = codigo_Insumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", codigo_Insumo=" + codigo_Insumo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
    
}
