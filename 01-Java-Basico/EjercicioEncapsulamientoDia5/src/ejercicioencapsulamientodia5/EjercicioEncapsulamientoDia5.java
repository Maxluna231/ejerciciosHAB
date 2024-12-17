
package ejercicioencapsulamientodia5;

import logica.CuentaBancaria;

public class EjercicioEncapsulamientoDia5 {


    public static void main(String[] args) {
       CuentaBancaria cuenta = new CuentaBancaria();
       
        System.out.println("Titular" + cuenta.getTitular() + "Saldo" + cuenta.getSaldo() + "Numero de cuenta" + cuenta.getNumeroCuenta());
       
        /*String titular = cuenta.titular;
        System.out.println("Darios");
        
        double saldo = cuenta.saldo;
        System.out.println(300);
        
        int numeroCuenta = cuenta.numeroCuenta;
        System.out.println(2028);*/
        
        //Cuando se cambia a privado no se puede acceder, solo es accesible desde CuentaBancaria,
        //se podría acceder si se tuviera otro método que usara indirectamente a getSaldo()
    }
    
}
