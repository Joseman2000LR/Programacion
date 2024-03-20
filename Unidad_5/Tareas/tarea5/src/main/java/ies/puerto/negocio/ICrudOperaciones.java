package ies.puerto.negocio;

import ies.puerto.modelo.implementacion.Alimento;
import java.util.List;

/**
 *
 * @author josem
 */
public interface ICrudOperaciones {
     public boolean crearProducto(Alimento alimento );
    public boolean eliminarProducto(Alimento alimento );
    public List<Alimento> obtenerProductos();
    public Alimento obtenerProducto(Alimento alimento );
    public boolean actualizarProducto(Alimento alimento );
    
}
