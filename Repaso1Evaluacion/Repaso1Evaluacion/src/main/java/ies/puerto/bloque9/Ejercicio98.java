package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que calcule y muestre el número de días entre dos fechas
 * ingresadas por el usuario.
 */
public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera fecha en formato dd/MM/yyyy: ");
        String primeraFecha = scanner.next();
        System.out.print("Ingrese la segunda fecha en formato dd/MM/yyyy: ");
        String segundaFecha = scanner.next();
        calcularDiasEntreFechas(primeraFecha, segundaFecha);

    }

    public static void calcularDiasEntreFechas(String fecha1, String fecha2) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = formatoFecha.parse(fecha1);
            Date date2 = formatoFecha.parse(fecha2);
            double diferenciaEnMilisegundos = Math.abs(date2.getTime() - date1.getTime());
            double diasDiferencia = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);
            System.out.println("El número de días entre las fechas es: " + diasDiferencia + " días.");
        } catch (ParseException e) {
            System.out.println("Error al convertir las fechas. Asegúrese de ingresarlas en el formato correcto.");
        }
    }

}
