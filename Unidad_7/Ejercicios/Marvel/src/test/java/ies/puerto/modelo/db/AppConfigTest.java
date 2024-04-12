package ies.puerto.modelo.db;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.config.AppConfig;

public class AppConfigTest {
    AppConfig appConfig;
    String url = "src/main/resources/personajes.db";

    @BeforeEach
    public void beforeEach() {
        try {
            appConfig = new AppConfig();
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerUrlBd() {
        try {
            String urlBbFichero = appConfig.getUrlBd();
            Assertions.assertEquals(url, urlBbFichero, "la url de la BBDD no es la esperada");
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }
}
