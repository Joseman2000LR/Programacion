package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        dia = teclado.nextInt();
    }

    public String calcularDia(int dia) {
        String resultado = "";
        switch (dia) {
            case 1:
                resultado = "Lunes";
                break;
            case 2:
                resultado = "Martes";
                break;
            case 3:
                resultado = "Miercoles";
                break;
            case 4:
                resultado = "Jueves";
                break;
            case 5:
                resultado = "Viernes";
                break;
            case 6:
                resultado = "Sabado";
                break;
            case 7:
                resultado = "Domingo";
                
                break;

            default:
                System.out.println("El dia introducido no corresponde a dia de la semana" + dia);
                break;
        }
        return resultado;
    }
}