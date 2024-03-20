package ies.puerto.bloque9;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que, dado un mes y año ingresados por el usuario, calcule
 * y muestre cuántos días faltan hasta el final del mes.
 */
public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        int diasFaltantes = calcularDiasHastaFinalDelMes(mes, anio);
        if (diasFaltantes != -1) {
            System.out.println("Días faltantes hasta el final del mes: " + diasFaltantes + " días.");
        } else {
            System.out.println("Mes ingresado no válido. Asegúrese de ingresar un mes entre 1 y 12.");
        }

    }

    public static int calcularDiasHastaFinalDelMes(int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return -1;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, 1);
        int ultimoDiaDelMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date fechaActual = new Date();
        int diasFaltantes = ultimoDiaDelMes - calendar.get(Calendar.DAY_OF_MONTH);
        return diasFaltantes;
    }
}
