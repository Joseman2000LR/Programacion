package ies.puerto;

/***
 * Diseñar el algoritmo correspondiente a un programa, que:
 * 
 * Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
 * Carga la tabla de forma que los componentes pertenecientes a la diagonal de
 * la matriz tomen el valor 1 y el resto el valor 0.
 * Muestra el contenido de la tabla en pantalla.
 */
public class Ejercicio5 {
    int[][] diagonal = new int[5][5];

    /**
     * ingreasar valor el la diagonal de una matriz
     * 
     * @param diagonal
     * @return
     */
    public int[][] matrizDiaonal(int[][] diagonal) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                }
            }
        }
        return diagonal;
    }

    public int[][] matriz(int[][] diagonal) {
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i][i] = 1;
        }
        return diagonal;
    }

    /**
     * 
     * @param diagonal
     */
    public void imprimir(int[][] diagonal) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

}
