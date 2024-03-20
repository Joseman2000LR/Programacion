package ies.puerto.precentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {
        //lectura("pepe.csv");

        List<Articulo> alimeto =lecturaAlimeto("src/main/resources/alimentos.csv");
        System.out.println(alimeto);
        List<Articulo> aparatos =lecturaAparato("src/main/resources/alimentos.csv");
    }

    // Ejemplo básico de lectura de ficheros linea a linea
    public static List<Articulo> lecturaAlimeto(String path) {
        List<Articulo> articulos =  new ArrayList<>();
        // Crear un objeto File
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i =0;
                while ((linea = br.readLine()) != null ) {
                    if (i > 0) {
                        String[] aliemtoArry = linea.split(",");
                        Alimento alimento = new Alimento(aliemtoArry[3],aliemtoArry[0],aliemtoArry[1]);
                        articulos.add(alimento);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
    public static List<Articulo> lecturaAparato(String path) {
        List<Articulo> articulos =  new ArrayList<>();
        // Crear un objeto File
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i =0;
                while ((linea = br.readLine()) != null ) {
                    if (i > 0) {
                        String[] aparatoArry = linea.split(",");
                        Aparatos aparatos = new Aparatos(aparatoArry[0]);
                        articulos.add(aparatos);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
    public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos =  new ArrayList<>();
        // Crear un objeto File
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i =0;
                while ((linea = br.readLine()) != null ) {
                    if (i > 0) {
                        switch (articulo){
                            case "aparato":
                                break;
                            case "aliemntos":
                                break;
                            default: break;//mostrar error
                        }
                        String[] aparatoArry = linea.split(",");
                        Aparatos aparatos = new Aparatos(aparatoArry[0]);
                        articulos.add(aparatos);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
}
