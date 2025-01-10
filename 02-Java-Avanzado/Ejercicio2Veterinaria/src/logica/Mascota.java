
package logica;


public class Mascota <T>{
    private final int id;
    private final String nombre;
    private final int edad;
    private final T especie;

    public Mascota(int id, String nombre, int edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public T getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie=" + especie +
                '}';
    }
}
