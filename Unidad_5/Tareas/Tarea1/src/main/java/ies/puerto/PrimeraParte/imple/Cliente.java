package ies.puerto.imple;

import java.util.Objects;

/**
 *
 * @author josem
 */
public class Cliente {
   private String nombre;
   private int numCliente ;
   private Double saldo;

    public Cliente(String nombre, int numCliente, Double saldo) {
        this.nombre = nombre;
        this.numCliente = numCliente;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.numCliente);
        hash = 71 * hash + Objects.hashCode(this.saldo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.numCliente, other.numCliente)) {
            return false;
        }
        return Objects.equals(this.saldo, other.saldo);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numCliente=" + numCliente + ", saldo=" + saldo + '}';
    }
   
   
}
