package main.java.ies.puerto.modelo.entity;

import java.util.List;

import ies.puerto.modelo.entity.Personaje;

public class Usuario extends Personaje{
    public Usuario(int id) {
        super(id);
    }

    public Usuario(int id,String nombre, String alias, String genero, List<String> poderes) {
        super(id,nombre,alias,genero, poderes);
    }

    
    

}
