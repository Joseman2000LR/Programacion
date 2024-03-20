package ies.puerto.modelo.ficheros.csv.implementacion;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.ficheros.abstrasta.BibliotecaAbstrata;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.util.List;


public class BibliotecaCsv extends BibliotecaAbstrata implements IBiblioteca {


    @Override
    public BibliotecaEntity buscarBibloteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBibloteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity eleminarBibloteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }


}
