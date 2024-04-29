package main.java.es.ies.puerto.intercambio;

import java.io.Serializable;
import java.util.Objects;

public class AliasInt implements Serializable{
    String id;
    String descripcion;

    AliasInt aliasInt;

    public AliasInt() {
       
    }
    public AliasInt(String id, String descripcion, AliasInt aliasInt) {
        this.id = id;
        this.descripcion = descripcion;
        this.aliasInt = aliasInt;
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
        if (!(o instanceof AliasInt)) {
            return false;
        }
        AliasInt aliasInt = (AliasInt) o;
        return Objects.equals(id, aliasInt.id) && Objects.equals(descripcion, aliasInt.descripcion) && Objects.equals(aliasInt, aliasInt.aliasInt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, aliasInt);
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AliasInt getAliasInt() {
        return this.aliasInt;
    }

    public void setAliasInt(AliasInt aliasInt) {
        this.aliasInt = aliasInt;
    }

  
    


    
}
