package es.ies.puerto;

public class Ejercicio5 {
    /**
     * Potecia de un numero
     */

    public int potencialTradicional(int numero, int potencial) {
        int resusultado = 1;
        for (int i = 0; i < potencial; i++) {
            resusultado *= numero;
        }
        return resusultado;
    }

    public int potencialRecursivo(int numero, int potencial) {

        if (potencial == 0) {
            return 1;
        }

        return numero * potencialRecursivo(numero, potencial - 1);
    }
}
