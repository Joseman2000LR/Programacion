
package ies.puerto.fichero;

import ies.puerto.modelo.abstractas.ProductoAbstract;
import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Aparato;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.entity.Souvenir;
import ies.puerto.modelo.fichero.FileCsv;
import ies.puerto.negocio.Tienda;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class FileCsvTest {
    
    FileCsv fileCsv;

    Tienda tienda;
    String idInsertar = "id";
    String nombreInsertar = "nombre";
    float precioInsertar = 2f;
    String fEntradaInsertar = "01/03/2024";
    String fCaducidadInsertar = "05/03/2024";
    int popularidadInsertar =7;
    Alimento alimento;
    Aparato aparato;
    Souvenir souvenir;
    CuidadoPersonal cuidadoPersonal;
    
    List<Alimento> alimentos;
    List<Aparato> aparatos;
    Set<Souvenir> souvenirs;
    Map<CuidadoPersonal, CuidadoPersonal> cuidadosPersonales;
    
    @BeforeEach
    public void beforeEach() {
        fileCsv = new FileCsv();
        alimentos = fileCsv.obtenerAlimnetos();
    }
    
    @Test
    public void obtenerAlimentosTest() {
        Assertions.assertFalse(alimentos.isEmpty(),
                "No se ha obtenido el valor esperado");
    }
    
     @Test
    public void obtenerAlimentoTest() {
        Alimento alimentoBuscar = new Alimento("2");
        alimentoBuscar = fileCsv.obtenerAlimento(alimentoBuscar);
        Assertions.assertEquals(alimentoBuscar.getId(),2,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(alimentoBuscar.getNombre(),
                "No se ha obtenido el valor esperado");
        Assertions.assertTrue (alimentoBuscar.getPrecio()> 0,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(alimentoBuscar.getfEntrada(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(alimentoBuscar.getfCaducidad(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonaTest() {

        int numPersonasInicial = alimentos.size();
        Alimento alimentoInsertar = new Alimento(idInsertar, nombreInsertar, 
                precioInsertar, idInsertar, fCaducidadInsertar);
        fileCsv.addAlimento(alimentoInsertar);
        alimentos = fileCsv.obtenerAlimnetos();
        int numPersonasInsertar = alimentos.size();
        Assertions.assertTrue(alimentos.contains(alimentoInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        fileCsv.deleteAlimento(alimentoInsertar);
        alimentos = fileCsv.obtenerAlimnetos();
        int numPersonasBorrado = alimentos.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersona() {
        int idActualizar = 2;
        Alimento alimentoBuscar = new Alimento(idInsertar);
        Alimento alimentoActualizar = fileCsv.obtenerAlimento(alimentoBuscar);
        Alimento alimentoBackup = fileCsv.obtenerAlimento(alimentoBuscar);
        alimentoActualizar.setNombre(nombreInsertar);
        alimentoActualizar.setPrecio(precioInsertar);
        alimentoActualizar.setfCaducidad(fCaducidadInsertar);
        alimentoActualizar.setfEntrada(fEntradaInsertar);
        fileCsv.updateAlimento(alimentoActualizar);

        alimentoBuscar = fileCsv.obtenerAlimento(alimentoBuscar);
        Assertions.assertEquals(alimentoBuscar.toString(), alimentoActualizar.toString(),
                "Los datos actualizados no son los esperados");
        fileCsv.updateAlimento(alimentoBackup);
    }
}
