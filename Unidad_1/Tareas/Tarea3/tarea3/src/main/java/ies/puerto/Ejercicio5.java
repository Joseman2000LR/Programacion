package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio5 {
    /**
     * Escribe un programa en Java que imprima los primeros n términos de la
     * secuencia de Fibonacci. Se debe solicitar el número n por teclado
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, i, anterio, actual, resultado;
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        if (numero <= 0) {
            System.out.println("El numero tiene que se mayor que 0 ");
        } else {
            if (numero >= 1) {
                System.out.println("0");
            }
            if (numero >= 2) {
                System.out.println("1");
            }
            anterio = 0;
            actual = 1;
            for (i = 3; i <= numero; i++) {
                resultado = actual;
                actual = actual + anterio;
                anterio = resultado;
                System.out.println(actual);
            }
        }
    }
}
