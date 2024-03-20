package ies.puerto.PrimeraParte.App;

import ies.puerto.imple.Alumno;
import ies.puerto.imple.Curso;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCurso {
    
    Curso dam1;

   public static void main(String[] args) {
        Curso dam1 = new Curso("1Dam");
    //    Alumno alumno1 = new Alumno("nombre1 apellido1", Arrays.asList(1f, 2f, 3f, 4f, 5f));
      //  Alumno alumno2 = new Alumno("nombre2 apellido2", Arrays.asList(10f, 7f, 8f, 6f, 5f));
        List<Alumno> alumnos = new ArrayList<>();
      //  alumnos.add(alumno1);
     //   alumnos.add(alumno2);
        dam1.setAlumnos(alumnos);
        System.out.println("Media Alua:" + dam1.media());
    }
}
