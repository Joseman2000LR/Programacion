package ies.puerto.negocio;

import ies.puerto.modelo.fichero.FileCsv;
import ies.puerto.modelo.implementacion.Alimento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josem
 */
public class Tienda extends ITiendaInterface{
   ICrudOperaciones persistencia;

    List<Alimento> alimentos;

    public Tienda() {
        alimentos = new ArrayList<>();
    }
    public boolean existeProducto(Alimento alimento){
        return alimentos.contains(alimento);

    }
    //lo pone al final de la lista
    @Override
    public boolean crearProducto(Alimento alimento){
        if(!existeProducto(alimento)){
           return   alimentos.add(alimento);
        }
        return true;
    }

    @Override
    public boolean actualizarProducto(Alimento alimento){
        if(existeProducto(alimento)){
            int posicion = alimentos.indexOf(alimento);
            alimentos.set(posicion,alimento);
            return  true;
        }
        return false;

    }
    @Override
    public boolean eliminarProducto(Alimento alimento){
      return  alimentos.remove(alimento);
    }
    @Override
    public List<Alimento> obtenerProductos(){
        return alimentos;
    }
    @Override
    public Alimento obtenerProducto(Alimento alimento){
        if(existeProducto(alimento)){
            int posicion = alimentos.indexOf(alimento);
            return  alimentos.get(posicion);
        }
        return null;
    }
}
