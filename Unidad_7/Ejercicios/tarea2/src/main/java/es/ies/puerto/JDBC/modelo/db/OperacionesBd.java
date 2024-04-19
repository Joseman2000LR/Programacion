package es.ies.puerto.JDBC.modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.JDBC.entities.Alias;
import es.ies.puerto.JDBC.entities.Personaje;
import es.ies.puerto.JDBC.entities.Poderes;
import es.ies.puerto.JDBC.entities.Usuario;
import es.ies.puerto.JDBC.exception.UsuarioException;

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

    private Set<Personaje> obtener(String query) throws UsuarioException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt(1);
                String userNombre = rs.getString("nombre");
                String userGenero = rs.getString("genero");
                Personaje usuario = new Personaje(userId, userNombre, userGenero);
                lista.add(usuario);
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
        String query = "select u.id, u.nombre, u.genero from Personajes as u";
        return obtener(query);
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws UsuarioException {
        String query = "select u.id, u.nombre, u.genero from personajes as u" +
                " where u.id='" + personaje.getId() + "'";
        Set<Personaje> lista = obtener(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "INSERT INTO personajes as u (nombre, genero)" +
                " VALUES ('" + personaje.getNombre() + "','"
                + personaje.getGenero() + "')";
        actualizar(query);
    }

    public void actualizarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "update personajes set nombre='" + personaje.getNombre() + "', " +
                "genero='" + personaje.getGenero() + "' " +
                "where id='" + personaje.getId() + "'";
        actualizar(query);
    }

    public void eliminarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "delete FROM personajes as u" +
                " where u.id='" + personaje.getId() + "'";
        actualizar(query);
    }

    private Set<Alias> obtenerAli(String query) throws UsuarioException {
        Set<Alias> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt(1);
                int userpersonaje_id = rs.getInt(0);
                String userAlias = rs.getString("alias");
                Alias usuario = new Alias(userId, userpersonaje_id, userAlias);
                lista.add(usuario);
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

    public Set<Alias> obtenerAlias() throws UsuarioException {
        String query = "select u.id, u.personajes_id, u.alias from Alias as u";
        return obtenerAli(query);
    }

    public Alias obtenerAlia(Alias alias) throws UsuarioException {
        String query = "select u.id, u.personajes_id, u.alias from Alias as u" +
                " where u.id='" + alias.getId() + "'";
        Set<Alias> lista = obtenerAli(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarAlia(Alias alias) throws UsuarioException {
        String query = "INSERT INTO alias as u (personajes_id, alias)" +
                " VALUES ('" + alias.getPersonaje_id() + "','"
                + alias.getAlias() + "')";
        actualizar(query);
    }

    public void actualizarAlia(Alias alias) throws UsuarioException {
        String query = "update Alias set personajes_id ='" + alias.getPersonaje_id() + "', " +
                "alias='" + alias.getAlias() + "' " +
                "where id='" + alias.getId() + "'";
        actualizar(query);
    }

    public void eliminarAlias(Alias alias) throws UsuarioException {
        String query = "delete FROM alias as u" +
                " where u.id='" + alias.getId() + "'";
        actualizar(query);
    }

    private Set<Poderes> obtenerpode(String query) throws UsuarioException {
        Set<Poderes> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt(1);
                String userpoder = rs.getString("poder");
                Poderes usuario = new Poderes(userId, userpoder);
                lista.add(usuario);
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

    public Set<Poderes> obtenerPoderes() throws UsuarioException {
        String query = "select u.id, u.poder from Poderes as u";
        return obtenerpode(query);
    }

    public Poderes obtenerPoder(Poderes poderes) throws UsuarioException {
        String query = "select u.id, u.poder from Poderes  as u" +
                " where u.id='" + poderes.getId() + "'";
        Set<Poderes> lista = obtenerAli(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPodere(Poderes poderes) throws UsuarioException {
        String query = "INSERT INTO Poderes as u (id, poder)" +
                " VALUES ('" + poderes.getId() + "','"
                + poderes.getPoder() + "')";
        actualizar(query);
    }

    public void actualizarPoderes(Poderes poderes) throws UsuarioException {
        String query = "update Poderes set poder ='" + poderes.getpoder() + "'" +
                "where id='" + poderes.getId() + "'";
        actualizar(query);
    }

    public void eliminarPoderes(Poders poderes) throws UsuarioException {
        String query = "delete FROM poderes as u" +
                " where u.id='" + poderes.getId() + "'";
        actualizar(query);
    }

}
