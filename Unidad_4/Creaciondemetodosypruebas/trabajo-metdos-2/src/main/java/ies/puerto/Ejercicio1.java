package ies.puerto;

/**
 * programa que calcule el sueldo de un trabajador, el programa debe de tener un
 * método que reciba el numero de horas que has trabajado en un mes, las horas
 * se pagan a 10€.
 */
public class Ejercicio1 {

    /**
     * Funcion que realiza calcula el sueldo de un trabajador en un mes
     * 
     * @param numerohoras parametro de entrada
     * @return sueldo
     */
    public int calcularSueldoHoras(int numerohoras) {
        int sueldo = 0;
        int HorasPagadas = 10;
        sueldo = numerohoras * HorasPagadas;
        return sueldo;
    }
}