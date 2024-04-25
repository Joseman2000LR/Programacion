package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.Poder;

public class Crud extends Conexion {
    
    public Crud(String url) throws UsuarioException {
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
    public ResultSet obtener(String sql)throws UsuarioException{
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            try {
                if (statement!=null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion()!=null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (Exception p) {
                throw new UsuarioException(p.getMessage(), p);
            }
            throw new UsuarioException(e.getMessage(), e);  
        }
       
        return resultSet;
    }
    public void cerrar()throws UsuarioException{
        try {
            if (getConexion()!=null && !getConexion().isClosed()) {
                getConexion().close();
            }
        } catch (Exception p) {
            throw new UsuarioException(p.getMessage(), p);
        }
    }
    public Set<Personaje> obtenerPersonajes()throws UsuarioException{
        ResultSet resultSet = obtener("SELECT id,genero,nombre FROM Personajes");
        Set<Personaje> personajes = new HashSet<>();
        try {
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String genero = resultSet.getString("genero");
                String nombre = resultSet.getString("nombre");
                Set<Poder> poderes = obtenerPoderes(id);
                Alias alias = obtenerAlias(id);
                personajes.add(new Personaje(id, nombre, alias, genero, poderes));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return personajes;
    }
    public Alias obtenerAlias(Integer idPersonaje) throws UsuarioException{
        Alias alias = new Alias();
        try {
            ResultSet resultSet = obtener("SELECT a.id,a.alias FROM Alias as a WHERE a.personaje_id="+idPersonaje);
            while (resultSet.next()) {
                alias.setId(resultSet.getInt("id"));
                alias.setAlias(resultSet.getString("alias"));
                alias.setPersonaje(new Personaje(idPersonaje));
                return alias;
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return alias;
    }
    public Set<Poder> obtenerPoderes(Integer idPersonaje)throws UsuarioException{
        ResultSet resultSet = obtener("SELECT p.id, p.poder FROM Poderes as p JOIN Personajes_Poderes as pp ON p.id=pp.poder_id WHERE pp.personaje_id="+idPersonaje);
        Set<Poder> poderes = new HashSet<>();
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String poder = resultSet.getString("poder");
                poderes.add(new Poder(id, poder));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return poderes;
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws UsuarioException {
        ResultSet resultSet = obtener("SELECT id,genero,nombre FROM Personajes WHERE id="+personaje.getId());
        try {
                Integer id = resultSet.getInt("id");
                String genero = resultSet.getString("genero");
                String nombre = resultSet.getString("nombre");
                Set<Poder> poderes = obtenerPoderes(id);
                Alias alias = obtenerAlias(id);
                personaje = new Personaje(id, nombre, alias, genero, poderes);
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return personaje;
    }

    
    public void insertarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "INSERT INTO Personajes as p (id, nombre, genero)" +
                " VALUES ('"+personaje.getId()+"',"
                + personaje.getNombre()+"," +
                " '"+personaje.getGenero()+"')";
        actualizar(query);
    }

    public void insertarAlias(Alias alias) throws UsuarioException {
        String query = "INSERT INTO Personajes as p (id, personaje_id, alias)" +
                " VALUES ('"+alias.getId()+"',"
                + alias.getPersonaje()+"," +
                " '"+alias.getAlias()+"')";
        actualizar(query);
    }
    public void insertarPoderes(Poder poder) throws UsuarioException {
        String query = "INSERT INTO Personajes as p (id, poder)" +
                " VALUES ('"+poder.getId()+"',"
                + poder.getPoder()+"')";
        actualizar(query);
    }

    public void actualizarPersonajes(Personaje personaje) throws UsuarioException{
        String query = "update Personajes as p set p.nombre='"+personaje.getNombre()+"', " +
                "', p.genero="+personaje.getGenero()+" " +
                "where p.id='"+personaje.getId()+"'";
        actualizar(query);
    }
    public void actualizarAlias(Alias alias) throws UsuarioException{
        String query = "update Alias set personaje_id='"+alias.getPersonaje()+"', " +
                "', alias="+alias.getAlias()+" " +
                "where id='"+alias.getId()+"'";
        actualizar(query);
    }
    public void actualizarPoder(Poder poder) throws UsuarioException{
        String query = "update Poder set poder='"+poder.getPoder()+"' "+
                "where id='"+poder.getId()+"'";
        actualizar(query);
    }

    public void eliminarPersonajes(Personaje personaje) throws UsuarioException{
        String query = "delete FROM personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        actualizar(query);
    }
   
}

