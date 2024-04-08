package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import es.ies.puerto.exception.UsuarioException;

public class AppConfig {
    String urlBd;

    public AppConfig() throws UsuarioException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("app.properties")) {
            properties.load(fis);
           urlBd=(String)properties.get("urlBd");
        } catch (IOException e) {
            throw new UsuarioException(e.getMessage(),e);
        }
    }
}
