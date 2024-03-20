package ies.puerto.PrimeraParte.App;

import ies.puerto.imple.Alumno;
import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class AppAlumno {
    static ArrayList<Float> calificacionesJuan;
    static ArrayList<Float> calificacionesMaria;

    public static void main(String[] args) {
        calificacionesJuan = new ArrayList<>();
        calificacionesJuan.add(8.5f);
        calificacionesJuan.add(9.0f);
        calificacionesJuan.add(7.5f);

        Alumno alumnoJuan = new Alumno("Juan", "Pérez", calificacionesJuan);

        calificacionesMaria = new ArrayList<>();
        calificacionesMaria.add(7.0f);
        calificacionesMaria.add(8.0f);
        calificacionesMaria.add(6.5f);

        Alumno alumnoMaria = new Alumno("Maria", "Gomez", calificacionesMaria);

        System.out.println(alumnoJuan.getNombre() + " " + alumnoJuan.getApellido() +
                ": Promedio de calificaciones = " + alumnoJuan.calcularPromedioCalificaciones());

        System.out.println(alumnoMaria.getNombre() + " " + alumnoMaria.getApellido() +
                ": Promedio de calificaciones = " + alumnoMaria.calcularPromedioCalificaciones());
    }
}
