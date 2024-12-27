
package integradorsemana1;

import java.util.ArrayList;
import java.util.List;
import logica.VideoJuego;

public class IntegradorSemana1 {

  
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema VideoJuegos");
        
        
        VideoJuego videojuegos [] = new VideoJuego [5];
          
    videojuegos[0] = new VideoJuego(356,"Mario", "Nintendo",3,"arcade");
    videojuegos[1] = new VideoJuego(32345,"Mario", "Nintendo 64",3,"arcade");
    videojuegos[2] = new VideoJuego(345,"Mario", "Nintendo",3,"arcade");
    videojuegos[3] = new VideoJuego(34532,"Mario", "Nintendo",3,"arcade");
    videojuegos[4] = new VideoJuego(3434,"Mario", "Nintendo",3,"arcade");
    
        System.out.println("VideoJuegos");
        
         for(VideoJuego videojuego: videojuegos){
        System.out.println("Titulo: " + videojuego.getTitulo() + "Consola: " + videojuego.getConsola() + "Cantidad" + videojuego.getCantidadJugadores() + videojuego.getCategoria());
    
      }
        System.out.println("---Antes del cambio---");
        System.out.println("VideoJuego 1 : " + videojuegos[0].getTitulo() + videojuegos[0].getCantidadJugadores());
        System.out.println("VideoJuego 2 : " + videojuegos[1].getTitulo() + videojuegos[1].getCantidadJugadores());
        
        videojuegos[0].setTitulo("MetalSlug ")  ;
        videojuegos[0].setCantidadJugadores(5);
        videojuegos[1].setTitulo("Buble buble ");
        videojuegos[1].setCantidadJugadores(19);
        
        System.out.println("---Despues del cambio---");
        System.out.println("VideoJuego 1 : " + videojuegos[0].getTitulo() + videojuegos[0].getCantidadJugadores());
        System.out.println("VideoJuego 2 : " + videojuegos[1].getTitulo() + videojuegos[1].getCantidadJugadores());
        
       // Filtrar videojuegos de la consola "Nintendo 64"
        List<VideoJuego> juegosNintendo64 = new ArrayList<>();

        for (VideoJuego videojuego : videojuegos) {
            if ("Nintendo 64".equalsIgnoreCase(videojuego.getConsola())) {
                juegosNintendo64.add(videojuego);
            }
        }

        // Mostrar resultados
        if (juegosNintendo64.isEmpty()) {
            System.out.println("No se encontraron videojuegos de la consola Nintendo 64.");
        } else {
            System.out.println("--- Videojuegos de la consola Nintendo 64 ---");
            for (VideoJuego juego : juegosNintendo64) {
                System.out.println("- " + juego.getTitulo());
            }
        }
    }
    
}
