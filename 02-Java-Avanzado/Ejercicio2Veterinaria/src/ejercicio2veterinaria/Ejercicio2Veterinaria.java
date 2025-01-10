
package ejercicio2veterinaria;

import java.util.List;
import logica.Mascota;
import logica.RegistroMascotas;


public class Ejercicio2Veterinaria {

    public static void main(String[] args) {
       RegistroMascotas registroMascotas = new RegistroMascotas();

        // Generar datos aleatorios
        registroMascotas.generarDatosAleatorios(10);
        System.out.println("Registro inicial:");
        registroMascotas.mostrarRegistro();

        // Agregar una mascota específica
        registroMascotas.agregarMascota("Rocky", 3, "Perro");

        // Buscar por nombre
        System.out.println("\nBuscar por nombre 'Max':");
        List<Mascota<?>> maxMascotas = registroMascotas.buscarPorNombre("Max");
        maxMascotas.forEach(System.out::println);

        // Buscar por especie
        System.out.println("\nBuscar por especie 'Gato':");
        List<Mascota<String>> gatos = registroMascotas.buscarPorEspecie("Gato");
        gatos.forEach(System.out::println);

        // Contar total de mascotas
        System.out.println("\nTotal de mascotas registradas: " + registroMascotas.contarMascotas());
    }
}
    
    

