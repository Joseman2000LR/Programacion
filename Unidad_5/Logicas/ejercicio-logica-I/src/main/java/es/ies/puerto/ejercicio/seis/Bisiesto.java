package es.ies.puerto.ejercicio.seis;

public class Bisiesto {
    public boolean is(int anio) {
        boolean resultado = false;

        if (anio%10==0&anio%4==0) {
             return  !resultado;
        }
        if (anio%10==0) {
            return !resultado;
        }
        if (anio%4==0) {
            return resultado;
        }
        return resultado;
    }

   // return ((anio%4==0)&&(anio%10!=0)||(anio%400==0));
}
