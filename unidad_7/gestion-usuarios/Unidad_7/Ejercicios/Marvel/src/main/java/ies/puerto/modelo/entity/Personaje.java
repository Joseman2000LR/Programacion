
package ies.puerto.modelo.entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author josem
 */
public class Personaje {
    private int id;
    private String nombre;
    private String alias;
    private String genero;

    public Personaje() {
      
    }
    public Personaje(int id) {
        this.id = id;
        
    }
    public Personaje(int id, String nombre, String alias, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", alias='" + getAlias() + "'" +
            ", genero='" + getGenero() 
            ;
    }

}
