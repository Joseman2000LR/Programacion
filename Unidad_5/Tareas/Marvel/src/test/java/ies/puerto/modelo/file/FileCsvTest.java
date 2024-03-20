/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.file;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.file.abstrac.Fichero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class FileCsvTest {
    FileCsv csv;
    List<Personaje> personas;
    List<Personaje> personasEscribir;
    Personaje personajeEscribir;
    
    @BeforeEach
    public void beforeEach(){
        csv = new FileCsv();
        personas = csv.leer();
        personasEscribir = new ArrayList<>();
        List<String> poderes = Arrays.asList("poder1,poder2,poder3".split(Fichero.SEPARADOR));
        personajeEscribir = new Personaje(null, null, null, poderes);
        personasEscribir.add(personajeEscribir);
    }
    
     @AfterEach
    public void afterEach(){
        csv.actualizar(personas);
    }
    
    @Test
    public void CsvNotNullTest(){
        Assertions.assertNotNull(csv);
    }

    @Test
    public void CsvLeerEscribirTest(){
        csv.escribir(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
    
    @Test
    public void CsvEliminarTest(){
        csv.eliminar(Fichero.RUTA_CSV);
        Assertions.assertEquals(Arrays.asList(), csv.leer());
    }
    @Test
    public void CsvModificarTest(){
        csv.modificar(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
}
