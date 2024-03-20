package ies.puerto.modelo.fichero;

import ies.puerto.modelo.implementacion.Alimento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends FicheroAbstract implements IFileInterface {

    public FileCsv() {
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
    }

    @Override
    public List<Alimento> lectura(String path, String articulo) {
        List<Alimento> articulos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (articulo) {
                            case "alimento":
                                articulos.add(splitToAlimento(arrayElemento));
                                break;
                        }
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

    @Override
    public boolean escritura(String path, String contenido) {
         return almacenarEnFichero(path, contenido);
    }
    
     public List<Alimento> obtenerAlimentos(){
        return lectura(FICHERO_ALIMENTOS,"alimento");
    }
     private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[0],
                splitArray[1], splitArray[2],splitArray[3],splitArray[4],splitArray[5],splitArray[6]);
        return alimento;
    }

    public boolean eliminar(String path){
        if (existeFichero(path)) {
            try {
                File file = new File(path);
            // Crear un FileOutputStream para escribir en el archivo
            FileOutputStream outputStream = new FileOutputStream(file);

            // Escribir un contenido vacío
            byte[] emptyContent = {};
            outputStream.write(emptyContent);

            // Cerrar el FileOutputStream
            outputStream.close();

            System.out.println("Contenido del archivo eliminado con éxito.");

            } catch (IOException e) {
                System.out.println( e.getMessage());
            }
        }
        return false; 
    
    }
    
    public boolean modificar(String path){
       return eliminar(path);
    }
    
    


   
}
