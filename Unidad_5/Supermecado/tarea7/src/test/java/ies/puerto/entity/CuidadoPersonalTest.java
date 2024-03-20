/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.entity;

import ies.puerto.modelo.entity.CuidadoPersonal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class CuidadoPersonalTest {
    CuidadoPersonal cuidadoPersonal;
   
    String id = "id";
    String nombre = "nombre";
    float precio = 2f;
    String fEntrada = "01/03/2024";
    int popularidad=7;
    
    @BeforeEach
    public void beforeEach() {
        cuidadoPersonal = new CuidadoPersonal(id, nombre, precio, fEntrada,popularidad);
        
    }
    
    @Test 
    public void SetFCaducidadTest(){
        cuidadoPersonal.setPopularidad(popularidad);
        Assertions.assertEquals(popularidad, cuidadoPersonal.getPopularidad(),"no se ha obtenido el fecha prevista");
        
    }
    
    @Test
    public void precioMaximoTest(){
        Assertions.assertEquals(3.5999999046325684, cuidadoPersonal.precioMaximo(),"no se ha obtenido el precio previsto");
    }
}
