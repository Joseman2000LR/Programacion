package ies.puerto.ejercicio.compuesto;

public class CorreoInvalidoException extends Exception {
    String mensaje;

    public CorreoInvalidoException(String mensaje) {
        super(mensaje);
    }

}
