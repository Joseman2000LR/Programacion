package ies.puerto;

public class App {
    static Coche miCoche;

    static Coche miCoche2;
    static Coche miCocheColor;
    static Bicicleta mibicicleta;

    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.micolor();
        System.out.println(miCoche.toString());
        miCocheColor = new Coche("Rojo");
        miCoche2 = new Coche("Rojo", "dd05555");
        miCocheColor.mover();
        miCocheColor.micolor();
        System.out.println(miCocheColor.toString());
        System.out.println(miCoche2.toString());
        mibicicleta = new Bicicleta("L", "Negra");
        miCoche.mover();
        mibicicleta.micolor();
        System.out.println(mibicicleta.toString());
    }
}
