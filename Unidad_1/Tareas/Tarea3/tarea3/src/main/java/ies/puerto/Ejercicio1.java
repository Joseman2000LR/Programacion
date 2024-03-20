package ies.puerto;




/**
 * @author Joseman2000LR
 */
public class Ejercicio1 {

    /**
     * un programa en Java que imprima el patrón siguiente
     * 1
     * 
     * 2 3
     * 
     * 4 5 6
     * 
     * 7 8 9 10
     * 
     * @param args
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 1; i++) {
            if (i == 1) {
                System.out.println(i);
                System.out.println(" ");
            }
            // primer bucle hace el 2 y 3
            for (int h = 2; h < 4; h++) {
                System.out.print(h + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
            // segundo bucle hace el 4 ,5, 6
            for (int p = 4; p < 7; p++) {
                System.out.print(p + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
            // tercer bucle hace el 7,8, 9 y 10
            for (int d = 7; d < 11; d++) {
                System.out.print(d + " ");
            }
            System.out.println(" ");
        }
    }

}