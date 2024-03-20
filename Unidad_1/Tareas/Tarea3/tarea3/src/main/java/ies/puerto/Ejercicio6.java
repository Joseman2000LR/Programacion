package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio6 {
    /**
     * Escribe un programa en Java que encuentre todos los números Armstrong
     * entre 1 y 1000.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        int valor = 0;
        int original;
        int cuenta = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        original = numero;
        // bucle que desgloza un numero
        while (numero > 0) {
            int digito = (numero % 10);
            System.out.println(digito);
            digito = original;
            numero = numero / 10;
            cuenta = original + (numero / 10);
        }

        System.out.println(cuenta);
    }
}
