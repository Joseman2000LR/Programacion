package ies.puerto;

/**
 * Dado un valor específico, encuentra su posición en el array o indica si no
 * está presente
 */
public class Ejercicio5 {
    public static void main(String[] args) {

    }

    /**
     * Metodo que busca un numero dado y indica en que posision esta ese numero
     * 
     * @param numero indicado
     * @return indica si el numero esta en la lista en su posicion o si
     *         no indica que no esta en la lista
     */
    public static String buscarElemento(int numero) {
        int indicador = 0;
        int calculo;
        String resultado;
        int[] numeros = { 1, 2, 3, 4, 8, 6, 5, 9, 10 };
        for (int i = 0; i < numeros.length; i++) {
            indicador = numeros[i];
            if (indicador == numero) {
                calculo = numero - 1;
                return resultado = "El numero esta en la posicion " + calculo;
            }
        }
        return resultado = "El numero indicado " + numero + " no esta en la lista";
    }
}
