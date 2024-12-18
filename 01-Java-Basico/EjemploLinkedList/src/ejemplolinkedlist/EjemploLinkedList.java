
package ejemplolinkedlist;

import java.util.LinkedList;


public class EjemploLinkedList {

    public static void main(String[] args) {
      LinkedList<String> listaFrutas = new LinkedList<String>();
      
      //Java Agrega los elememtos en el orden que yo especifique
      //LIFO Y FIFO
      //LIFO las in Fisrst Out
      //First in First Out
      listaFrutas.add("Naranja");
      listaFrutas.add("Manzana");
      listaFrutas.add("Banana");
      listaFrutas.add("Fresa");
      
      //Agrego el melon para que sea mi nodo cabecera (Primer lugar)
      listaFrutas.add(0 , "Melon");
      
      //Para ver el tamaño de una lista
      int tamanio = listaFrutas.size();
        System.out.println("El tamaño de la lista es: " + tamanio);
      //Recorrer mi linked list
      //Usamos el for each (Por cada)
     
          //borrar elemento por posicion
        listaFrutas.remove(0);
        
          System.out.println("------eliminado------");
         for (String fruta : listaFrutas){
          System.out.println("la fruta guardada es "+ fruta);
         }
      }
    }
    

