package es.ies.puerto.modelo.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.Poder;

public class JdbcTest {
    Crud crud;
    Conexion conexion;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;
    Alias alias;

    @BeforeEach
    public void beforeEach() {
        try {

            crud = new Crud(urlBd);
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }

    }

    @Test
    public void obtenerPoderes() throws UsuarioException {
        Assertions.assertEquals(3, crud.obtenerPoderes(1).size());
    }

    @Test
    public void obtenerAlias() throws UsuarioException {
        Alias aliasObtener = crud.obtenerAlias(1);
        Alias alias = new Alias(1, new Personaje(1), "Tony Stark");
        Assertions.assertEquals(alias, aliasObtener);
        Assertions.assertEquals(alias.getAlias(), aliasObtener.getAlias());
        Assertions.assertEquals(alias.getPersonaje(), aliasObtener.getPersonaje());
    }

    @Test
    public void obtenerPersonajes() throws UsuarioException {
        Assertions.assertEquals(2, crud.obtenerPersonajes().size());
    }

    @Test
    public void actualizarPersonajeTest() {
        personaje = new Personaje(11, "pepe", "masculino");
        int IdUpdate = 11;
        String nombreUpdate = "Pepe Juan";
        String generoUpdate = "Masculino";

//        try {
//            // Insertar el personaje original en la base de datos
//            crud.insertarPersonaje(personaje);
//
//            // Actualizar el personaje con los nuevos valores
//            personaje.setId(IdUpdate);
//            personaje.setNombre(nombreUpdate);
//            personaje.setGenero(generoUpdate);
//            crud.actualizarPersonajes(personaje);
//
//            // Obtener el personaje actualizado de la base de datos
//            Personaje usuarioEncontrado = crud.obtenerPersonaje(personaje);
//
//            // Verificar que el personaje fue actualizado correctamente
//            Assertions.assertNotNull(usuarioEncontrado, "El personaje actualizado no puede ser nulo");
//            Assertions.assertEquals(IdUpdate, usuarioEncontrado.getId(), "El ID del personaje no coincide");
//            Assertions.assertEquals(nombreUpdate, usuarioEncontrado.getNombre(),
//                    "El  nombre del personaje no coincide");
//            Assertions.assertEquals(generoUpdate, usuarioEncontrado.getGenero(), "El género del personaje no coincide");
//
//            // Eliminar el personaje después de la prueba
//            crud.eliminarPersonajes(personaje);
//        } catch (Exception exception) {
//            Assertions.fail("Error durante la prueba: " + exception.getMessage());
//        }
    }

    @Test
    public void insertarAliasTest() {
        // Configuración de prueba
        Alias alias = new Alias(4, new Personaje(1), "nadar");

        try {
            crud.insertarAlias(alias);

            // Verificación
            // Puedes agregar verificaciones adicionales si es necesario, como verificar si
            // el alias se insertó correctamente en la base de datos.
            // crud.eliminarAlias(alias);
        } catch (UsuarioException e) {
            fail("Se produjo una excepción durante la prueba: " + e.getMessage());
        }
    }

    @Test
    public void insertarPoderesTest() {
        // Configuración de prueba
        Poder poder = new Poder(7, "Planear");

        try {
            crud.insertarPoderes(poder);

            // Verificación
            // Puedes agregar verificaciones adicionales si es necesario, como verificar si
            // el poder se insertó correctamente en la base de datos.
            // crud.eliminarPoder(poder);
        } catch (UsuarioException e) {
            fail("Se produjo una excepción durante la prueba: " + e.getMessage());
        }
    }

    @AfterEach
    public void afterEach() {
        if (personaje != null) {
            try {
                crud.eliminarPersonajes(personaje);
            } catch (UsuarioException e) {
                e.printStackTrace();
                fail("Se ha producido un error en la eliminacion:" + e.getMessage());
            }

        }
    }
}
