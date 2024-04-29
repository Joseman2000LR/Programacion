package main.java.es.ies.puerto.intercambio;
import java.util.Objects;

public class PersonajeInt {
    String id;
    AliasInt alias;


    public PersonajeInt(String id, AliasInt alias) {
        this.id = id;
        this.alias = alias;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonajeInt)) {
            return false;
        }
        PersonajeInt personajeInt = (PersonajeInt) o;
        return Objects.equals(id, personajeInt.id) && Objects.equals(alias, personajeInt.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias);
    }

    public AliasInt getAlias() {
        return this.alias;
    }

    public void setAlias(AliasInt alias) {
        this.alias = alias;
    }

}
