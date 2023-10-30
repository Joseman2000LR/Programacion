package ies.puerto;

public class Ejercicio4 {

    /**
     * Metodo que busca los numeros pares de una lista
     * 
     * @return
     */
    public String buscarPares() {
        String resultado = "";
        int primos;
        int[] numeros = { 1, 2, 3, 5, 4 };
        for (int i = 0; i < numeros.length; i++) {
            primos = numeros[i];
            if (esPar(primos) == true) {
                resultado += primos;
            }
        }
        mostarResultado(resultado);
        return resultado;
    }

    /**
     * Metodo que verifica el el numero dado es par o impar
     * 
     * @param numero dado por el usuario
     * @return true si es par y si es false es impar
     */
    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        }

        return false;
    }

    /**
     * Metodo que muestra el resultado
     * 
     * @param resultado
     */
    public static void mostarResultado(String resultado) {
        System.out.println(resultado);
    }
}
