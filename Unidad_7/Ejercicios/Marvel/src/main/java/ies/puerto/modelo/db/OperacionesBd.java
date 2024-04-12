package ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ies.puerto.exception.UsuarioException;
import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.Poderes;

public class OperacionesBd extends Conexion {

    public OperacionesBd(String url) throws UsuarioException {
        super(url);
    }

    private void actualizar(String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
    }

    private Set<Personaje> obtenerPersonaje(String query) throws UsuarioException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userAlias = rs.getString("alias");
                String userName = rs.getString("nombre");
                String userGenero = rs.getString("genero");
                Personaje personaje = new Personaje(userId, userName, userAlias, userGenero);
                lista.add(personaje);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }

    private Set<Poderes> obtenerPoder(String query) throws UsuarioException {
        Set<Poderes> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                int userpersonasje_id = rs.getInt("personaje_id");
                String userpoder = rs.getString("poder");
                Poderes poderes = new Poderes(userId, userpersonasje_id, userpoder);
                lista.add(poderes);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }

    public Set<Personaje> obtenerPersonajes() throws UsuarioException {
        String query = "select u.id, u.nombre, u.alias, u.genero ,u.poderes from Personajes as u";
        return obtenerPersonaje(query);
    }

    public Set<Poderes> obtenerPoderes() throws UsuarioException {
        String query = "select u.id, u.personajes_id, u.poder from Poderes as u";
        return obtenerPoder(query);
    }

    public Personaje obtenerUsuario(Personaje personaje) throws UsuarioException {
        String query = "select u.id, u.nombre, u.alias, u.genero from Personajes as u" +
                " where u.id='" + personaje.getId() + "'";
        Set<Personaje> lista = obtenerPersonaje(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public Poderes obtenerPoder(Poderes poderes) throws UsuarioException {
        String query = "select u.id, u.personajes_id, u.poder, u.genero from Poderes as u" +
                " where u.id='" + poderes.getId() + "'";
        Set<Poderes> lista = obtenerPoder(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonajes(Personaje personaje) throws UsuarioException {
        String query = "INSERT INTO personajes as u (id,nombre,alias, genero)" +
                " VALUES ('" + personaje.getId() + "','"
                + personaje.getNombre() + "','" + personaje.getAlias() + "','" + personaje.getGenero()
                + "')";
        actualizar(query);
    }

    public void insertarPoderes(Poderes poderes) throws UsuarioException {
        String query = "INSERT INTO Poderes as u (id,nombre,personaje_id, poder)" +
                " VALUES ('" + poderes.getId() + "','"
                + poderes.getPersonaje_id() + "','" + poderes.getPoder()
                + "')";
        actualizar(query);
    }

    public void actualizarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "update Personajes set nombre='" + personaje.getNombre() + "', alias='" + personaje.getAlias()
                + "', " + "genero='" + personaje.getGenero() + "' " +
                "where id='" + personaje.getId() + "'";
        actualizar(query);
    }

    public void actualizarPoder(Poderes poderes) throws UsuarioException {
        String query = "update Poderes set personaje_id='" + poderes.getPersonaje_id() + "', poder='"
                + poderes.getPoder()
                + "' " + "where id='" + poderes.getId() + "'";
        actualizar(query);
    }

    public void eliminarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "delete FROM Pesonajes as u" +
                " where u.id='" + personaje.getId() + "'";
        actualizar(query);
    }

    public void eliminarPoder(Poderes poderes) throws UsuarioException {
        String query = "delete FROM Poderes as u" +
                " where u.id='" + poderes.getId() + "'";
        actualizar(query);
    }

}
