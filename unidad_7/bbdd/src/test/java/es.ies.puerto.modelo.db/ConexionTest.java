import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.db.Conexion;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resousces/usuario.db";

    @BeforeEach
    public void BeforeEach(){
        conexion = new Conexion(url);
    }

    @Test
    public void conectarBd(){
        try {
            conexion.getConexion();
        } catch (Exception e) {
            Assertions.fail(e.getMessage());

        }
    }
}
