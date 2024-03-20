package ies.puerto.bloque3;

/**
 * Crea un programa que declare dos variables booleanas, representando por
 * ejemplo si está lloviendo y si es de noche, y luego utilice operadores
 * lógicos para determinar si se debe encender una lámpara.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        boolean estaLloviendo = true; 
        boolean esDeNoche = true; 

        boolean encenderLampara = estaLloviendo && esDeNoche;

        if (encenderLampara) {
            System.out.println("Debe encenderse una lámpara.");
        } else {
            System.out.println("No es necesario encender una lámpara.");
        }
    }
}