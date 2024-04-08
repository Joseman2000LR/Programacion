/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.file.abstrac;

import ies.puerto.modelo.file.interfaces.IFicheros;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author josem
 */
public  abstract class Fichero implements IFicheros{
     public static final String RUTA_CSV="src/main/resources/personas.csv";
    public static final String RUTA_XML="src/main/resources/personas.xml";
    public static final String RUTA_JSON="src/main/resources/personas.json";
    public static final String SEPARADOR=",";


    @Override
    public boolean existe(String path){
        if (path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    @Override
    public boolean eliminar(String path){
        if (existe(path)) {
            File file = new File(path);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                byte[] vacio = {};
                fileOutputStream.write(vacio);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
