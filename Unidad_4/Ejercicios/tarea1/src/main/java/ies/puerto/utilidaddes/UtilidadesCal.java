package ies.puerto.utilidaddes;
import java.util.Objects;

public class UtilidadesCal {

    private double numero2;
    private double numero1;

    public UtilidadesCal() {

    }

    /**
     * Contrutor con todos los atributos de UtilidaddesCal
     * 
     * @param numero2
     * @param numero1
     */
    public UtilidadesCal(double numero2, double numero1) {
        this.numero2 = numero2;
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double sumar(double numero1, double numero2) {
        return numero2;

    };

    public double restar(double numero1, double numero2) {
        return numero2;

    };

    public double multiplicar(double numero1, double numero2) {
        return numero2;
    };

    public double dividir(double numero1, double numero2) {
        return numero2;
    };

    @Override
    public String toString() {
        return "{" +
            " numero2='" + getNumero2() + "'" +
            ", numero1='" + getNumero1() + "'" +
            "}";
    }

}
