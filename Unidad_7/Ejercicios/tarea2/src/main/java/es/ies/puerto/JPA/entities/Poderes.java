package es.ies.puerto.JPA.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Poderes")
public class Poderes implements Serializable {
    @Id
    @TableGenerator(name = "gen_person", table = "table_keys", pkColumnName = "name_table", valueColumnName = "cod_key", pkColumnValue = "person", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id ;
    private String poder;
    public Poderes() {

    }
    public Poderes(int id) {
        this.id = id;
    }

    public Poderes(int id, String poder) {
        this.id = id;
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }



}
