package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.util.List;

public class FileJson extends UtilidadesClass implements ICrudOperaciones {
     @Element(name = "personas")
    List<Persona> personas;
    String path="src/main/resources/data.json";
    @Override
    public List<Persona> obtenerPersonas() {
        return null;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        if (!personas.contains(persona)) {
            return null;
        }
        int posision = personas.indexOf(persona);
        return personas.get(posision);
    }

    @Override
    public void addPersona(Persona persona) {
        if (personas.contains(persona)) {
            return;
        }
        personas.add(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        personas.remove(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
      if(!personas.contains(persona)){

        }
        int posicion =  personas.indexOf(persona);
        personas.set(posicion,persona);
        actualizarFichero(personas);
    }

    private void actualizarFichero(List<persona> personas){
        PersonaList personaList = new PersonaList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
