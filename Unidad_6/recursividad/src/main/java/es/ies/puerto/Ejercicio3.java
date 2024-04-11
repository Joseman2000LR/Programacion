package es.ies.puerto;

public class Ejercicio3 {
    /**
     * Suma de Números Naturales
     */

    public int numeroNaturales(int numero){
        int resultado =0;
        for (int i = numero; i > 0; i--) {
            resultado+=i;
        }
        return resultado;
    }

    public int numeroNaturalesRecursiva(int numero){
        int resultado =0;
        if (numero == 1) {
            return 1;
        }
        return numero+numeroNaturalesRecursiva(numero-1);
    }

}
