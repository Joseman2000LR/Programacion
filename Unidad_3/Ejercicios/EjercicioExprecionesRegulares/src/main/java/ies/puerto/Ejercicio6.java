package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena representa un número de tarjeta de
 * crédito válido según un formato específico.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String numeroTarjeta = "4111111111111111";
        if (verificartarjeta(numeroTarjeta)) {
            System.out.println("El número de tarjeta es válido.");
        } else {
            System.out.println("El número de tarjeta no es válido.");
        }
    }

    public static boolean verificartarjeta(String numeroTarjeta) {
        String regex = "^4[0-9]{12}([0-9]{3}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeroTarjeta);
        return matcher.matches();

    }
}
