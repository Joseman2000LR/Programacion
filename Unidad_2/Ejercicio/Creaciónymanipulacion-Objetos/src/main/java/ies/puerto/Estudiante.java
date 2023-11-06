package ies.puerto;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carreta;
    private int promedio;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, String carreta, int promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carreta = carreta;
        this.promedio = promedio;
    }

    /**
     * Metodo que dice si el estudiante esta aprobado
     * 
     * @return
     */
    public boolean aprobado(int promedio) {
        if (promedio >= 5) {
            return true;
        }
        return false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarreta() {
        return this.carreta;
    }

    public void setCarreta(String carreta) {
        this.carreta = carreta;
    }

    public int getPromedio() {
        return this.promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "nombre='" + getNombre() + "'" +
                ", edad='" + getEdad() + "'" +
                ", carreta='" + getCarreta() + "'" +
                ", promedio='" + getPromedio() + "'";
    }

}
