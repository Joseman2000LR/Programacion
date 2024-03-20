package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que determine el día de la semana de una fecha ingresada por
 * el usuario (por ejemplo, lunes, martes, etc.).
 */
public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha en formato dd/MM/yyyy: ");
        String fechaIngresada = scanner.next();
        String diaDeLaSemana = determinarDiaDeLaSemana(fechaIngresada);
        System.out.println("La fecha ingresada corresponde a un(a) " + diaDeLaSemana + ".");
    }

    public static String determinarDiaDeLaSemana(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaConvertida = formatoFecha.parse(fecha);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaConvertida);
            int numeroDiaDeLaSemana = calendar.get(Calendar.DAY_OF_WEEK);
            String[] diasSemana = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };
            return diasSemana[numeroDiaDeLaSemana - 1];
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato correcto.");
            return "";
        }
    }
}
