package ies.puerto;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
        System.out.print("Valores iniciales del array: ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
        int[] resultado = eliminarDuplicados(array);

        System.out.print("Resultado final: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }

    public static int[] eliminarDuplicados(int[] array) {
        int contador = 0;

        // Recorrer el array para contar elementos únicos
        for (int i = 0; i < array.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                contador++;
            }
        }

        // Crear un nuevo array con elementos únicos
        int[] resultado = new int[contador];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                resultado[index] = array[i];
                index++;
            }
        }

        return resultado;
    }
}
