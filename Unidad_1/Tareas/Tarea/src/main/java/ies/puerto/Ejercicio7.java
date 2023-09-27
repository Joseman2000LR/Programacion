package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 *         Descripcion del ejercico 7
 */

public class Ejercicio7 {

    /**
     * un algoritmo que a partir de proporcionarle la velocidad de un automóvil,
     * expresada en kilómetros por hora, proporcione la velocidad en metros por
     * segundo.
     * 
     * @param args
     */

    public static void main(String[] args) {
        double kilometrosHora;
        double metrosHoras;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca  Kilometro/hora para comvertilo en metro/horas ");
        kilometrosHora = lectura.nextFloat();
        metrosHoras = kilometrosHora / 3.6;
        System.out.println(metrosHoras);
    }
}
