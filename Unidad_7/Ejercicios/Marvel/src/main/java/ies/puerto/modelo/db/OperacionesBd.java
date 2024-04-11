package ies.puerto.modelo.db;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ies.puerto.exception.UsuarioException;
import ies.puerto.modelo.entity.Usuario;

public class OperacionesBd extends Conexion{

    private static final int COLUMNA_PODERES = 3;
    
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

    private Set<Usuario> obtener(String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getId("id");
                String userAlias = rs.getString("alias");
                String userName = rs.getString("nombre");
                String userGenero = rs.getString("genero");
                List<String> userPoderes = new ArrayList<>(); 
                Usuario usuario = new Usuario(userId, userName, userGenero , userPoderes);
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
    public Set<Usuario> obtenerUsuarios() throws UsuarioException {
        String query = "select u.id, u.nombre, u.alias, u.genero from usuarios as u";
        return obtener(query);
    }

    public Set<Poderes> obtenerPoderes() throws UsuarioException {
        String query = "select u.id, u.personajes_id, u.poder from Poderes as u";
        return obtener(query);
    }

    public Usuario obtenerUsuario(Usuario usuario) throws UsuarioException {
        String query = "select u.id, u.nombre, u.alias, u.genero from usuarios as u" +
                " where u.id='"+usuario.getId()+"'";
        Set<Usuario> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarUsuario(Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO usuarios as u (id,nombre, alias, genero)" +
                " VALUES ('"+usuario.getId()+"',"
                + usuario.getNombre()+"," +
                ""+usuario.getAlias()+","+usuario.getGenero +"')";
        actualizar(query);
    }

    public void actualizarUsuario(Usuario usuario) throws UsuarioException{
        String query = "update usuarios set nombre='"+usuario.getNombre()+"', " +
                "ciudad='"+usuario.getCiudad()+"', edad="+usuario.getEdad()+" " +
                "where id='"+usuario.getId()+"'";
        actualizar(query);
    }

    public void eliminarUsuario(Usuario usuario) throws UsuarioException{
        String query = "delete FROM usuarios as u" +
                " where u.id='"+usuario.getId()+"'";
        actualizar(query);
    }


}
