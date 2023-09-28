package ies.puerto;

/**
 * @author Joseman2000LR
 */
public class Ejercicio3 {

    /**
     * algoritmo que realice la sumatoria de los números enteros
     * comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10
     *
     * @param args
     */
    public static void main(String[] args) {
        int suma = 0;
        int h = 0;
        // bucle for
        for (int n = 0; n <= 10; n++) {
            suma = n + 1;
            System.out.print(suma + "+");
        }
        // bucle while
        while (h <= 10) {
            suma = h + 1;
            System.out.print(suma + "+");
            h++;
        }

    }
}
