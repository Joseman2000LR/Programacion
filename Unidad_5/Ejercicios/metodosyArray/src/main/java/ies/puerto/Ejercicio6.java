package ies.puerto;

public class Ejercicio6 {
    public static void main(String[] args) {
        matrizTranspuesta();
    }

    public static void matrizTranspuesta() {
        int[][] matrizOriginal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int trasformar;

        for (int i = 0; i < matrizOriginal.length; i++) {

            // System.out.println(matrizOriginal[1][i]);
        }
        mostarMastriz(matrizOriginal);
    }

    /**
     * Metodo que muestra por consola una matrix bidirecional
     * 
     * @param matriz
     */
    public static void mostarMastriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[0][i]);

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[1][i]);

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[2][i]);
        }
    }
}
