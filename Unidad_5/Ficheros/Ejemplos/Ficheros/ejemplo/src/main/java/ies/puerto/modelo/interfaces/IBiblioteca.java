package ies.puerto.modelo.interfaces;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;

import java.util.List;

public interface IBiblioteca {
    public BibliotecaEntity buscarBibloteca(BibliotecaEntity bibliotecaEntity);

    public BibliotecaEntity actualizarBibloteca(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity eleminarBibloteca(BibliotecaEntity bibliotecaEntity);

    public List<LibroEntity> buscarLibrosBiblioteca (BibliotecaEntity bibliotecaEntity);
}
