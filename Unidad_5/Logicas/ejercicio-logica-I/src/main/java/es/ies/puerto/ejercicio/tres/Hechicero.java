package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        String lowwerCase = texto.toLowerCase();
        String[] runa = lowwerCase.split("");
        Map<Integer, String> runMap = new HashMap<>();
        char vocal = ' ';
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i < runa.length; i++) {
            runMap.put(1, runa[i]);
        }
        for (int j = 0; j < runa.length; j++) {
            if (runMap.get(j).equals("a")) {
                contadorA++;
            }
            if (runMap.get(j).equals("e")) {
                contadorE++;
            }
            if (runMap.get(j).equals("i")) {
                contadorI++;
            }
            if (runMap.get(j).equals("o")) {
                contadorO++;
            }
            if (runMap.get(j).equals("u")) {
                contadorU++;
            }

        }
        if (contadorA > contadorE && contadorA > contadorI && contadorA > contadorO && contadorA > contadorU) {
            vocal = 'a';
            return vocal;
        }
        if (contadorE > contadorA && contadorE > contadorI && contadorE > contadorO && contadorE > contadorU) {
            vocal = 'e';
            return vocal;
        }
        if (contadorI > contadorE && contadorI > contadorA && contadorI > contadorO && contadorI > contadorU) {
            vocal = 'i';
            return vocal;
        }

        if (contadorO > contadorE && contadorO > contadorI && contadorO > contadorA && contadorO > contadorU) {
            vocal = 'o';
            return vocal;
        }
        if (contadorU > contadorE && contadorU > contadorI && contadorU > contadorO && contadorU > contadorA) {
            vocal = 'u';
            return vocal;
        }

        return vocal;
    }
}
