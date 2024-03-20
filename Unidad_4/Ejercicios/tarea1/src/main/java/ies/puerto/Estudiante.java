package ies.puerto;

public class Estudiante extends Persona {
    private String curso;
    private String notas;

    public Estudiante() {

    }

    /**
     * Contrutor con todos los atributos Estudiante
     * 
     * @param nombre
     * @param edad
     * @param dni
     * @param curso
     * @param notas
     */
    public Estudiante(String nombre, int edad, String dni, String curso, String notas) {
        super(nombre, edad, dni);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNotas() {
        return this.notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String saludar() {
        return "Hola soy estudiante";
    }

    @Override
    public String toString() {
        return "El estudiante esta  " +
                " curso" + getCurso() +
                " notas='" + getNotas();
    }

}
