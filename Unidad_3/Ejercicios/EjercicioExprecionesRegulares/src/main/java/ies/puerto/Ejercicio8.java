package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que verifique si una cadena cumple con ciertos criterios
 * de complejidad, como longitud mínima, uso de mayúsculas, minúsculas y
 * números.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String cadena = scanner.nextLine();

        if (verifcarCadena(cadena)) {
            System.out.println("La palabra cumple con los criterios de complejidad.");
        } else {
            System.out.println("La palabra no cumple con los criterios de complejidad.");
        }
    }

    public static boolean verifcarCadena(String cadena) {
        if (cadena.length() < 3) {
            System.out.println("La cadena debe tener al menos 3 carateres");
            return false;
        }
        Pattern mayusculasPattern = Pattern.compile("[A-Z]");
        Pattern minusculasPattern = Pattern.compile("[a-z]");
        Pattern numerosPattern = Pattern.compile("[0-9]");
        Matcher mayusculasMatcher = mayusculasPattern.matcher(cadena);
        Matcher minusculasMatcher = minusculasPattern.matcher(cadena);
        Matcher numerosMatcher = numerosPattern.matcher(cadena);
        if (!mayusculasMatcher.find()) {
            System.out.println("La  cadena debe contener al menos una letra mayúscula.");
        }

        if (!minusculasMatcher.find()) {
            System.out.println("La  cadena debe contener al menos una letra minúscula.");
        }

        if (!numerosMatcher.find()) {
            System.out.println("La  cadena debe contener al menos un número.");
        }

        return mayusculasMatcher.find() && minusculasMatcher.find() && numerosMatcher.find();

    }
}
