package ies.puerto.Ejemplo;

public class Ejemplo2 {
    public static void main(String[] args) {
        int numero = 10;
        int divisor = 0;
        try {
            int divicion = numero / divisor;
            System.out.println("numero dividido por 0: " + divicion);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Se a producido error  arithmeticException," +
                    " mensaje" + arithmeticException.getMessage());
        }

    }
}
