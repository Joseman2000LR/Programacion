
package ies.puerto.modelo.entity;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author josem
 */
@Root(name = "personajes")
public class PersonajeList {
    @ElementList(inline = true)
    private List<Personaje> personajes;

    public List<Personaje> getPersonajes() {
        return this.personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
    public PersonajeList(List<Personaje> personajes) {
        this.personajes = personajes;
    }
    public PersonajeList() {
    }
}
