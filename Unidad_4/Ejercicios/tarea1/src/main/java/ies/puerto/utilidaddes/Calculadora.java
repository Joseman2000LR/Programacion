package ies.puerto.utilidaddes;

public class Calculadora extends UtilidadesCal {
    UtilidadesCal utilidadesCal;

    public Calculadora() {

    }

    /**
     * Contrutor con todos los atributos de la clase Calculadora
     * 
     * @param numero1
     * @param numero2
     * @param utilidadesCal
     */
    public Calculadora(double numero1, double numero2, UtilidadesCal utilidadesCal) {
        super(numero1, numero2);
        this.utilidadesCal = utilidadesCal;
    }

    @Override
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;

    };

    @Override
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;

    };

    @Override
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    };

    @Override
    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    };

    @Override
    public String toString() {
        return "";
    }

}
