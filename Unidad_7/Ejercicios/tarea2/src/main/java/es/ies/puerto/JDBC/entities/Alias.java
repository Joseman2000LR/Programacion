package es.ies.puerto.JDBC.entities;

public class Alias {
    private int id ;
    private int personaje_id ;
    private String alias;


    public Alias(int id) {
        this.id = id;
       
    }

    public Alias(int id, int personaje_id, String alias) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.alias = alias;
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

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", personaje_id='" + getPersonaje_id() + "'" +
            ", alias='" + getAlias() + "'" +
            "}";
    }

}
