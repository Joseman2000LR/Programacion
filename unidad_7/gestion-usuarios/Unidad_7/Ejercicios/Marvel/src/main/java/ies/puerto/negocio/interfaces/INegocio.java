package ies.puerto.negocio.interfaces;

import ies.puerto.modelo.entity.Personaje;

/**
 *
 * @author josem
 */
public interface INegocio {
    public Personaje obtenerPersonaje(String alias);
    public boolean agregarPersona(Personaje personaje);
    public boolean actualizarPersona(Personaje personaje);
    public boolean eliminarPersona(String alias);
    public String mostrarPersonajesTodosFormatos();
}
