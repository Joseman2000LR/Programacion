package ies.puerto.logica.facil;

/**
 *
 * @author josem
 */
public class InvirtiendoCadenas {
    
    public static String invertirCadena(String texto) {
        char[] caracteres = texto.toCharArray();
        int izquierda = 0;
        int derecha = caracteres.length - 1;

        while (izquierda < derecha) {
            char temp = caracteres[izquierda];
            caracteres[izquierda] = caracteres[derecha];
            caracteres[derecha] = temp;
            izquierda++;
            derecha--;
        }

        return new String(caracteres);
    }
}
