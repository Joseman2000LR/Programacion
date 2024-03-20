package ies.puerto.precentacion;

import java.util.Objects;

public  abstract class Articulo {

    private String id;
    private String nombre;
    private String fehaEntrega ;
    private float precio;


    public Articulo(String id, String nombre, String fehaEntrega, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.fehaEntrega = fehaEntrega;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fehaEntrega='" + fehaEntrega + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
