package ies.puerto.negocio;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.file.FileCsv;
import ies.puerto.modelo.file.FileJson;
import ies.puerto.modelo.file.FileXml;
import ies.puerto.modelo.file.interfaces.IFicheros;
import ies.puerto.negocio.interfaces.INegocio;
import java.util.List;

/**
 *
 * @author josem
 */
public class Negocio implements INegocio{
    
    IFicheros ficheros;
    List<Personaje> personas;
    public Negocio() {
        ficheros = new FileXml();
        personas = ficheros.leer();
    }

    @Override
    public Personaje obtenerPersonaje(String alias) {
         Personaje personajeBuscar = new Personaje(null, alias, null, null);
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

    @Override
    public boolean eliminarPersona(String alias) {
        Personaje personaje = obtenerPersonaje(alias);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.remove(personaje);
        return ficheros.actualizar(personas);
    }

    @Override
    public String mostrarPersonajesTodosFormatos() {
         StringBuilder stringBuilder = new StringBuilder();
        IFicheros ficherosMostrar = new FileXml();
        stringBuilder.append("XML:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new FileJson();
        stringBuilder.append("JSON:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new FileCsv();
        stringBuilder.append("CSV:\n").append(ficherosMostrar.leer()).append("\n");
        return stringBuilder.toString();
    }
    
    public List<Personaje> obtenerPersonajes(){
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
