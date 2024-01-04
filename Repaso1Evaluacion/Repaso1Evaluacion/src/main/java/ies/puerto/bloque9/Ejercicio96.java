package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que permita al usuario ingresar una fecha y un número
 * de días, y calcule la fecha resultante después de sumar esos días.
 */
public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la  fecha en formato dd/MM/yyyy: ");
        String fecha = scanner.next();
        System.out.print("Ingrese el número de días a sumar: ");
        int diasASumar = scanner.nextInt();
        String fechaResultante = sumarDiasAFecha(fecha, diasASumar);

        System.out.println("La fecha resultante después de sumar " + diasASumar + " días es: " + fechaResultante);
    }

    public static String sumarDiasAFecha(String fecha, int diasASumar) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaOriginal = formatoFecha.parse(fecha);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaOriginal);
            calendar.add(Calendar.DAY_OF_MONTH, diasASumar);
            Date nuevaFecha = calendar.getTime();
            return formatoFecha.format(nuevaFecha);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato correcto.");
            return "";
        }
    }
}
