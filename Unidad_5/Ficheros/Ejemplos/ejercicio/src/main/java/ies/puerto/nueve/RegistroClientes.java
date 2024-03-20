package main.java.ies.puerto.nueve;

import java.util.ArrayList;
import java.util.List;

public class RegistroClientes {
    private List<Cliente> clientes;

    public RegistroClientes() {
        clientes = new ArrayList<>();
    }

    public RegistroClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscar(Cliente cliente) {

        for (Cliente clienteLista : clientes) {
            if (cliente.equals(clienteLista)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente addCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }

        return null;
    }

    public void transaccion(float cantidad, String numeroCliente) {
        Cliente clienteActualisar = new Cliente(numeroCliente);
        if (!clientes.contains(clienteActualisar)) {
            return;
        }
        int posicioCliente = clientes.indexOf(clienteActualisar);
        clienteActualisar = buscar(clienteActualisar);
        clienteActualisar.actualizarSaldo(cantidad);
        clientes.add(posicioCliente, clienteActualisar);

    }

    public void transaccion2(float cantidad, String numeroCliente) {
        Cliente clienteActualisar = new Cliente(numeroCliente);
        for (Cliente cliente : clientes) {
            if (cliente.equals(clienteActualisar)) {
                cliente.actualizarSaldo(cantidad);
            }
        }

    }
}
