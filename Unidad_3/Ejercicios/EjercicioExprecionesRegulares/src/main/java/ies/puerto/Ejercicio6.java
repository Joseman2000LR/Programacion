package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena representa un número de tarjeta de
 * crédito válido según un formato específico.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
         String palabra = "";
       
        String regex = "(^\\d{3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);
    }
}
