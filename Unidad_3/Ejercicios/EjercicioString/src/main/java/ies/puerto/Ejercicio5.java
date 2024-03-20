package ies.puerto;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica
 * en una cadena de texto
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "hola mundo aqui hay muchas h";
        Character letra = 'h';
        Character letraAcambiar = 'i';
        reemplacarLetra(letra, letraAcambiar, cadena);
    }

    public static void reemplacarLetra(Character letra, Character letraAcambiar, String cadena) {
        char buscar;
        for (int i = 0; i < cadena.length(); i++) {
            buscar = cadena.charAt(i);
            if (buscar == letra) {
                buscar = letraAcambiar;
            }
            System.out.print(buscar);
        }
    }
}
