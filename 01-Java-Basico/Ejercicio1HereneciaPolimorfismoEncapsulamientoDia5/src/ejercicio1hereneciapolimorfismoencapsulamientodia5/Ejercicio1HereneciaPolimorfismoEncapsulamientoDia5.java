
package ejercicio1hereneciapolimorfismoencapsulamientodia5;

import logica.Animal;
import logica.Ave;
import logica.Mamifero;
import logica.Reptil;

public class Ejercicio1HereneciaPolimorfismoEncapsulamientoDia5 {

   
    public static void main(String[] args) {
      
        Mamifero mamifero = new Mamifero(1, "Sexual", "Cafe", "Pastizales", 1, "Canguro", 20, "cafe", "Pasto");
        Ave ave = new Ave(0, "Aleteos Rapidos", "Azul Blanco", "Desconocido", 2, "Pajaro Chara azul", 5, "Desconocido", "Insectos");
        Reptil reptil = new Reptil(3, "Queratina", "No tiene", "Agua dulce", 3, "Cocodrilo", 15, "Escamas", "Peces");

        // Llamar a los métodos saludar
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

      
        Animal animal = mamifero;  // Esto es válido debido al polimorfismo
        animal.saludar(); // Invoca el método sobrescrito en Mamifero

        // Acceder a métodos si cambiamos su modificador a private
        // Intentar esto generará un error, ya que los métodos privados no son accesibles desde fuera de la clase.
        // mamifero.saludar();  // Error si el método es private
    }
    
}
