package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que compare dos fechas ingresadas por el usuario y determine
 * cuál es anterior, o si son iguales.
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera fecha en formato dd/MM/yyyy: ");
        String primeraFecha = scanner.next();
        System.out.print("Ingrese la segunda fecha en formato dd/MM/yyyy: ");
        String segundaFecha = scanner.next();
        int resultadoComparacion = compararFechas(primeraFecha, segundaFecha);

        if (resultadoComparacion < 0) {
            System.out.println("La primera fecha es anterior a la segunda fecha.");
        } else if (resultadoComparacion > 0) {
            System.out.println("La segunda fecha es anterior a la primera fecha.");
        } else {
            System.out.println("Ambas fechas son iguales.");
        }

    }

    public static int compararFechas(String fecha1, String fecha2) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = formatoFecha.parse(fecha1);
            Date date2 = formatoFecha.parse(fecha2);
            return date1.compareTo(date2);
        } catch (ParseException e) {
            System.out.println("Error al convertir las fechas. Asegúrese de ingresarlas en el formato correcto.");
            return 0;
        }
    }
}
