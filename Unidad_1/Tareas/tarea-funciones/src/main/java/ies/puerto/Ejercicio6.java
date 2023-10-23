package ies.puerto;

import java.util.Scanner;

/**
 * clase que convertierte Fahrenheit a Celsius
 */
public class Ejercicio6 {

    /**
     * funcion que convierte de grados Fahrenheit a Celsius
     * 
     * @param gradosFahrenheit
     * @return
     */
    public static double fahrenheitACelsius(double gradosFahrenheit) {
        double gradosCelsius = (gradosFahrenheit - 32) * 5 / 9;
        return gradosCelsius;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradosFahrenheit;
        System.out.println("Dime un numero ");
        gradosFahrenheit = teclado.nextDouble();

        double gradosCelsius = fahrenheitACelsius(gradosFahrenheit);
        System.out.println(gradosFahrenheit + " grados Fahrenheit son equivalentes a "
                + gradosCelsius + " grados Celsius.");
    }

}