package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio4 {
    /**
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe
     * solicitar el número por teclado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        int original;
        int inverso = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        original = numero;
        // bucle que desgloza en numero en un digito
        while (numero > 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        if (inverso == original) {
            System.out.println(original + " es un número palíndromo.");
        } else {
            System.out.println(original + " no es un número palíndromo.");
        }
    }

}
