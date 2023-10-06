
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio2 {
    /**
     * Escribe un programa en Java que encuentre el máximo común divisor (MCD)
     * de dos números. Se debe solicitar los números por teclado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero1, numero2;
        int divisor = 2;
        int resultado;
        int prueba = 0;
        int contador = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        numero1 = lectura.nextInt();
        // System.out.println("Introduce segundo número: ");
        // numero2 = lectura.nextInt();

        for (int j = 0; j < numero1; j++) {
            resultado = j + 2;
            if (numero1 / 2 == resultado) {
                prueba = numero1 / 2;
                contador += 1;
                numero1 = prueba;
                System.out.println(prueba);
            } else if (numero1 / 3 == prueba) {
                prueba = numero1 / 3;
                numero1 = resultado;
                System.out.println(resultado);
            } else if (numero1 / 11 == prueba) {
                prueba = numero1 / 11;
                numero1 = prueba;
                System.out.println(prueba);
            } else {
                System.out.println("error");
            }
        }
    }
}
