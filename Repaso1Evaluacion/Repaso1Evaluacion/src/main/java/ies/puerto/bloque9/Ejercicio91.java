package ies.puerto.bloque9;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Escribe un programa que muestre la fecha actual en el formato "dd/MM/yyyy".
 */
public class Ejercicio91 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);
        System.out.println("Fecha actual en formato dd/MM/yyyy: " + fechaFormateada);
    }
}
