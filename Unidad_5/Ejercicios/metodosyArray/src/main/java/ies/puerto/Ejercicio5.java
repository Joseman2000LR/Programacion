package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 10;
        buscarElemento(numero);
    }

    public static String buscarElemento(int numero) {
        int indicador = 0;
        int calculo;
        String resultado;
        int[] numeros = { 1, 2, 3, 4, 8, 6, 5, 9, 10 };
        for (int i = 0; i < numeros.length; i++) {
            indicador = numeros[i];
            if (indicador == numero) {
                calculo = numero - 1;
                resultado = "El numero esta en la posicion " + calculo;
            } else {
                resultado = "El numero indicado " + numero + " no esta en la lista";
            }

        }
        return resultado;
    }
}
