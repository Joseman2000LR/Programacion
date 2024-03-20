package ies.puerto.logica.facil;

/**
 *
 * @author josem
 */
public class Palindramo {
    
    public boolean verificar(String palabra){
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();
       
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
}
