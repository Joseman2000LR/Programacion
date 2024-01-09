/**
 * 
 */
public class Gato {
   private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
