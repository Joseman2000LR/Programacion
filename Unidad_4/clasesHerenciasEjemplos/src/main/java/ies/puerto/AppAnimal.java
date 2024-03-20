package ies.puerto;

public class AppAnimal {
    // static Animal animal;
    static Gato gato;
    static Perro perro;
    static Loro loro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        // animal = new Animal();
        // System.out.println("Sonido animal " + animal.suSonido());
        gato = new Gato("pepe", "1");
        System.out.println("Sonido gato " + gato.suSonido());
        perro = new Perro("paco", "2");
        System.out.println("sonido perro " + perro.suSonido());
        System.out.println(gato.toString());
        System.out.println(perro.toString());
        loro = new Loro("Juanito", "3");
        System.out.println(loro.suSonido());
        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());
    }
}
