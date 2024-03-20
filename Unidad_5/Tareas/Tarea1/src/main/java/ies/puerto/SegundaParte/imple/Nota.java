package ies.puerto.SegundaParte.imple;

import java.util.Objects;

/**
 *
 * @author josemanuel
 */
public class Nota {
    private String nombre;
    private float valor;

    public Nota(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Nota nota = (Nota) object;
        return java.util.Objects.equals(nombre, nota.nombre);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre);
    }

    @Override
    public String toString() {
        return "Nota" + " nombre =" + nombre + ", valor =" + valor;
    }

}
