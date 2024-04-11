package ies.puerto.modelo.entity;
import java.util.Objects;

public class Poderes {
    private int id;
    private int personaje_id;
    private String poderes;

    public Poderes(int id) {
        this.id = id;
       
    }
    public Poderes(int id, int personaje_id, String poderes) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.poderes = poderes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonaje_id() {
        return this.personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public String getPoderes() {
        return this.poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return 
            " id='" + getId() + "'" +
            ", personaje_id='" + getPersonaje_id() + "'" +
            ", poderes='" + getPoderes() ;
    }

}
