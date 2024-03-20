
package ies.puerto.ejercicio.compuesto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea una clase llamada CorreoElectronico que represente una dirección de
 * correo electrónico. Incluye un constructor que tome una cadena de texto (la
 * dirección de correo electrónico) como parámetro y la almacene internamente.
 * 
 * @author josem
 */
public class EjercicioCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correo;
        System.out.println("Dime tu correo electronico");
        correo = scanner.nextLine();
        try {
            validar(correo);
        } catch (CorreoInvalidoException e) {
            System.out.println(e);
        }
    }

    /**
     * @param correo
     * @return
     */
    public static void validar(String correo) throws CorreoInvalidoException {
        String verificacion = "^[a-zA-Z0-9]+@{1}[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(verificacion);
        Matcher matcher = pattern.matcher(correo);
        if (!matcher.find()) {
            throw new CorreoInvalidoException("No esta bien formado el correo");

        }
    }
}
