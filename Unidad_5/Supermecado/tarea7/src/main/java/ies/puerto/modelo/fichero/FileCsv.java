package ies.puerto.modelo.fichero;


import ies.puerto.modelo.abstractas.FicheroAbstract;
import ies.puerto.modelo.abstractas.ProductoAbstract;
import ies.puerto.modelo.entity.Alimento;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileCsv extends FicheroAbstract  {
    public final String DELIMITADOR =",";
    private String FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
    private String FICHERO_APARATOS = "src/main/resources/aparatos.csv";
    private String FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
    private String FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";

    public List<Alimento> obtenerAlimnetos() {
        List<Alimento> alimentos = new ArrayList<>();
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO_ALIMENTOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                //if (contador > 0) {
                  
                    String[] datos = linea.split(DELIMITADOR);
                    String id = datos[3];
                    String nombre = datos[0];
                    float precio = Float.parseFloat(datos[1]);
                    String fEntrada = datos[2];
                    String fCaducidad = datos[4] ;
                    Alimento alimento = new Alimento(id, nombre, precio, fEntrada, fCaducidad);
                   alimentos.add(alimento);
                //}
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return alimentos;

    }

    public Alimento obtenerAlimento(Alimento alimento) {
        int contador = 0;
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO_ALIMENTOS))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                //if (contador > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    String id = datos[0];
                    if (id == alimento.getId()) {
                        String nombre = datos[1];
                        float precio = Float.parseFloat(datos[2]);
                        String fEntrada = datos[3];
                        String fCaducidad = datos[4] ;
                        alimento.setPrecio(precio);
                        alimento.setfCaducidad(fCaducidad);
                        alimento.setfEntrada(fEntrada);
                        encontrado = true;
                    }
                //}
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return alimento;
    }

    public void addAlimento(Alimento alimento) {
        Alimento alimentoBuscar = new Alimento(alimento.getId());
        alimentoBuscar = obtenerAlimento(alimentoBuscar);
        if (alimentoBuscar.getfCaducidad() == null) {
            try (FileWriter writer = new FileWriter(FICHERO_ALIMENTOS, true)) {
                writer.write(alimento.toCsv()+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteAlimento(Alimento alimento) {
        Alimento alimentoBuscar = new Alimento(alimento.getId());
        List<Alimento> alimentos = obtenerAlimnetos();
        try (FileWriter writer = new FileWriter(FICHERO_ALIMENTOS)) {
            for (Alimento alimentoFile : alimentos) {
                if (!alimentoFile.equals(alimento)) {
                    writer.write(alimentoFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateAlimento(Alimento alimento) {
        List<Alimento> alimentos = obtenerAlimnetos();
        try (FileWriter writer = new FileWriter(FICHERO_ALIMENTOS)) {
            for (Alimento alimentoFile : alimentos) {
                if (alimentoFile.equals(alimento)) {
                    writer.write(alimento.toCsv() + "\n");
                } else {
                    writer.write(alimentoFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}
