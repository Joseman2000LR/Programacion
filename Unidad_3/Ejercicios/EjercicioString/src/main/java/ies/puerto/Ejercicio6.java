package ies.puerto;

/***
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva
 * línea.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        char contador;
        for (int i = 0; i < cadena.length(); i++) {
            contador = cadena.charAt(i);
            System.out.println(contador);
        }
    }
}
