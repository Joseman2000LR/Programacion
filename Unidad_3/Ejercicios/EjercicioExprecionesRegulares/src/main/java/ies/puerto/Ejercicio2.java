package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todos los números de teléfono válidos
 * (con formato +XX-XXX-XX-XX-XX) de una cadena dada. (Convina lo aprendido).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String telefono = "+76-362-32-33-22";
        String regex = "(^\\+\\d{2})-(\\d{3})-(\\d{2})-(\\d{2})-(\\d{2}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);
        if (matcher.matches()) {
            System.out.println("El Telefono  es válida.");
        } else {
            System.out.println("El Telefono no es válida.");
        }
    }
}
