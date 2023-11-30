import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -2);
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int día = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Fecha después de restar 2 meses: " + día + "/" + mes + "/" + año);
    }
}
