package ies.puerto.negocio;

import ies.puerto.modelo.abstractas.ProductoAbstract;

import ies.puerto.modelo.entity.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tienda {
   
    List<ProductoAbstract> alimentos;
    List<ProductoAbstract> aparatos;
    Set<ProductoAbstract> souvenirs;
    Map<ProductoAbstract, ProductoAbstract> cuidadosPersonales;

 
    public Tienda() {
         alimentos = new ArrayList<>();
        aparatos = new ArrayList<>();
        souvenirs = new HashSet<>();
        cuidadosPersonales = new HashMap<>();
    }

    public boolean existeAlimento(ProductoAbstract productoAbstract){
        return alimentos.contains(productoAbstract);
    }
    public boolean existeAparatos(ProductoAbstract productoAbstract){
        return aparatos.contains(productoAbstract);
    }
   
    public boolean existeCuidadoPersonal(ProductoAbstract productoAbstract){
        return cuidadosPersonales.containsKey(productoAbstract);
    }
    
    public boolean crearAlimento(ProductoAbstract productoAbstract) {
        if(!existeAlimento(productoAbstract)){
           return  alimentos.add(productoAbstract);
        }
        return true;
    }
    
    public boolean actualizarAlimento(ProductoAbstract productoAbstract){
        if(existeAlimento(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            alimentos.set(posicion,productoAbstract);
            return  true;
        }
        return false;

    }
    
    public boolean eliminarAlimento(ProductoAbstract productoAbstract){
      return  alimentos.remove(productoAbstract);
    }

    public List<ProductoAbstract> obtenerAlimentos() {
        return alimentos;
    }


    public ProductoAbstract obtenerAlimento(ProductoAbstract productoAbstract) {
       if(existeAlimento(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            return  alimentos.get(posicion);
        }
        return null;
    }

    
    public boolean crearAparato(ProductoAbstract productoAbstract) {
        if(!existeAparatos(productoAbstract)){
           return  aparatos.add(productoAbstract);
        }
        return true;
    }
    
    public boolean actualizarAparato(ProductoAbstract productoAbstract){
        if(existeAparatos(productoAbstract)){
            int posicion = aparatos.indexOf(productoAbstract);
            aparatos.set(posicion,productoAbstract);
            return  true;
        }
        return false;

    }
    
    public boolean eliminarAparato(ProductoAbstract productoAbstract){
      return  aparatos.remove(productoAbstract);
    }
    

    public List<ProductoAbstract> obtenerAparatos() {
        return aparatos;
    }


    public ProductoAbstract obtenerAparato(ProductoAbstract productoAbstract) {
       if(existeAparatos(productoAbstract)){
            int posicion = aparatos.indexOf(productoAbstract);
            return  aparatos.get(posicion);
        }
        return null;
    }
    

    public boolean crearSouvenir(ProductoAbstract productoAbstract) {
        return  souvenirs.add(productoAbstract);
        
    }
    
    public boolean actualizarSouvenir(ProductoAbstract productoAbstract){
        if(eliminarSouvenir(productoAbstract)){
            crearSouvenir(productoAbstract);
        return true;
        }
        return  false;
    }
    
    public boolean eliminarSouvenir(ProductoAbstract productoAbstract){
      return  souvenirs.remove(productoAbstract);
    }

    public ProductoAbstract obtenerSouvenir(ProductoAbstract productoAbstract) {
       for (ProductoAbstract souvenir : souvenirs) {
        if (souvenir.equals(productoAbstract)) {
            return souvenir; 
        }
    }
        return null;
    }
    public Set<ProductoAbstract> obtenerSouvenirs() {
        return souvenirs;
    }

    public boolean crearCuidadosPersonale(ProductoAbstract productoAbstract) {
         if(!existeCuidadoPersonal(productoAbstract)){
             cuidadosPersonales.put(productoAbstract, productoAbstract);
           return  true;
        }
        return true;
    }
    
    public boolean actualizarCuidadosPersonale(ProductoAbstract productoAbstract){
        if(existeCuidadoPersonal(productoAbstract)){
            if (eliminarCuidadosPersonale(productoAbstract)) {
                return crearCuidadosPersonale(productoAbstract);
            }
        }
        return false;
    }
    
    public boolean eliminarCuidadosPersonale(ProductoAbstract productoAbstract){
      return  cuidadosPersonales.remove(productoAbstract, productoAbstract);
    }

    public Map<ProductoAbstract,ProductoAbstract> obtenerCuidadosPersonales() {
        return  cuidadosPersonales;
    }
    
    
    public ProductoAbstract obtenerCuidadoPersonal(ProductoAbstract productoAbstract) {
       if(existeCuidadoPersonal(productoAbstract)){
          ProductoAbstract valor = cuidadosPersonales.get(productoAbstract);
            return valor;
        }
        return null;
    }
  
    /**
     * Funcion que da ganacia total alimento
     *
     * @return
     */
    public float precioTotalAlimeto() {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }
        for (ProductoAbstract productoAbstract : alimentos) {
             resultado += productoAbstract.getPrecio();
        }
        return resultado;
    }

    /**
     * Funcion que da el precio total
     *
     * @return
     */
    public float precioTotalAparato() {
       float resultado = 0f;
        if (aparatos.isEmpty()) {
            return resultado;
        }
        for (ProductoAbstract productoAbstract : aparatos) {
             resultado += productoAbstract.getPrecio();
        }
        return resultado;
    }

    /**
     * Funcion que da el precio total
     *
     * @return
     */
    public float precioTotalSouvenir() {
        float resultado = 0f;
        if ( souvenirs.isEmpty()) {
            return resultado;
        }
        for (ProductoAbstract productoAbstract : souvenirs) {
            resultado += productoAbstract.getPrecio();
        }

        return resultado / souvenirs.size();
    }

    /**
     * Funcion que da el precio total
     *
     * @return
     */

    public float precioTotalCuidadoPersonal() {
        float resultado = 0f;
        if (cuidadosPersonales.isEmpty()) {
            return resultado;
        }
        for (ProductoAbstract productoAbstract : cuidadosPersonales.values()) {
            resultado += productoAbstract.getPrecio();
        }

        return resultado / cuidadosPersonales.size();
    }

    /**
     * Funcion que da el precio total de productos
     *
     * @return
     */
    public float precioTotalProductos() {
        return precioTotalAlimeto() + precioTotalAparato() +
                precioTotalCuidadoPersonal() + precioTotalSouvenir();
    }


}
