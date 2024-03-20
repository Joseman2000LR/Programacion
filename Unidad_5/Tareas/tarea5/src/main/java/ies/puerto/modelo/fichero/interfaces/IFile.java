package ies.puerto.modelo.fichero.interfaces;


import ies.puerto.modelo.entity.Alimento;
import java.util.List;

public interface IFile {
    public List<Alimento> leer();
    public boolean eliminar(String path);
    public boolean existe(String path);
    public boolean actualizar(List<Alimento> alimentos);
    public boolean escribir(List<Alimento> alimentos);
    public boolean modificar(List<Alimento> alimentos);

}
