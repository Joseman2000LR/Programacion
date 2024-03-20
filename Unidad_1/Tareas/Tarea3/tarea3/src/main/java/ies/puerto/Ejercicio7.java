package ies.puerto;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio7 {

    /**
     * Imprimir el nombre del día de la semana correspondiente a un número ingresado
     * por el usuario utilizando una estructura switch.
     * El día a verificar se debe de pedir por teclado.
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("El numero introducido no corresponde a dia de la semana" + numero);
                break;
        }
    }
}