/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.file;

import ies.puerto.modelo.entity.Personaje;
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
public class FileJsonTest {
    FileJson json;
    List<Personaje> personajes;
    Personaje personajeEscribir;
    List<Personaje> personajesEscribir;
    
     @BeforeEach
    public void beforeEach(){
        json = new FileJson();
        personajes = json.leer();
        personajeEscribir = new Personaje("nombre", "alias", "genero", Arrays.asList("Poder1","Poder2","Poder3"));
        personajesEscribir = Arrays.asList(personajeEscribir);
        json.escribir(personajesEscribir);
    }
    @AfterEach
    public void afterEach(){
        json.escribir(personajes);
    }
    
    @Test
    public void JsonNotNullTest(){
        Assertions.assertNotNull(json);
    }
    @Test
    public void JsonLeerEscribirTest(){
        Assertions.assertEquals(personajesEscribir,json.leer());
    }
    @Test
    public void JsonActualizarTest(){
        json.actualizar(personajes);
        Assertions.assertEquals(personajes, json.leer());
    }
    @Test
    public void JsonModificarTest(){
        json.modificar(personajes);
        Assertions.assertEquals(personajes, json.leer());
    }
}
