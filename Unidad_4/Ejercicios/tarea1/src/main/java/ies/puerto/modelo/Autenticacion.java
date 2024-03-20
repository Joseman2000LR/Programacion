package ies.puerto.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion {
    /**
     * Metodo que verifica dni
     * 
     * @param dni
     */
    public void verificarDni(String dni) {
        String regex = "^[0-9]{8}[a-zA-Z]{1}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            System.out.println("El dni es válido.");
        } else {
            System.out.println("El dni  no es válido.");
        }
    }
}
