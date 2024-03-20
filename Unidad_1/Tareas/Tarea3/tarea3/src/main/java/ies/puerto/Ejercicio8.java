package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio8 {
    /*
     * Encontrar y mostrar todos los números perfectos en un rango dado utilizando
     * un bucle for. Solicita el límite por teclado.
     */
    public static void main(String[] args) {
        int rango;
        int numero = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el rango que quieres ");
        rango = teclado.nextInt();
        System.out.println("Los numeros perfecto hasta el rango indicado son :");
        for (int i = numero; numero <= rango; numero++) {
            int sumaDivisores = 0;
            for (int j = 1; j < numero; j++) {
                if (numero % j == 0) {
                    sumaDivisores += j;
                }
            }
            if (sumaDivisores == numero) {
                System.out.println(numero);
            }
        }
    }
}
