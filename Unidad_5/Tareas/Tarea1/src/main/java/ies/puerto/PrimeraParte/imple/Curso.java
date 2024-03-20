package ies.puerto.imple;
import ies.puerto.imple.Alumno;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    Alumno alumno;
    private List<Alumno> alumnos;
    private String ID;

    public Curso(String ID) {
        this.ID = ID;
        this.alumnos = new ArrayList<>();
    }

    public Curso(List<Alumno> alumnos, String ID) {
        this.alumnos = alumnos;
        this.ID = ID;
    }

    /**
     * 
     */
    public void agregarAlumno(List<Alumno> alumnos,String nombre , String apellidos) {
       Alumno nuevoAlumno = new Alumno(nombre, apellidos);
        alumnos.add(nuevoAlumno);
    }

    public void EliminarAlumno(List<Alumno> alumnos,String nombreAlumno) {
       for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(nombreAlumno)) {
                alumnos.remove(i);
                return;
            }
        }
    }

    /**
     * 
     * @return
     */
    public float media() {
        float resultado = 0;
        if (alumnos.isEmpty()) {
            return resultado;
        }
        for (Alumno alumno : alumnos) {
            resultado += alumno.calcularPromedioCalificaciones();
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

    @Override
    public String toString() {
        return "{" +
                " alumnos='" + getAlumnos() + "'" +
                ", ID='" + getID() + "'" +
                "}";
    }

}
