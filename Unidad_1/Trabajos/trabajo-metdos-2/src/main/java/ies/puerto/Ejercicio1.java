package ies.puerto;


public class Ejercicio1 {

    /**
     * Funcion que realiza  calcula el sueldo  de un trabajador en un mes 
     * @param numerohoras parametro de entrada 
     * @return sueldo
     */
    public int  calcularSueldoHoras(int numerohoras) {
        int sueldo =0;
        int HorasPagadas=10;
        sueldo=numerohoras*HorasPagadas;
        return sueldo;
    }
}