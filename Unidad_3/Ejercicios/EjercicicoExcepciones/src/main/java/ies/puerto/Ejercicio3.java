package ies.puerto;

/***
 * Declara un array de 3 elementos e intenta acceder al cuarto elemento. Maneja
 * la excepción ArrayIndexOutOfBoundsException.
 */
public class Ejercicio3 {
    int[] array = new int[3];

    /**
     * Metodo que busca elemento de una array
     * 
     * @param array
     */
    public static void buscarElemneto(int[] array) {
        try {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se a producido error  ArrayIndexOutOfBoundsException ," +
                    " mensaje" + e.getMessage());
        }

    }

    public static void main(String[] args) {
        int[] array = new int[3];
        buscarElemneto(array);
    }
}
