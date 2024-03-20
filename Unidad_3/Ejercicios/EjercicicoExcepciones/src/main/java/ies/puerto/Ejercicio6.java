package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato
 * incorrecto y luego intente convertirla a un objeto Date. Maneja la excepción
 * ParseException.
 * 
 */
public class Ejercicio6 {

    public static void ingresarFecha() {
        Scanner lectura = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese una fecha en formato dd/MM/yyyy:");
        String fechaIngresada = lectura.nextLine();
        try {
            Date fecha = formato.parse(fechaIngresada);
            System.out.println("Fecha convertida: " + fecha);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Formato incorrecto." + e);
        }
    }

    public static void main(String[] args) {
        ingresarFecha();
    }
}
