package ies.puerto;

/**
 * Diseñar el algoritmo correspondiente a un programa, que:
 * 
 * Crea una tabla bidimensional de longitud 5x5 y nombre ‘matriz’.
 * Carga la tabla con valores numéricos enteros.
 * Suma todos los elementos de cada fila y todos los elementos de cada columna
 * visualizando los resultados en pantalla.
 */
public class Ejercicio4 {

    /**
     * metodo que ingresa elemento a una matri
     * 
     * @return
     */
    public static int[][] ingresarElemento() {
        int[][] matriz;
        matriz = new int[5][5];
        int valor;
        // para columna
        for (int i = 0; i < matriz.length; i++) {
            valor = (int) Math.floor(Math.random() * 10 + 1);
            matriz[i][0] = valor;

        }
        // para fila
        for (int i = 0; i < matriz.length; i++) {
            valor = (int) Math.floor(Math.random() * 10 + 1);
            matriz[0][i] = valor;

        }
        return matriz;
    }

    /**
     * suma los valores que tienen una mtriz
     * 
     * @param matriz
     * @return
     */
    public void sumarElementos(int[][] matriz) {
        int sumaColumna = 0;
        int sumaFila = 0;
        String resultado = "";
        // para columna
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna += matriz[i][0];
        }
        // para fila
        for (int i = 0; i < matriz.length; i++) {
            sumaFila += matriz[0][i];
        }
        System.out.println("La suma de la columna es " + sumaColumna + " y de la fila es " + sumaFila);

    }

}
