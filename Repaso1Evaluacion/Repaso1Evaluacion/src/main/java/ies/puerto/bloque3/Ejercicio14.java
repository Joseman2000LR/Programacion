package ies.puerto.bloque3;

import java.util.Scanner;

/**
 * Escribe un programa que utilice una variable booleana para determinar si un
 * número ingresado por el usuario es par o impar.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime un numero");
        boolean espar ;
        int numero = scanner.nextInt();
        if (numero / 2==0) {
            espar=true;
        }else{
            espar=false;
        }
        

    }

}