package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {

    }

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

    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void mostarResultado(String resultado) {
        System.out.println(resultado);
    }
}
