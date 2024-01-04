package ies.puerto.bloque9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que, dado un número de días ingresado por el usuario,
 * calcule y muestre la fecha resultante en el futuro desde la fecha actual.
 */
public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nimero de dias en el futuro: ");
        int diasEnElFuturo = scanner.nextInt();
        calcularFechaEnElFuturo(diasEnElFuturo);

    }
     public static void calcularFechaEnElFuturo(int diasEnElFuturo) {
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);
        calendar.add(Calendar.DAY_OF_MONTH, diasEnElFuturo);
        Date fechaEnElFuturo = calendar.getTime();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fechaEnElFuturo);
        System.out.println("La fecha en el futuro despues de " + diasEnElFuturo + " dias será: " + fechaFormateada);
    }
}
