package ies.puerto.App;

import ies.puerto.impl.LecturaDatosFicheros;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static ILecturaDatos lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosFicheros();
        System.out.println(lecturaDatos.apertita());
        System.out.println(lecturaDatos.cierre());
        System.out.println(lecturaDatos.lectura());
        tipo(lecturaDatos);
    }

    public static void tipo(ILecturaDatos lecturaDatos) {
        System.out.println(lecturaDatos.getClass().getName());
    }
}
