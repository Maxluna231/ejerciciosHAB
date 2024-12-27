
package clasificaciondeunarticulotienda;

import java.util.Scanner;

public class ClasificacionDeUnArticuloTienda {

  
    public static void main(String[] args) {
       /* Una tienda clasifica los artículos en diferentes categorías según su precio. Escribe un programa que, a partir del precio ingresado por el usuario, determine en qué categoría se encuentra el artículo. Las categorías son las siguientes:
       Si el precio es menor a $50, el artículo se clasifica como "Económico".
       Si el precio está entre $50 y $100, el artículo se clasifica como "Accesible".
       Si el precio está entre $100 y $200, el artículo se clasifica como "Estándar".
       Si el precio es mayor a $200, el artículo se clasifica como "Premium".
       El programa debe mostrar un mensaje indicando la categoría correspondiente.*/
        
        
          System.out.println("Ingrese el precio");
          Scanner teclado = new Scanner(System.in);
        float precio = teclado.nextFloat();
          
        if(precio <= 50){
          System.out.println("Economico");
       }else{
          if(precio >=50 && precio<=100){
          System.out.println("Accesible");
        }else{
            if(precio >=100 && precio<=200){
            System.out.println("Estandar");
        }else{
            System.out.println("Premium");
          
         } 
       }
     }
   } 
}
