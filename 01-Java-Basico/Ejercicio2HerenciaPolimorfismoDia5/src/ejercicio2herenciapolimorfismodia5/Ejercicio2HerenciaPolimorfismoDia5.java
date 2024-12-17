
package ejercicio2herenciapolimorfismodia5;

import logica.Camiseta;
import logica.Pantalon;
import logica.Sombrero;
import logica.Vestimenta;
import logica.Zapato;

public class Ejercicio2HerenciaPolimorfismoDia5 {

  
    public static void main(String[] args) {
       Vestimenta[] vestimentas = new Vestimenta[9];
       
       //objetos 3 tipo zapato
        vestimentas[0] = new Zapato("Cuero", "Cordones", "Z001", "Zapato Deportivo", 200, "Nike", "30", "Blanco");
        vestimentas[1] = new Zapato("Sentetico", "Velcro", "Z002", "Zapato Casual", 300, "Adidas", "20", "Negro");
        vestimentas[2] = new Zapato("Cuero", "Hebilla", "Z003", "Zapato Deportivo", 400, "Puma", "22", "Marron");
       //objetos 3 tipo pantalon
        vestimentas[3] = new Pantalon("Slim Fit", "Denim", "P001", "Jeans Slim", 320, "Levi 's'", "M", "Azul");
        vestimentas[4] = new Pantalon("Cargo", "Algodon", "P002", "Pantalon Cargo", 459, "Docker", "L", "Verde");
        vestimentas[5] = new Pantalon("Recto", "Poliester", "P003", "Pantalon Formal", 400, "Zara", "S", "Negro");
         //objetos 3 tipo camiseta
        vestimentas[6] = new Camiseta("Corta", "Redondo", "C001", "Camiseta Basica", 200, "H&M", "16", "Blanco");
        vestimentas[7] = new Camiseta("larga", "V", "C002", "Camiseta Deportiva ", 300, "Under Armour", "22", "Rojo");
          //objeto 1 tipo sombrero
           vestimentas[8] = new Sombrero("Artesanal", "Mediano", "S001", "Sombre Paja", 250, "Beige", "Mediano" ,"Playero");
          
           
           //recorrer el vector 
            for (Vestimenta vestimenta : vestimentas) {
            vestimenta.mostrarMensaje();
        }
    }
    
}
