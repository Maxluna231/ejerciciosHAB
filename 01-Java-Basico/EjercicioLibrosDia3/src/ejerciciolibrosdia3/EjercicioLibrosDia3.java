
package ejerciciolibrosdia3;

import java.util.Scanner;
import logica.Libro;

public class EjercicioLibrosDia3 {

   
    public static void main(String[] args) {
        /*Adaptar el código para que permita agregar hasta 5 libros y que CADA LIBRO se asigne a la posición de un vector.*/
        
        Libro ebook  []  = new Libro[5];
        
        System.out.println("Bienvenido al sistema de libros :)");
        
        Libro libro = new Libro();
        Scanner teclado = new Scanner(System.in);
        
        //vector for
        for(int i=0; i<ebook.length;i++){
        
        //cargar datos
        System.out.println("Ingrese los datos ");
        System.out.println("Escriba el codigo ISBN");
        libro.setCodigoIsbn(teclado.nextInt());
        
        System.out.println("Escriba el titulo");
        libro.setTitulo(teclado.nextLine());
        
        System.out.println("Escriba el nombre del autor");
        libro.setAutor(teclado.nextLine());
        
        System.out.println("Escriba el genero");
        libro.setGenero(teclado.nextLine());
        
        System.out.println("Numero de páginas");
        libro.setNumeroDePaginas(teclado.nextInt());
        
        //guardo libro en vector
        ebook[i] = libro;
        
        //reseteo libro y scanner
        libro = new Libro();
        teclado = new Scanner(System.in);
        }
        
        System.out.println("Datos completos del libro: " +
                "Codigo ISBN: " + libro.getCodigoIsbn() + "Titulo: " + libro.getTitulo() + "Nombre del autor" + libro.getAutor() + 
                "Genero :" + libro.getNumeroDePaginas());
        
        
        System.out.println("Cambio el numero de paginas");
        libro.setNumeroDePaginas(5);
        
        System.out.println("datos cambiados");
        System.out.println(libro.toString());
        
    
    }
}
