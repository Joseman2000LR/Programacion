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
        int n = 0;
        int suma = 0;

        for (n = 0; n < 10; n++) {
            suma = n + 1;
            System.out.print(suma + "+");
        }
    }
}