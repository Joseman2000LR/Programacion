package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio2 {
    /**
     * Escribe un programa en Java que encuentre el máximo común divisor (MCD)
     * de dos números. Se debe solicitar los números por teclado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        numero1 = lectura.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = lectura.nextInt();
        while (numero2 != 0) {
            int contador = numero2;
            numero2 = numero1 % numero2;
            numero1 = contador;
        }
        System.out.println("MCD es " + numero1);
    }
}
