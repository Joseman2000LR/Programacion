public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Max", 3, "Labrador");
        Gato miGato = new Gato("Whiskers", 2, "Gris");

        System.out.println(miPerro.nombre + " es un " + miPerro.raza + " y dice: ");
        miPerro.hacerSonido();

        System.out.println(miGato.nombre + " es de color " + miGato.color + " y dice: ");
        miGato.hacerSonido();

        Circulo miCirculo = new Circulo("Rojo", 5.0);
        Rectangulo miRectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println("Círculo de color " + miCirculo.getColor());
        System.out.println("Área: " + miCirculo.calcularArea());
        System.out.println("Perímetro: " + miCirculo.calcularPerimetro());

        System.out.println("\nRectángulo de color " + miRectangulo.getColor());
        System.out.println("Área: " + miRectangulo.calcularArea());
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
    }
}
