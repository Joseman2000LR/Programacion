package ies.puerto.abstarc;

/**
 * Persona
 */
public abstract class Persona {
    public String nombre;
    public String fechaNacimiento;

    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", fechaNacimiento='" + getFechaNacimiento() + "'" +
                "}";
    }

    public abstract int anios();
}