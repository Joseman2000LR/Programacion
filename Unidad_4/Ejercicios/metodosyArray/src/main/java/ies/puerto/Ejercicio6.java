package ies.puerto;

public class Ejercicio6 {

    public static void main(String[] args) {
        mostarMastrizOriginal();
        matrizTranspuesta();
    }

    /**
     * metodo que cambia fila y la columna de una matrix
     */
    public static void matrizTranspuesta() {
        String resultado = "";
        int[][] matrizOriginal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrizOriginal.length; i++) {
            System.out.println(matrizOriginal[0][i] + "" + matrizOriginal[1][i] + "" + matrizOriginal[2][i]);
        }
    }

    /**
     * Metodo que muestra por consola una matrix bidirecional
     * 
     * @param matriz
     * @return
     */
    public static void mostarMastrizOriginal() {

        int[][] matrizOriginal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrizOriginal.length; i++) {
            System.out.print(matrizOriginal[0][i]);
        }
        System.out.println("");
        for (int i = 0; i < matrizOriginal.length; i++) {
            System.out.print(matrizOriginal[1][i]);
        }
        System.out.println("");
        for (int i = 0; i < matrizOriginal.length; i++) {
            System.out.print(matrizOriginal[2][i]);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
