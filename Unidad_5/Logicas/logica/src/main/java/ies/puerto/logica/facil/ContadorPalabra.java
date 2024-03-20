
package ies.puerto.logica.facil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class ContadorPalabra {
    public int contador(String palabra){
        String texto =palabra;
        texto = texto.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] palabras = texto.split("\\s+");
        Map<String, Integer> recuentoPalabras = new HashMap<>();

        int frecuenciaPalabra = 0;
        for (String p : palabras) {
            if (p.equals(palabra.toLowerCase())) {
                frecuenciaPalabra++;
            }
        }
       return frecuenciaPalabra;
    }
     
}
