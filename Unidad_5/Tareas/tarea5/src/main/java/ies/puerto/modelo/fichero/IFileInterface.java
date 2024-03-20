package ies.puerto.modelo.fichero;


import ies.puerto.modelo.implementacion.Alimento;
import java.util.List;

public interface IFileInterface {
    public List<Alimento> lectura(String path, String articulo);

    public boolean escritura(String path, String contenido);

}
