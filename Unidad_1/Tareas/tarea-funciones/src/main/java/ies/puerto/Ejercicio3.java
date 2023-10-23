package ies.puerto;

/**
 * Clase que realiza area de cuadrado y de un retangulo
 */
public class Ejercicio3 {
    public static void main(String[] args) {

    }

    /**
     * funcion que realiza el calculo del area de un cuadrado
     * 
     * @param a
     * @return
     */
    public int areaCuadrado(int a) {
        return areaRectangulo(a,a);
    }

    /**
     * funcion que realiza el calculo del area de un rectangulo
     * 
     * @param a
     * @param b
     * @return
     */
    public int areaRectangulo(int a, int b) {
        return (a * b);
    }
}