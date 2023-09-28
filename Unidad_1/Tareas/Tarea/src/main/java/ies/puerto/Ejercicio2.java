package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 *
 *         Desarrolle un algoritmo que permita leer tres valores y almacenarlos
 *         en
 *         las variables A, B y C respectivamente. El algoritmo debe imprimir
 *         cual es el
 *         mayor y cual es el menor. Recuerde constatar que los tres valores
 *         introducidos
 *         por el teclado sean valores distintos. Presente un mensaje de alerta
 *         en caso de
 *         que se detecte la introducción de valores iguale
 */
public class Ejercicio2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int valorA, valorB, valorC;
        Scanner lectura = new Scanner(System.in);
        do{
            System.out.println("Introduzca  valore  A");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A : " + valorA);
            System.out.println("Introduzca  valore  B");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B : " + valorB);
            System.out.println("Introduzca  valore  C");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable C : " + valorC);

            if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
                System.out.println("Dos o mas valores  son iguales ");
            }
        } while ((valorA == valorB) || (valorA == valorC) || (valorB == valorC));
        // Verificacion
        if ((valorA > valorB) && (valorA> valorC)) {
            System.out.println("El valor de A es Mayor ");
            if (valorB > valorC) {
                System.out.println("El valor del Medio es "+valorB);
                System.out.println("El valor del Ultimo es "+valorC);
            }else {
                System.out.println("El valor del Medio es "+valorC);
                System.out.println("El valor del Ultimo es "+valorB);
            }
        } else if ((valorB > valorC) && (valorB > valorA) ) {
            System.out.println("El valor de B es Mayor ");
            if (valorA > valorC) {
                System.out.println("El valor del Medio es "+valorA);
                System.out.println("El valor del Ultimo es "+valorC);
            }else {
                System.out.println("El valor del Medio es "+valorC);
                System.out.println("El valor del Ultimo es "+valorA);
            }
        } else if ((valorC == valorB) && (valorC == valorA) ) {
            System.out.println("El valor de C es Mayor ");
            if (valorA > valorB) {
                System.out.println("El valor del Medio es "+valorA);
                System.out.println("El valor del Ultimo es "+valorB);
            }else {
                System.out.println("El valor del Medio es "+valorC);
                System.out.println("El valor del Ultimo es "+valorB);
            }
        }

    }
}
