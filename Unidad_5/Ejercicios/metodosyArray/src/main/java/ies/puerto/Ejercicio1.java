package ies.puerto;

/**
 * un programa que calcule la suma de todos los elementos en un array de
 * enteros.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }

    /**
     * metodo que calcul la suma de todos los numero que tiene una lista
     * 
     * @return
     */
    public int calcularSuma() {
        int sumar = 0;
        int[] numeros = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numeros.length; i++) {
            sumar += numeros[i];
        }
        mostrarResultado(sumar);
        return sumar;
    }

    /**
     * metodo que muestra el resultado de la suma
     * 
     * @param sumar
     * @return
     */
    public static String mostrarResultado(int sumar) {
        String resultado = "La suma de los elementos es: ";
        return resultado + sumar;
    }
}