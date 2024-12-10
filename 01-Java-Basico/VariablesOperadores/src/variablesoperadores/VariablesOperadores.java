package variablesoperadores;

import java.util.Scanner;


public class VariablesOperadores {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner calcular = new Scanner(System.in);

        
        System.out.println("Ingrese la base"); 
        double base = calcular.nextDouble();
        
        System.out.println("ingrese la altura");
        double altura = calcular.nextDouble();
        
        //calcular el resultado en pantalla
        double area = (base * altura )/2;
        
        System.out.println("El area del tringulo es ;" + area);
        
        
    }
    
}
