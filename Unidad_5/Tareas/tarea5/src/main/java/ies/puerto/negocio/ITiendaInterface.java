package ies.puerto.negocio;

import ies.puerto.modelo.entity.Alimento;
import java.util.List;

/**
 *
 * @author josem
 */
public interface ITiendaInterface {

    public boolean crearProducto(Alimento alimento) ;
    public boolean eliminarProducto(String id) ;
    public List<Alimento> obtenerProductos(); 
    public Alimento obtenerProducto(String id) ;
    public boolean actualizarProducto(Alimento alimento);
}
