package es.ies.puerto.modelo.db;


import es.ies.puerto.JDBC.entities.Personaje;
import es.ies.puerto.JDBC.exception.UsuarioException;
import es.ies.puerto.JDBC.modelo.db.OperacionesBd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/marvel.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;

    @BeforeEach
    public void beforeEach() {
        try {
            personaje = new Personaje(11,"juan","hombre");
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
    public void obtenerUsuarioTest() {
        Personaje usuario = new Personaje(2);
        try {
            usuario = operacionesBd.obtenerPersonaje(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getGenero(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarUsuarioTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonaje(personaje);
            Personaje usuarioObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, usuarioObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(usuarioObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(numeroUsuarios, numeroUsuariosFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarUsuarioTest() {
        String nombreUpdate = "Pepe Juan";
        int idUpdate = 22;
        String generoUpdate = "hombre";
        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setId(idUpdate);
            personaje.setNombre(nombreUpdate);
            personaje.setGenero(generoUpdate);
            operacionesBd.actualizarPersonaje(personaje);
            Personaje usuarioEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, usuarioEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getId(), usuarioEncontrado.getId(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(), usuarioEncontrado.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(), usuarioEncontrado.getGenero(), MESSAGE_ERROR);

            operacionesBd.eliminarPersonaje(usuarioEncontrado);
        } catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR + ":" + exception.getMessage());
        }

    }

}
