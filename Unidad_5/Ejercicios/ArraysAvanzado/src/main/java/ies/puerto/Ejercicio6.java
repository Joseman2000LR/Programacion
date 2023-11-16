package ies.puerto;

/**
 * Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
 * Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
 * posiciones o elementos que delimitan la tabla, es decir, las más externas,
 * mientras que el resto de los elementos contendrán el valor 0.
 * Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
 * Visualiza el contenido de la matriz en pantalla.
 */
public class Ejercicio6 {
    int[][] marco = new int[5][15];

    public static int[][] cargaConteniddo(int[][] marco) {
        for (int i = 0; i < marco.length; i++) {
            for (int k = 0; k < 15; k++) {
                if (i == 0 || i == 4) {
                    marco[i][k] = 1;
                } else if (i == 1 && k == 0 || k == 14) {
                    marco[i][k] = 1;
                } else if (i == 2 && k == 0 || k == 14) {
                    marco[i][k] = 1;
                } else if (i == 3 && k == 0 || k == 14) {
                    marco[i][k] = 1;
                }
            }
        }
        return marco;
    }

    public static void imprimir(int[][] marco) {
        cargaConteniddo(marco);
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        cargaConteniddo(marco);
        imprimir(marco);
    }
}
