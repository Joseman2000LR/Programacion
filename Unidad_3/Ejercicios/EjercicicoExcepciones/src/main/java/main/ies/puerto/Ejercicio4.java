package main.ies.puerto;

/***
 * Escribe un programa que encuentre el primer número negativo en un array,
 * utilizando break.
 */
public class Ejercicio4 {

    public void encontrarNumero() {
        int[] array = { 1, -2, 4, 5, -4 };
        for (int i : array) {
            if (i > 0) {
                System.out.println(array[1]);
                break;
            }
        }
    }
}
