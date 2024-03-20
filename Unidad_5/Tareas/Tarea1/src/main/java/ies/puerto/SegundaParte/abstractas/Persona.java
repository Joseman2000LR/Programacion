package ies.puerto.SegundaParte.abstractas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author josemanuel
 */
public abstract class Persona {
    private String nombre;
    private String dni;
    private String fechaNacimiento;

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        anios(fechaNacimiento);// #1

    }

    /**
     * Funcion que calcula la edad a partir de la fecha de nacimiento
     * 
     * @return edad
     */
    public int anios(String fechaNacimiento) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimientoDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - fechaNacimientoDate.getYear();

        if (fechaNacimientoDate.getMonthValue() > fechaActual.getMonthValue() ||
                (fechaNacimientoDate.getMonthValue() == fechaActual.getMonthValue() &&
                        fechaNacimientoDate.getDayOfMonth() > fechaActual.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
