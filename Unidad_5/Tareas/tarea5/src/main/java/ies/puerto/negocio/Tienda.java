package ies.puerto.negocio;

import ies.puerto.modelo.fichero.FileCsv;
import ies.puerto.modelo.entity.Alimento;
import static ies.puerto.modelo.fichero.abstrac.FicheroAbstract.RUTA_CSV;
import ies.puerto.modelo.fichero.interfaces.IFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josem
 */
public class Tienda implements ITiendaInterface{
    IFile ficheros;
    List<Alimento> alimentos;

    public Tienda() {
        
        this.alimentos = new ArrayList();
    }

   
  
    @Override
    public boolean crearProducto(Alimento alimento) {
        if (alimentos.contains(alimento) || alimentos.isEmpty()) {
            return true;
        }
        alimentos.add(alimento);
        return ficheros.actualizar(alimentos);
    }

    @Override
    public boolean eliminarProducto(String id) {
         Alimento alimento = obtenerProducto(id);
        if (!alimentos.contains(alimento) || alimentos.isEmpty()) {
            return true;
        }
        alimentos.remove(alimento);
        return ficheros.actualizar(alimentos);
    }

    @Override
    public List<Alimento> obtenerProductos() {
        return ficheros.leer();
    }

    @Override
    public Alimento obtenerProducto(String id) {
         Alimento alimentoBuscar = new Alimento(id,null, null,null, null, null, null);
        if (alimentos.isEmpty() || !alimentos.contains(alimentoBuscar)) {
            return null;
        }
        int index = alimentos.indexOf(alimentoBuscar);
        return alimentos.get(index);
    }

    @Override
    public boolean actualizarProducto(Alimento alimento) {
       if (!alimentos.contains(alimento) || alimentos.isEmpty()) {
            return false;
        }
        alimentos.remove(alimento);
        alimentos.add(alimento);
        return ficheros.actualizar(alimentos);
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
  
}
