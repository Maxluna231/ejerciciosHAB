
package ejercicio1tiendaonline.excepciones;

import java.util.Scanner;
import logica.MontoInvalidoException;

public class Ejercicio1TiendaOnlineExcepciones {

    
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       //Solicitud de los datos
        String numeroTarj = null;
        boolean numValido = false;

        while (numValido != true) {
            try {
                System.out.println("Ingrese el número de la tarjeta (16 dígitos)");
                numeroTarj = teclado.nextLine();
                //validar si mi número de tarjeta es correcto
                validarTarjeta(numeroTarj);
                numValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error. El número de tarjeta es inválido");
            }

        }

        //solicitud y validación de monto
        double montoCompra = 0.0;
        boolean montoValido = false;

        while (montoValido != true) {

            try {
                System.out.println("Ingrese el monto de la compra");
                montoCompra = Double.parseDouble(teclado.nextLine());
                //validar si monto es correcto
                validarMonto(montoCompra);
                montoValido = true;
            } catch (MontoInvalidoException e) {
                System.out.println(e.getMessage());
            }

        }

        //Solicitud del nombre
        String nombre = null;
        boolean nombreValido = false;

        while (nombreValido != true) {

            try {
                System.out.println("Ingrese el nombre del cliente");
                nombre = teclado.nextLine();
                //validar si monto es correcto
                validarNombre(nombre);
                nombreValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

    }

    private static void validarTarjeta(String numeroTarj) {
        if (numeroTarj.length() != 16 || !numeroTarj.matches("\\d{16}")) {
            throw new NumberFormatException();
        }
    }

    private static void validarMonto(double montoCompra) throws MontoInvalidoException {

        if (montoCompra <= 0) {
            throw new MontoInvalidoException("El monto ingresado es inválido. Debe ser mayor a 0");
        }

    }

    private static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

    }

}

  
