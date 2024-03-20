package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BancoTest {
    double[] saldoBanco = { 10 };
    Banco banco2 = new Banco();
    Banco banco = new Banco(154155, "Perez Truguillo", saldoBanco);

    @Test
    public void bancoTest() {
        int numeroCuenta = 154155;
        String nombreTitular = "Perez Truguillo";
        Assertions.assertEquals(nombreTitular, banco.getNombreTitular(), "no se ha obtenido el valor correcto");
        Assertions.assertEquals(numeroCuenta, banco.getNumeroCuenta(), "no se ha obtenido el valor correcto");
    }

    @Test
    public void banco2Test() {
        int numeroCuenta = 154155;
        banco.setNumeroCuenta(numeroCuenta);
        String nombreTitular = "Perez Truguillo";
        banco2.setNombreTitular(nombreTitular);
        Assertions.assertEquals(nombreTitular, banco.getNombreTitular(), "no se ha obtenido el valor correcto");
        Assertions.assertEquals(numeroCuenta, banco.getNumeroCuenta(), "no se ha obtenido el valor correcto");
    }

    @Test
    public void realizarDepositoTest() {
        double ingreso = 1.8;
        String resultado = "" + 1.8;
        String resultadoOk = banco.realizarDeposito(ingreso);
        Assertions.assertEquals(resultado, resultadoOk, "El valor no es el correcto ");
    }

    @Test
    public void retirarDepositoTest() {
        double sacarrdinero = 1.8;
        String resultado = "" + 8.2;
        String resultadoOk = banco.retirarDeposito(sacarrdinero);
        Assertions.assertEquals(resultado, resultadoOk, "El valor no es el correcto ");
    }

    @Test
    public void retirar2DepositoTest() {
        double sacarrdinero = 11;
        String resultado = "No se puede sacar dinero mas dinero que tiene la cuenta " + saldoBanco[0];
        String resultadoOk = banco.retirarDeposito(sacarrdinero);
        Assertions.assertEquals(resultado, resultadoOk, "El valor no es el correcto ");
    }

    @Test
    public void retirar3DepositoTest() {
        double[] saldoBanco = { 10 };
        double sacarrdinero = 10;
        banco2.realizarDeposito(sacarrdinero);
        String resultado = "" + 0.0;
        String resultadoOk = banco2.retirarDeposito(sacarrdinero);
        Assertions.assertEquals(resultado, resultadoOk, "El valor no es el correcto ");
    }
}