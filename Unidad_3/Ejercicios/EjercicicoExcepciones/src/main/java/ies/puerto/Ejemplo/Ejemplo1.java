package ies.puerto.Ejemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo1 {
    public static void main(String[] args) {
        try {
            // Intentar abrir un archivo que no existe
            File archivo = new File("archivo.txt");
            FileReader lector = new FileReader(archivo);
        } catch (ArithmeticException exception) {
            System.out.println("Es una exception arimentic"

            );
        } catch (FileNotFoundException exception) {
            System.out.println("Es una exception FilenotfoundExection");
        }
    }
}
