package es.ies.puerto.JPA.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Personajes")
public class Personaje implements Serializable {
    // de uno a muchos
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @TableGenerator(name = "gen_person", table = "table_keys", pkColumnName = "name_table", valueColumnName = "cod_key", pkColumnValue = "person", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
    @Column(name = "id_person")
    private Integer id;
    private String name;
    private String genero;

    public Personaje(Integer id) {
        this.id = id;
    }

    public Personaje(Integer id, String name, String genero) {
        this.id = id;
        this.name = name;
        this.genero = genero;
    }

    public Personaje() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personaje{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", genero='" + genero + '\'' +
            '}';
    }
}
