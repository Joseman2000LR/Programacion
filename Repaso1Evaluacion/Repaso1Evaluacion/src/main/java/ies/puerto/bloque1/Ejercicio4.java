package ies.puerto.bloque1;

import java.util.Scanner;

/**
 * Escribe un programa que muestre tu nombre, tu edad y tu hobby favorito en
 * líneas separadas, similar a un perfil básico.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre;
        String hobby;
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre ");
        nombre = scanner.nextLine();
        System.out.println("Dime tu edad ");
        edad = scanner.nextInt();
        System.out.println("Dime tu hobby ");
        hobby = scanner.nextLine();
        System.out.println("tu nombre es :" + nombre);
        System.out.println(" tu edad es :" + edad);
        System.out.println(" tu hobby es :" + hobby);
    }

}