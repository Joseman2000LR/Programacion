package ies.puerto;

public class Ejercicio10 {
    public static void main(String[] args) {
        mostarMastrizOriginal();
    }

    /**
     * /**
     * Metodo que muestra por consola una matrix bidirecional
     * 
     * @param matriz
     * @return
     */
    public static void mostarMastrizOriginal() {

        int[][] matrizOriginal = { { 1, 0, 0}, { 0, 5, 0 }, { 0, 0, 9 } };
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
    }
}
