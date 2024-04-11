/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class PersonaTest {
   private static final String PODERES = "poder1,poder2,poder3";
    private static final String GENERO = "genero";
    private static final String ALIAS = "alias";
    private static final String NOMBRE = "nombre";
    Personaje persona;
    
     @BeforeEach
    public void beforeEach() {
      //  persona = new Personaje(NOMBRE, ALIAS, GENERO, Arrays.asList(PODERES.split(Fichero.SEPARADOR)));
      
    }
    
  @Test
    public void personaNotNull(){
      //  Assertions.assertNotNull(persona);
    }
    @Test
    public void personaToCsv(){
     //   String resultadoOk=NOMBRE+Fichero.SEPARADOR+ALIAS+Fichero.SEPARADOR+GENERO+Fichero.SEPARADOR+PODERES;
      //  Assertions.assertEquals(resultadoOk, persona.toCsv());
    }
}
