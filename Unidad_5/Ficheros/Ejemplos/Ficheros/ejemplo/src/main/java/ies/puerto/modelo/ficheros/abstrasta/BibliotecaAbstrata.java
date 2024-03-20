package ies.puerto.modelo.ficheros.abstrasta;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class BibliotecaAbstrata {


    public  boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public  boolean esDirectorio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isDirectory();
    }

    // Ejemplo básico de lectura de ficheros linea a linea
    public  void lectura(String path) {
        // Crear un objeto File
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}
