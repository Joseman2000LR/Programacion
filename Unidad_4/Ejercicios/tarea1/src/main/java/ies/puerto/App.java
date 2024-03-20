package ies.puerto;

public final class App {
    static Persona persona;
    static Alumno alumno;
    static Coche coche;
    static Motocicleta motocicleta;
    static Conductor conductor;
    static Estudiante estudiante;

    public static void main(String[] args) {
        alumno = new Alumno("Pepe", 2, "12345678h");
        coche = new Coche("Verde", "254565g");
        motocicleta = new Motocicleta("L", "Roja");
        conductor = new Conductor("Pepe", 20, "554565554L", coche, motocicleta);

        System.out.println(alumno.toString());
        System.out.println(coche.toString());
        System.out.println(motocicleta.toString());
        System.out.println(conductor.toString());
        estudiante = new Estudiante("Pepe", 0, "65646454D", "programacion", "5");
        System.out.println(estudiante.toString());

    }
}
