package ies.puerto.negocio;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.file.interfaces.IFicheros;
import ies.puerto.negocio.interfaces.INegocio;
import java.util.List;

/**
 *
 * @author josem
 */
public class Negocio  {

    IFicheros ficheros;
    List<Personaje> personas;

    public Negocio() {
       
        personas = ficheros.leer();
    }

    
    public Personaje obtenerPersonaje(int id) {
        Personaje personajeBuscar = new Personaje(id, null, null, null, null);
        if (personas.isEmpty() || !personas.contains(personajeBuscar)) {
            return null;
        }
        int index = personas.indexOf(personajeBuscar);
        return personas.get(index);
    }

    @Override
    public boolean agregarPersona(Personaje personaje) {
        if (personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }

    @Override
    public boolean actualizarPersona(Personaje personaje) {
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return false;
        }
        personas.remove(personaje);
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }

    public boolean eliminarPersona(int id) {
        Personaje personaje = obtenerPersonaje(id);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.remove(personaje);
        return ficheros.actualizar(personas);
    }

    public List<Personaje> obtenerPersonajes() {
        return ficheros.leer();
    }

    public List<Personaje> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Personaje> personas) {
        this.personas = personas;
        ficheros.actualizar(personas);
    }

}
