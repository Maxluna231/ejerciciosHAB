
package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RegistroMascotas {
    private final List<Mascota<?>> registro = new ArrayList<>();
    private int idCounter = 1;


    public <T> void agregarMascota(String nombre, int edad, T especie) {
        Mascota<T> nuevaMascota = new Mascota<>(idCounter++, nombre, edad, especie);
        registro.add(nuevaMascota);
    }

 
    public List<Mascota<?>> buscarPorNombre(String nombre) {
        List<Mascota<?>> resultado = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(mascota);
            }
        }
        return resultado;
    }

   
    public <T> List<Mascota<T>> buscarPorEspecie(T especie) {
        List<Mascota<T>> resultado = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (especie.equals(mascota.getEspecie())) {
                resultado.add((Mascota<T>) mascota);
            }
        }
        return resultado;
    }

    
    public int contarMascotas() {
        return registro.size();
    }

   
    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Max", "Luna", "Coco", "Bella", "Charlie"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1; 
            String especie = especies[random.nextInt(especies.length)];
            agregarMascota(nombre, edad, especie);
        }
    }

   
    public void mostrarRegistro() {
        registro.forEach(System.out::println);
    }
}
