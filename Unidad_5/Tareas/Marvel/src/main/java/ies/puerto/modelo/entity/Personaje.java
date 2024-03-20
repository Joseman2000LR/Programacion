/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.entity;

import com.google.gson.annotations.SerializedName;
import ies.puerto.modelo.file.abstrac.Fichero;
import java.util.List;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author josem
 */
@Root(name = "personaje")
public class Personaje {
    
   @SerializedName("nombre")
    @Element(name = "nombre")
    private String nombre;

    @SerializedName("alias")
    @Element(name = "alias")
    private String alias;

    @SerializedName("genero")
    @Element(name = "genero")
    private String genero;

    @SerializedName("poderes")
    @ElementList(name = "poderes", entry = "poder")
    private List<String> poderes;


    public Personaje() {
    }

    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
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

    public List<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }
 
    
    public String toCsv() {
        return nombre + Fichero.SEPARADOR + alias + Fichero.SEPARADOR + genero + Fichero.SEPARADOR + poderesToCsv();
    }

    /**
     * Enseña los poderes en formato CSv
     * 
     * @return los poderes formateados
     */
    public String poderesToCsv() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < poderes.size() - 1) {
            stringBuilder.append(poderes.get(i)).append(Fichero.SEPARADOR);
            i++;
        }
        stringBuilder.append(poderes.get(i));
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personaje other = (Personaje) obj;
        return Objects.equals(this.alias, other.alias);
    }

    

    
}
