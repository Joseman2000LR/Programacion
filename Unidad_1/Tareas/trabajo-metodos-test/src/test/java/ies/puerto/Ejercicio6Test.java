package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    static Ejercicio6 ejercicio6 = new Ejercicio6();

    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void VerificarAmstrongtestOK() {
        int numero = 153;
        boolean resultado = ejercicio6.verificarAmstrong(numero);
    }
}
