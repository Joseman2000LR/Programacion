package es.ies.puerto.JPA.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Alias")
public class Alias implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @TableGenerator(name = "gen_person", table = "table_keys", pkColumnName = "name_table", valueColumnName = "cod_key", pkColumnValue = "person", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id;
    private int personaje_id;

    public Alias() {

    }

    public Alias(int id) {
        this.id = id;
    }
    public Alias(int id, int personaje_id) {
        this.id = id;
        this.personaje_id = personaje_id;
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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return id == alias.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Alias" +
            "id=" + id +
            ", personaje_id=" + personaje_id
            ;
    }
}
