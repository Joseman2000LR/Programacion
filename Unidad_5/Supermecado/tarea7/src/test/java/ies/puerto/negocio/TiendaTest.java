package ies.puerto.negocio;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Aparato;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.entity.Souvenir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    Tienda tienda;
    String id = "id";
    String nombre = "nombre";
    String nombreActualizar="nombreActualizar";
    float precio = 2f;
    float precioActualizar = 3f;
    String fEntrada = "01/03/2024";
    String fCaducidad = "05/03/2024";
    String fEntradaActualiza = "11/03/2024";
    String fCaducidadActualiza= "25/03/2024";
    int popularidad =7;
    Alimento alimento;
    Aparato aparato;
    Souvenir souvenir;
    CuidadoPersonal cuidadoPersonal;

    @BeforeEach
    public void beforeEach() {
        tienda = new Tienda();
        alimento = new Alimento(id, nombre, precio, fEntrada, fCaducidad);
        aparato = new Aparato(id, nombre, precio, fEntrada);
        souvenir = new Souvenir(id, nombre, precio, fEntrada);
        cuidadoPersonal = new CuidadoPersonal(id, nombre, precio, fEntrada, popularidad);
        tienda.crearAlimento(alimento);
        tienda.crearAparato(aparato);
        tienda.crearSouvenir(souvenir);
        tienda.crearCuidadosPersonale(cuidadoPersonal);
    }

    @Test
    public void TiendaNotNullTest() {
        Assertions.assertNotNull(tienda, "no puede ser nulo");
    }
    
    @Test
    public void addAlimentoTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerAlimentos().size(), "no se ha obtenido el tamanio esperado");
    }
    @Test
    public void addAlimentoExisteTiendaTest() {
        tienda.crearAlimento(alimento);
        Assertions.assertEquals(1, tienda.obtenerAlimentos().size(), "no se ha obtenido el tamanio esperado");
    }
    
    @Test
    public void EliminarAlimentoTiendaTest() {
        tienda.eliminarAlimento(alimento);
        Assertions.assertEquals(0, tienda.obtenerAlimentos().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void ObtenerAlimentoTiendaTest() {
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerAlimento(alimentoBuscar);

        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntrada, alimentoBuscar.getfEntrada(),
         "El valor no es el esperado");
        Assertions.assertEquals(fCaducidad, alimentoBuscar.getfCaducidad(),
         "El valor no es el esperado");

    }

    @Test
    public void ObtenerAlimentoNoExisteTiendaTest() {
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerAlimento(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar, "no se ha obtenido el valor esperado");
    }

//    @Test
//    public void ActualizarAlimentoTiendaTest() {
//        Alimento alimentoActualizar = new Alimento(id, nombreActualizar, 
//                precioActualizar, fEntradaActualiza, fCaducidadActualiza);
//        tienda.actualizarAlimento(alimentoActualizar);
//        Alimento alimentoBuscar = new Alimento(id);
//        Assertions.assertEquals(nombreActualizar, alimentoBuscar.getNombre(),
//        "El valor no es el esperado");
//        Assertions.assertEquals(precioActualizar, alimentoBuscar.getPrecio(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fEntradaActualiza, alimentoBuscar.getfEntrada(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fCaducidadActualiza, alimentoBuscar.getfCaducidad(),
//         "El valor no es el esperado");
//    }
    
    
    
    
    @Test
    public void addAparatoTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerAlimentos().size(), "no se ha obtenido el tamanio esperado");
    }
    @Test
    public void addAparatoExisteTiendaTest() {
        tienda.crearAlimento(alimento);
        Assertions.assertEquals(1, tienda.obtenerAlimentos().size(), "no se ha obtenido el tamanio esperado");
    }
    
    @Test
    public void EliminarAparatoTiendaTest() {
        tienda.eliminarAparato(aparato);
        Assertions.assertEquals(0, tienda.obtenerAparatos().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void ObtenerAparatoTiendaTest() {
        Aparato aparatoBuscar = new Aparato(id);
        aparatoBuscar = (Aparato) tienda.obtenerAparato(aparatoBuscar);
        Assertions.assertEquals(nombre, aparatoBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precio, aparatoBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntrada, aparatoBuscar.getfEntrada(),
         "El valor no es el esperado");

    }
    
     @Test
    public void ObtenerAparatoNoExisteTiendaTest() {
         Aparato aparatoBuscar = new Aparato("id2");
         aparatoBuscar = (Aparato) tienda.obtenerAparato(aparatoBuscar);
        Assertions.assertNull(aparatoBuscar, "no se ha obtenido el valor esperado");
    }
    
    
      @Test
    public void addSouvenirTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerSouvenirs().size(), "no se ha obtenido el tamanio esperado");
    }
    @Test
    public void addSouvenirExisteTiendaTest() {
        tienda.crearSouvenir(aparato);
        Assertions.assertEquals(1, tienda.obtenerSouvenirs().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void EliminarSouvenirTiendaTest() {
        tienda.eliminarSouvenir(souvenir);
        Assertions.assertEquals(0, tienda.obtenerSouvenirs().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void ObtenerSouvenirTiendaTest() {
        Souvenir souvenirBuscar = new Souvenir(id);
        souvenirBuscar = (Souvenir) tienda.obtenerSouvenir(souvenirBuscar);
        Assertions.assertEquals(nombre, souvenirBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precio, souvenirBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntrada, souvenirBuscar.getfEntrada(),
         "El valor no es el esperado");

    }
    
     @Test
    public void ObtenerSouvenirNoExisteTiendaTest() {
         Souvenir souvenirBuscar = new Souvenir("id2");
        souvenirBuscar = (Souvenir) tienda.obtenerSouvenir(souvenirBuscar);
        Assertions.assertNull(souvenirBuscar, "no se ha obtenido el valor esperado");
    }
    
    
       @Test
    public void addCuidadoPersonalTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerCuidadosPersonales().size(), "no se ha obtenido el tamanio esperado");
    }
    @Test
    public void addCuidadoPersonalExisteTiendaTest() {
        tienda.crearCuidadosPersonale(cuidadoPersonal);
        Assertions.assertEquals(1, tienda.obtenerCuidadosPersonales().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void EliminarCuidadoPersonalTiendaTest() {
        tienda.eliminarCuidadosPersonale(cuidadoPersonal);
        Assertions.assertEquals(0, tienda.obtenerCuidadosPersonales().size(), "no se ha obtenido el tamanio esperado");
    }
    
     @Test
    public void ObtenerCuidadoPersonalTiendaTest() {
        CuidadoPersonal cuidadosPersonaleBuscar = new CuidadoPersonal(id);
        cuidadosPersonaleBuscar = (CuidadoPersonal) tienda.obtenerCuidadoPersonal(cuidadosPersonaleBuscar);
        Assertions.assertEquals(nombre, cuidadosPersonaleBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precio, cuidadosPersonaleBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntrada, cuidadosPersonaleBuscar.getfEntrada(),
         "El valor no es el esperado");
        Assertions.assertEquals(popularidad, cuidadosPersonaleBuscar.getPopularidad(),
         "El valor no es el esperado");

    }
    
     @Test
    public void ObtenerCuidadoPersonalNoExisteTiendaTest() {
         CuidadoPersonal cuidadosPersonaleBuscar = new CuidadoPersonal("id2");
        cuidadosPersonaleBuscar = (CuidadoPersonal) tienda.obtenerCuidadoPersonal(cuidadosPersonaleBuscar);
        Assertions.assertNull(cuidadosPersonaleBuscar, "no se ha obtenido el valor esperado");
    }
    
   
    @Test 
    public void precioTotalAlimentoTest(){
         Assertions.assertEquals(2f,tienda.precioTotalAlimeto(), "no se ha obtenido el precio total esperado");
    }   
    
     @Test 
    public void precioTotalAlimentoErrorTest(){
        tienda.eliminarAlimento(alimento);
        Assertions.assertEquals(0,tienda.precioTotalAlimeto(), "no se ha obtenido el precio total esperado");
    }  
    
    
    @Test 
    public void precioTotalAparatoTest(){
         Assertions.assertEquals(2f,tienda.precioTotalAparato(), "no se ha obtenido el precio total esperado");
    }   
    
    
     @Test 
    public void precioTotalAparatoErrorTest(){
        tienda.eliminarAparato(aparato);
        Assertions.assertEquals(0,tienda.precioTotalAparato(), "no se ha obtenido el precio total esperado");
    } 
  
     @Test 
    public void precioTotalSouvenirTest(){
         Assertions.assertEquals(2f,tienda.precioTotalSouvenir(), "no se ha obtenido el precio total esperado");
    }   
    
    
     @Test 
    public void precioTotalSouvenirErrorTest(){
        tienda.eliminarSouvenir(souvenir);
        Assertions.assertEquals(0,tienda.precioTotalSouvenir(), "no se ha obtenido el precio total esperado");
    } 
    
    
     @Test 
    public void precioTotalCuidadoPersonalTest(){
         Assertions.assertEquals(2f,tienda.precioTotalCuidadoPersonal(), "no se ha obtenido el precio total esperado");
    }   
    
    
     @Test 
    public void precioTotalCuidadoPersonalErrorTest(){
        tienda.eliminarCuidadosPersonale(cuidadoPersonal);
        Assertions.assertEquals(0,tienda.precioTotalCuidadoPersonal(), "no se ha obtenido el precio total esperado");
    } 
    
      @Test 
    public void precioTotalProductosTest(){
         Assertions.assertEquals(8f,tienda.precioTotalProductos(), "no se ha obtenido el precio total esperado");
    }  
    
}
