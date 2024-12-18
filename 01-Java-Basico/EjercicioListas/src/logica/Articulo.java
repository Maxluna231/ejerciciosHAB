
package logica;

public class Articulo {
   String nombre;
   String marca;
   double precio;

    public Articulo() {
    }

    public Articulo(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
      public String getInfo() {
            return "Producto: " + nombre + ", Marca: " + marca + ", Precio: $" + precio;
        }
   
}
