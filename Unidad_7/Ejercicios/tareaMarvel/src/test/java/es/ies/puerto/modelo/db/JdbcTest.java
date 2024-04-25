package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;

public class JdbcTest {
    Crud crud;
    Conexion conexion;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;
    @BeforeEach
    public void beforeEach(){
        try {
            personaje = new Personaje(11,"pepe","masculino");
            crud = new Crud(urlBd);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
        
    }

    @Test
    public void obtenerPoderes() throws UsuarioException{
        Assertions.assertEquals(3, crud.obtenerPoderes(1).size());
    }
    @Test
    public void obtenerAlias() throws UsuarioException{
        Alias aliasObtener = crud.obtenerAlias(1);
        Alias alias = new Alias(1, new Personaje(1), "Tony Stark");
        Assertions.assertEquals(alias, aliasObtener);
        Assertions.assertEquals(alias.getAlias(), aliasObtener.getAlias());
        Assertions.assertEquals(alias.getPersonaje(), aliasObtener.getPersonaje());
    }
    @Test
    public void obtenerPersonajes()throws UsuarioException{
        Assertions.assertEquals(2, crud.obtenerPersonajes().size());
    }

    @Test
    public void actualizarUsuarioTest() {
        int IdUpdate = 11;
        String nombreUpdate = "Pepe Juan";
        String generoUpdate = "Masculino";
        try {
            crud.insertarPersonaje(personaje);
            personaje.setId(IdUpdate);
            personaje.setNombre(nombreUpdate);
            personaje.setGenero(generoUpdate);
            crud.actualizarPersonajes(personaje);
            Assertions.assertTrue(true);
            Personaje usuarioEncontrado = crud.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje,usuarioEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getId(),usuarioEncontrado.getId(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(),usuarioEncontrado.getGenero(),MESSAGE_ERROR);

            crud.eliminarPersonajes(personaje);
        }catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }
    }
}
