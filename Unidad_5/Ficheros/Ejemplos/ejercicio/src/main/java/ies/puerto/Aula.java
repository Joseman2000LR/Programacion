package main.java.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private List<Alumno> alumnos;
    private String ID;

    public Aula(String ID) {
        this.ID = ID;
        this.alumnos = new ArrayList<>();
    }

    public Aula(List<Alumno> alumnos, String ID) {
        this.alumnos = alumnos;
        this.ID = ID;
    }

    public float media() {
        float resultado = 0;
        if (alumnos.isEmpty()) {
            return resultado;
        }
        for (Alumno alumno : alumnos) {
            resultado += alumno.media();
        }
        return resultado / alumnos.size();
    }

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
