/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.file;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.PersonajeList;
import ies.puerto.modelo.file.abstrac.Fichero;
import java.io.File;
import java.util.ArrayList;
import ies.puerto.modelo.entity.Personaje;
import java.util.List;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author josem
 */
public class FileXml extends Fichero{
   
    List<Personaje> personajes = new ArrayList<>();
    @Override
    public List<Personaje> leer() {
        if (existe(RUTA_XML)) {
            Persister persister = new Persister(new AnnotationStrategy());
            File file = new File(Fichero.RUTA_XML);
            try {
                PersonajeList personajeList = persister.read(PersonajeList.class, file);
                personajes = personajeList.getPersonajes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personajes;
    }

    @Override
    public boolean actualizar(List<Personaje> personas) {
        
         PersonajeList personajeList = new PersonajeList(personajes);
        try {
            Persister persister = new Persister();
            persister.write(personajeList, new File(RUTA_XML));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean escribir(List<Personaje> personas) {
         return actualizar(personajes);
    }

    @Override
    public boolean modificar(List<Personaje> personas) {
        return actualizar(personas);
    }

   
}
