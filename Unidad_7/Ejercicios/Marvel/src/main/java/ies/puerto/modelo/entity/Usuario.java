package ies.puerto.modelo.entity;
import ies.puerto.modelo.entity.Personaje;
import java.util.List;

public class Usuario extends Personaje {

    public Usuario() {
    }

    public Usuario(int id) {
        super(id);
    }

    public Usuario(int id, String nombre, String alias, String genero, List<ies.puerto.modelo.entity.Poderes> Poderes) {
        super(id, nombre, alias, genero, Poderes);
    }

}
