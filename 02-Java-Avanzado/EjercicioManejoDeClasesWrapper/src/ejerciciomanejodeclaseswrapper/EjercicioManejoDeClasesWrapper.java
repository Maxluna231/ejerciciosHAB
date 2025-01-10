
package ejerciciomanejodeclaseswrapper;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Animal;

public class EjercicioManejoDeClasesWrapper {

   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
        boolean bandera = true;
        
     while (bandera) {
            try {
                System.out.println("Ingrese el nombre del animal: ");
                String nombre = teclado.nextLine();

                if (nombre.isEmpty()) {
                    throw new IllegalArgumentException("No ingresó ningún nombre");
                }

                System.out.println("Ingrese el peso del animal: ");
                Double peso = Double.valueOf(teclado.nextLine());

              
                if (peso.isNaN() || peso <= 0) {
                    throw new IllegalArgumentException("Peso no válido");
                }

              
                Animal animal = new Animal(nombre, peso);
                listaAnimales.add(animal);

            
                System.out.print("¿Desea ingresar otro animal? (s/n): ");
                String respuesta = teclado.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    bandera = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada no válida, intente nuevamente.");
                teclado.nextLine(); 
            }
        }

       
          System.out.println("\nInformación de los animales:");
          listaAnimales.forEach(Animal::mostrarInfo);

        }

       
    }
    
