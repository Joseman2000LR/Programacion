package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 *         Descripcion del ejercico 5
 */
public class Ejercicio5 {

    /**
     * Un algoritmo que permita leer dos números y ordenarlos de menor a mayor
     * si es el caso
     * 
     * @param args
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca  el Primer numero ");
        num1 = lectura.nextInt();
        System.out.println("Introduzca  el Segundo numero ");
        num2 = lectura.nextInt();
        if (num1 < num2) {
            System.out.println("El numero menor es " + num1 + " y el mayor es " + num2);
        }
        if (num2 < num1) {
            System.out.println("El numero menor es " + num2 + " y el mayor es " + num1);
        }
    }
}