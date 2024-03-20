import java.util.Date;

public class Ejercicio6 {
    public static void main(String[] args) {

        Date fechaActual = new Date();

        Date otraFecha = new Date();

       
        if (fechaActual.equals(otraFecha)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son diferentes.");
        }
    }
}
