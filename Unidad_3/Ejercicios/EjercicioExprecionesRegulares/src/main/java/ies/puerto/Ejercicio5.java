package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que reemplace todas las etiquetas HTML en una cadena
 * con su contenido. Por ejemplo,
 * <p>
 * Texto
 * </p>
 * se convertiría a Texto.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String palabra = "<p>Texto</p> <div>Otro texto</div> <a href=\\\"https://www.ejemplo.com\\\">Enlace</a>";
        String regex = "<[^>]*>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);

    }
}
