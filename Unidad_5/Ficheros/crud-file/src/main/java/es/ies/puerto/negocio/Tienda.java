package es.ies.puerto.negocio;

import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.abstractas.ProductoAbstract;
import es.ies.puerto.negocio.*;
import es.ies.puerto.negocio.interfaces.ITiendaInterface;
import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITiendaInterface{

    ICrudOperaciones persistencia;

    List<ProductoAbstract> alimentos;

    public Tienda() {
        alimentos = new ArrayList<>();
    }
    public boolean existeProducto(ProductoAbstract productoAbstract){
        return alimentos.contains(productoAbstract);

    }
    //lo pone al final de la lista
    @Override
    public boolean crearProducto(ProductoAbstract productoAbstract){
        if(!existeProducto(productoAbstract)){
           return   alimentos.add(productoAbstract);
        }
        return true;
    }

    @Override
    public boolean actualizarProducto(ProductoAbstract productoAbstract){
        if(existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            alimentos.set(posicion,productoAbstract);
            return  true;
        }
        return false;

    }
    @Override
    public boolean eliminarProducto(ProductoAbstract productoAbstract){
      return  alimentos.remove(productoAbstract);
    }
    @Override
    public List<ProductoAbstract> obtenerProductos(){
        return alimentos;
    }
    @Override
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract){
        if(existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            return  alimentos.get(posicion);
        }
        return null;
    }

    //   public List<ProductoAbstract> ordenarProducto() {
    //   return   Collections.sort(alimentos);
    //
    //  }
}
