package ies.puerto.modelo.implementacion;

import java.util.Objects;

public class Alimento extends ModelPropertiesAbstract{
    private String id;
    private String nombre;
    private String tipo;
    private String Calorias;
    private String proteinas;
    private String grasas;
    private String carbohidratos;


    public Alimento(String id) {
        this.id = id;
    }

    public Alimento(String id, String nombre, String tipo, String Calorias, String proteinas, String grasas,
            String carbohidratos) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.Calorias = Calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalorias() {
        return this.Calorias;
    }

    public void setCalorias(String Calorias) {
        this.Calorias = Calorias;
    }

    public String getProteinas() {
        return this.proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getGrasas() {
        return this.grasas;
    }

    public void setGrasas(String grasas) {
        this.grasas = grasas;
    }

    public String getCarbohidratos() {
        return this.carbohidratos;
    }

    public void setCarbohidratos(String carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", Calorias='" + getCalorias() + "'" +
                ", proteinas='" + getProteinas() + "'" +
                ", grasas='" + getGrasas() + "'" +
                ", carbohidratos='" + getCarbohidratos() + "'" +
                "}";
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
        final Alimento other = (Alimento) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

}
