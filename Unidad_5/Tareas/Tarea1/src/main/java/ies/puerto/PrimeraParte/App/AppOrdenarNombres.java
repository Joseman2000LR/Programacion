package ies.puerto.PrimeraParte.App;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class AppOrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Ingrese los nombres ");
        String nombre;
        for (int i = 0; i < 5; i++) {
            nombre = scanner.nextLine();
            nombres.add(nombre);
        }
        ordenar(nombres);
        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombreOrdenado : nombres) {
            System.out.println(nombreOrdenado);
        }
    }
    public static void ordenar(ArrayList<String> nombres) {
        int n = nombres.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nombres.get(j).compareToIgnoreCase(nombres.get(j + 1)) > 0) {
                    // Intercambiamos nombres
                    String temp = nombres.get(j);
                    nombres.set(j, nombres.get(j + 1));
                    nombres.set(j + 1, temp);
                }
            }
        }
    }
}
