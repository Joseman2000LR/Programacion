/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.negocio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author josem
 */
public class Fichero {

    public static final String SEPARADOR=",";


    public boolean existe(String path){
        if (path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

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

