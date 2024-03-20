package ies.puerto.App;

import java.util.ArrayList;
import java.util.List;

import main.java.ies.puerto.Persona;

public class AppPersona {
    static Persona ramon;
    static Persona juan;
    static String dni1 = "12345678T";
    static String dni2 = "12345678H";
    static List<Persona> personas;

    public static void main(String[] args) {
        ramon = new Persona(dni1, "ramon", "Gonzales", "Perez");
        juan = new Persona(dni2, "juan", "Gonzales", "Perez");
        personas = new ArrayList<>();
        personas.add(ramon);
        personas.add(juan);
        System.out.println(personas);
        Persona ramon2 = new Persona(dni1, "ramon", "Gonzales", "Perez");
        if (personas.contains(ramon)) {
            System.out.println("La lista contienena a mas " + ramon);
        }

        System.out.println(ramon.media());
    }
}
