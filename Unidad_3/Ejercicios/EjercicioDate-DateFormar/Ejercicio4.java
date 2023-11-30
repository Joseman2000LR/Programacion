import java.util.Calendar;

public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH) + 10;

        System.out.println("Fecha Actual: " + dia);
    }
}
