package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que cuente el número de palabras en formato Camel Case
 * (palabras concatenadas sin espacios) en una cadena.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        String palabra = "hola y la Palabras Camel Case son";
        int cuenta = 0;
        String regex = "([a-zA-Z])\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);
        boolean esCoincidencia = matcher.matches();
        while (matcher.find()) {
            cuenta++;
        }

        System.out.println("El numero de palabra en formato Camel case son " + cuenta);
    }
}
