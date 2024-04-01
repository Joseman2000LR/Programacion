package es.ies.puerto.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;

import es.ies.puerto.exception.UsuarioException;

public class Conexion {
    private Connection con;

    private String url;
    private String user;
    private String password;


    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    public Conexion(String url) {
        this.url = "jdbc:sqlite:"+url;
    }

    public Connection getConexion() throws UsuarioException{
         try {
          //  Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new UsuarioException("no se ha podido establecer conecion"+e);
        }
        return con;
    }
}
