package ies.puerto;


import java.util.Scanner;

public class Ejercicio9 {

    public static boolean esPositivo(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("El numero " + numero + " es negativo");
        }
        return true;

    }

    public static void main(String[] args) throws NumeroNegativoException {
        Scanner lectura = new Scanner(System.in);
        System.out.print("insertra un numero mayor a 0 o menor 0");
        int numero = lectura.nextInt();
        if (esPositivo(numero)) {
            System.out.println("El numero" + numero + ", es positivo");
        }

    }

}
