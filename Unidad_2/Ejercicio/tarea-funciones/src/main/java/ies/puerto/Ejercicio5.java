package ies.puerto;

import java.util.Scanner;

/**
 * Clase que hace que una funcion tome un numero y dice si es primo o no.
 */
public class Ejercicio5 {
    /**
     * función que tome como parámetro un número e indique si es primo o no
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 2; i  <= numero/2; i += 6) {
            if (numero % i == 0 ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}