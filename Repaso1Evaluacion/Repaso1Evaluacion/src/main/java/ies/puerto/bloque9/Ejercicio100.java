package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que determine si una fecha ingresada por el usuario
 * corresponde a un día festivo específico (por ejemplo, Navidad o Año Nuevo) y
 * muestre un mensaje adecuado.
 */
public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha en formato dd/MM/yyyy: ");
        String fechaIngresada = scanner.next();
        determinarDiaFestivo(fechaIngresada);

    }

    public static void determinarDiaFestivo(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatoFecha.parse(fecha);
            if (esNavidad(date)) {
                System.out.println("La fecha ingresada corresponde a Navidad. ¡Feliz Navidad!");
            } else if (esAnioNuevo(date)) {
                System.out.println("La fecha ingresada corresponde a Año Nuevo. ¡Feliz Año Nuevo!");
            } else {
                System.out.println("La fecha ingresada no es un día festivo específico.");
            }
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato correcto.");
        }
    }
    public static boolean esNavidad(Date date) {
        SimpleDateFormat formatoDiaMes = new SimpleDateFormat("dd/MM");
        String diaMes = formatoDiaMes.format(date);
        return diaMes.equals("25/12");
    }
    public static boolean esAnioNuevo(Date date) {
        SimpleDateFormat formatoDiaMes = new SimpleDateFormat("dd/MM");
        String diaMes = formatoDiaMes.format(date);
        return diaMes.equals("01/01");
    }
}
