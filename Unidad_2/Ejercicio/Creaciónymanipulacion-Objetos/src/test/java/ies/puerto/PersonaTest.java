package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    Persona persona = new Persona();
    Persona persona2 = new Persona("pepe", 0, "@@", 0);

    @Test
    public void personaTest() {
        persona.setNombre("pepe");
        persona.setEdad(10);
        persona.setEmail("@");
        persona.setTelefono(1554585);
        String resultado = " nombre='" + "pepe" + " " +
                ", edad='" + "10" + " " +
                ", email='" + "@" + " " +
                ", telefono='" + 1554585;
        Assertions.assertEquals(resultado, persona.toString());
    }

    @Test
    public void imprimirTest() {

        String resultado = " nombre='" + "pepe" + " " +
                ", edad='" + "0" + " " +
                ", email='" + "@@" + " " +
                ", telefono='" + 0;
        Assertions.assertEquals(resultado, persona2.toString());
    }

}