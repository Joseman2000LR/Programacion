package ies.puerto.modelo.fichero;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.fichero.interfaces.IFile;
import ies.puerto.modelo.fichero.abstrac.FicheroAbstract;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileCsv extends FicheroAbstract{
    
    private static final int COLUMNA_id=0;
    private static final int COLUMNA_nombre=2;
    private static final int COLUMNA_tipo=3;
    private static final int COLUMNA_Calorias=4;
    private  static final int COLUMNA_proteinas=5;
    private static final int COLUMNA_grasas=6;
    private static final int COLUMNA_carbohidratos=7;
   @Override
    public boolean actualizar(List<Alimento> alimentos) {
       return eliminar(RUTA_CSV) && escribir(alimentos);
    }
    @Override
    public boolean escribir(List<Alimento> personas) {
         if (existe(RUTA_CSV)) {
            File file = new File(RUTA_CSV);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(toFile(personas));
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Alimento> leer() {
       List<Alimento> alimentos = new ArrayList<>();
        if (existe(RUTA_CSV)) {
            File file = new File(RUTA_CSV);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(SEPARADOR);
                    Alimento alimentoNuevo = new Alimento(datos[COLUMNA_id],datos[COLUMNA_nombre] , datos[COLUMNA_tipo],
                            datos[COLUMNA_Calorias],datos[COLUMNA_proteinas],datos[COLUMNA_grasas], datos[COLUMNA_carbohidratos] );
                   alimentos.add(alimentoNuevo);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return alimentos;
    }

    @Override
    public boolean modificar(List<Alimento> alimentos) {
        return actualizar(alimentos);
    }
    /**
     * Formatea una lista a CSV
     * 
     * @param personas lista a formatear
     * @return lista formateada
     */
    public String toFile(List<Alimento> alimentos) {
        if (alimentos.isEmpty()) {
            return null;
        }
        StringBuilder contenidoBuilder = new StringBuilder();
        for (Alimento alimento : alimentos) {
            contenidoBuilder.append(alimento.toCsv()).append("\n");
        }
        return contenidoBuilder.toString();
    }
}
