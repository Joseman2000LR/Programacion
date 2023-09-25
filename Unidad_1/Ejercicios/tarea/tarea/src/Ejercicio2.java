import java.util.Scanner;

/**
 * @author Nombre del autor
 */
public class Ejercicio2 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
     public static void main(String[] args) {
        int valorA, valorB, valorC;
        Scanner lectura = new Scanner(System.in);
        do {
            System.out.println("Introduzca  valore  A");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A : " + valorA);

            System.out.println("Introduzca  valore  B");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B : " + valorB);

            System.out.println("Introduzca  valore  C");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable C : " + valorC);

            if (valorA == valorB && valorA == valorC && valorB == valorC) {
                System.out.println("Los valores son iguales ");
            }
        } while (valorA == valorB && valorA == valorC && valorB == valorC);
        // Verificacion
        if (valorA > valorB && valorA > valorC) {
            System.out.println("El valor de A es Mayor ");
        }
        if (valorB > valorA && valorB > valorC) {
            System.out.println("El valor de B es Mayor ");
        }
        if (valorB > valorA && valorB > valorC) {
            System.out.println("El valor de C es Mayor ");
        }

    }
}