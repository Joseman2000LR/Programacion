package ies.puerto.modelo.entity;

import java.util.Objects;

public class Poderes {
    private int id;
    private int personaje_id;
    private String poder;

    public Poderes(int id) {
        this.id = id;

    }

    public Poderes(int id, int personaje_id, String poder) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.poder = poder;
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

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return " id='" + getId() + "'" +
                ", personaje_id='" + getPersonaje_id() + "'" +
                ", poderes='" + getPoder();
    }

}
