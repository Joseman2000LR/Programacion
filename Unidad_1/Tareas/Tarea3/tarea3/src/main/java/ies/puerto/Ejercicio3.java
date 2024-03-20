package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio3 {
    /**
     * Escribe un programa en Java que encuentre el número de Fibonacci en la
     * posición n. Se debe solicitar el número por teclado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, i, anterio, actual, resultado, posicion = 0;
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        if (numero <= 0) {
            System.out.println("El numero tiene que se mayor que 0 ");
        } else {
            anterio = 0;
            actual = 1;
            for (i = 3; i < numero; i++) {
                resultado = actual;
                actual = actual + anterio;
                anterio = resultado;
                posicion = actual + 1;
            }
            System.out.println("El numero indicado " + numero +
                    " Esta en la posicion " + posicion);
        }
    }
}
