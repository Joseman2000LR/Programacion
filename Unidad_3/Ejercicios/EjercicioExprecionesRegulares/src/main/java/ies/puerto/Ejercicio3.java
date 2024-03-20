package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un validador que verifique si una cadena sigue el formato de fecha
 * común (por ejemplo, DD/MM/AAAA).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String fecha = "10/05/2206";
        String regex = "(^\\d{2})\\/(\\d{2})\\/(\\d{4}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        if (matcher.matches()) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La Fecha  no es válida.");
        }
    }
}
