package ies.puerto.imple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josem
 */
public class RegistroClientes {
    private List<Cliente> clientes;
    public RegistroClientes() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorNumero(int numeroCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumCliente() == numeroCliente) {
                return cliente;
            }
        }
        return null;
    }

    public void realizarTransaccion(int numeroCliente, double transaccion) {
        Cliente cliente = buscarClientePorNumero(numeroCliente);
        if (cliente != null) {
            double saldoActual = cliente.getSaldo();
            cliente.setSaldo(saldoActual + transaccion);
            System.out.println("Transacción exitosa. Nuevo saldo para el cliente " + cliente.getNombre() + ": " + cliente.getSaldo());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

}
