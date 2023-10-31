package ies.puerto;

/**
 * La clase crea metodo "areaCirculo" que carculoa el area de un
 * circulo por su area
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    }

    /**
     * funcion que realiza el calculo de area de un circulo
     * 
     * @param radio
     * @return
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        double pi = 3.14;
        resultado = (Math.pow(radio, 2) * pi);
        return resultado;
    }
}