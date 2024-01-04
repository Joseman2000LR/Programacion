package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que calcule y muestre cuántos días han pasado desde
 * una fecha ingresada por el usuario hasta la fecha actual.
 */
public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha en formato dd/MM/yyyy: ");
        String fechaIngresada = scanner.next();
        Date fechaActual = new Date();
        double milisegundosFechaIngresada = convertirFechaAMilisegundos(fechaIngresada);
        double milisegundosFechaActual = fechaActual.getTime();

        double diferenciaEnDias = calcularDiferenciaEnDias(milisegundosFechaIngresada, milisegundosFechaActual);
        System.out.println("Han pasado " + diferenciaEnDias + " dias desde la fecha ingresada hasta la fecha actual.");

    }

    public static double convertirFechaAMilisegundos(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaConvertida = formatoFecha.parse(fecha);
            return fechaConvertida.getTime();
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato correcto.");
            return 0;
        }
    }

    public static double calcularDiferenciaEnDias(double fechaInicio, double fechaFin) {
        double MILISEGUNDOS_POR_DIA = 24 * 60 * 60 * 1000;
        return (fechaFin - fechaInicio) / MILISEGUNDOS_POR_DIA;
    }
}
