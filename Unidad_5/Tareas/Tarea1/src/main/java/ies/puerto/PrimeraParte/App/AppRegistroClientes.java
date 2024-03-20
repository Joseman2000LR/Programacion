package ies.puerto.PrimeraParte.App;

import ies.puerto.imple.Cliente;
import ies.puerto.imple.RegistroClientes;

/**
 *
 * @author josem
 */
public class AppRegistroClientes {
    public static void main(String[] args) {
        RegistroClientes registro = new RegistroClientes();

        // Agregar algunos clientes
        registro.agregarCliente(new Cliente("Juan", 1001, 500.0));
        registro.agregarCliente(new Cliente("María", 1002, 1000.0));

        // Realizar transacciones
        registro.realizarTransaccion(1001, 200.0);
        registro.realizarTransaccion(1002, -300.0); // Retiro
        registro.realizarTransaccion(1003, 100.0); // Cliente no existente
    }
}
