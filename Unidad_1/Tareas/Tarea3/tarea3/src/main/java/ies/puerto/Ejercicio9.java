package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio9 {
    /*
     * Imprimir la tabla de multiplicar de un número ingresado por el usuario
     * utilizando un bucle for. Solicita el valor de la tabla por teclado.
     */
    public static void main(String[] args) {
        int numero;
        int resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la tabla del numero que quieres");
        numero = teclado.nextInt();
        System.out.println("la tabla del " + numero + " es");
        for (int i = 0; i <= numero; i++) {
            resultado = numero * i;
            System.out.println(i + "*" + numero + "=" + resultado);
        }
    }
}