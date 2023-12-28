package ies.puerto.bloque3;

/**
 * Haz un programa que utilice una constante para representar el valor de PI
 * (3.14159265) y calcule el área de un círculo.
 */
public class Ejercicio16 {
    static final double PI = 3.14159265;

    public static void main(String[] args) {
        double radio = 5.0;
        double area = PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}