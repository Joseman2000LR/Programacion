package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar su fecha de nacimiento y
 * muestre su edad exacta en años, meses y días.
 */
public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la  fecha nacimento en formato dd/MM/yyyy: ");
        String fechaNacimiento = scanner.next();
        calcularEdad(fechaNacimiento);
    }

    public static void calcularEdad(String fechaNacimiento) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaNacimientoDate = formatoFecha.parse(fechaNacimiento);
            Date fechaActual = new Date();
            Calendar calendarNacimiento = Calendar.getInstance();
            Calendar calendarActual = Calendar.getInstance();

            calendarNacimiento.setTime(fechaNacimientoDate);
            calendarActual.setTime(fechaActual);
            int edadAnios = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
            int edadMeses = calendarActual.get(Calendar.MONTH) - calendarNacimiento.get(Calendar.MONTH);
            int edadDias = calendarActual.get(Calendar.DAY_OF_MONTH) - calendarNacimiento.get(Calendar.DAY_OF_MONTH);

            if (edadDias < 0) {
                int ultimoDiaDelMes = calendarActual.getActualMaximum(Calendar.DAY_OF_MONTH);
                edadMeses--;
                edadDias = ultimoDiaDelMes - calendarNacimiento.get(Calendar.DAY_OF_MONTH)
                        + calendarActual.get(Calendar.DAY_OF_MONTH);
            }
            System.out.println("Su edad es: " + edadAnios + " años, " + edadMeses + " meses y " + edadDias + " días.");
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato correcto.");
        }
    }
}
