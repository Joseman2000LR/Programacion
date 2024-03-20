package main.java.ies.puerto.nueve;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String numero;
    private float saldo;

    public Cliente(String numero) {
        this.numero = numero;
    }

    public Cliente(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Cliente(String nombre, String numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void actualizarSaldo(float cantidad) {
        this.saldo += cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumero() {
        return this.numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Cliente cliente = (Cliente) object;
        return java.util.Objects.equals(numero, cliente.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numero);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
