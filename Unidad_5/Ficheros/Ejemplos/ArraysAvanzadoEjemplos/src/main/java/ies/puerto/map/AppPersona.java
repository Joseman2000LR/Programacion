package ies.puerto.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {
    Persona persona;
    static HashMap<String, Persona> personaHasMap;
    static List<Persona> personaList;

    public static void main(String[] args) {
        personaHasMap = new HashMap<>();
        personaList = new ArrayList<>();

        Persona persona1 = new Persona("Pepe", "12345678F");
        addPersonaList(persona1);
        addPersonaHashMap(persona1);
    }

    public static boolean addPersonaList(Persona persona) {
        if (!existePersonaList(persona)) {
            return personaList.add(persona);
        }
        return true;
    }

    public static boolean existePersonaList(Persona persona) {
        if (personaList.isEmpty()) {
            return false;
        }
        if (!personaList.contains(persona)) {
            return false;
        }

        return true;
    }

    public static boolean addPersonaHashMap(Persona persona) {
        if (!existePersonaHashMap(persona)) {
            personaHasMap.put(persona.getDni(), persona);

        }
        return true;
    }

    public static boolean existePersonaHashMap(Persona persona) {
        if (personaHasMap.isEmpty()) {
            return false;
        }
        if (!personaHasMap.containsKey(persona.getDni())) {
            return false;
        }
        return true;
    }

}
