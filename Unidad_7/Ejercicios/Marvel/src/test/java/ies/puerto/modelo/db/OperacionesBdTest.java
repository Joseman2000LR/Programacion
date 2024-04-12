package ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.exception.UsuarioException;
import ies.puerto.modelo.entity.Personaje;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje usuario;

    @BeforeEach
    public void beforeEach() {
        try {
            usuario = new Personaje(1, "Pepe", "Batman", "Hombre");
            operacionesBd = new OperacionesBd(urlBd);
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeTest() {
        Personaje personaje = new Personaje(5);
        try {
            usuario = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getGenero(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPersonajeTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonajes(usuario);
            Personaje usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(usuarioObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(numeroUsuarios, numeroUsuariosFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        String nombreUpdate = "Pepe Juan";
        String aliasUpdate = "Hombre araña";
        String generoUpdate = "Mujer";
        try {
            operacionesBd.insertarPersonajes(usuario);
            usuario.setNombre(nombreUpdate);
            usuario.setAlias(aliasUpdate);
            usuario.setGenero(generoUpdate);
            operacionesBd.actualizarPersonaje(usuario);
            Personaje usuarioEncontrado = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getAlias(), usuarioEncontrado.getAlias(), MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getGenero(), usuarioEncontrado.getGenero(), MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getNombre(), usuarioEncontrado.getNombre(), MESSAGE_ERROR);

            operacionesBd.eliminarPersonaje(usuarioEncontrado);
        } catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR + ":" + exception.getMessage());
        }

    }

}
