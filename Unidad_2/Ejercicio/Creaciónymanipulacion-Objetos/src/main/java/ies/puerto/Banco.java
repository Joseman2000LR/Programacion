package ies.puerto;

public class Banco {
    int numeroCuenta;
    String nombreTitular;

    static double[] saldo = { 0 };

    public Banco() {

    }

    public Banco(int numeroCuenta, String nombreTitular, double[] saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     * metodo que realiza ingresa un valor y suma el valor en un una lista
     * 
     * @param ingresardinero
     * @return
     */
    public static String realizarDeposito(double ingresardinero) {
        String resultado;
        double suma;
        saldo[0] = ingresardinero;
        resultado = "" + saldo[0];
        return resultado;
    }

    /**
     * metodo que realiza retirada un valor y resta el valor en un una lista
     * 
     * @param sacarrdinero
     * @return
     */
    public static String retirarDeposito(double sacarrdinero) {
        String resultado;
        if (saldo[0] <= 0) {
            return resultado = "No se puede sacar dinero por que la cuenta esta a " + saldo[0];
        }
        if (sacarrdinero > saldo[0]) {
            return resultado = "No se puede sacar dinero mas dinero que tiene la cuenta " + saldo[0];
        }
        double resta = saldo[0] - sacarrdinero;
        resultado = "" + resta;
        return resultado;
    }

    /**
     * metodo que muestra el total de elemento que tiene una lista
     * 
     * @param valorEntrada
     * @return
     */
    public static String mostarSaldo(String valorEntrada) {
        String resultado;
        resultado = "El saldo actual es de " + valorEntrada;
        return resultado;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Override
    public String toString() {
        return " numeroCuenta='" + getNumeroCuenta() + "'" +
                ", nombreTitular='" + getNombreTitular();
    }

}
