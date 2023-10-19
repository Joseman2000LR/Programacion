package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {

    }
    public String calcularDia(int dia) {
        String resultado = "Lunes";
        switch (dia) {
            case 1:
            resultado = "Lunes";
                System.out.println("Lunes");
                break;
            case 2:
            resultado = "Martes";
                System.out.println("Martes");
                break;
            case 3:
            resultado = "Miercoles";
                System.out.println("Miercoles");
                break;
            case 4:
            resultado = "Jueves";
                System.out.println("Jueves");
                break;
            case 5:
            resultado = "Viernes";
                System.out.println("Viernes");
                break;
            case 6:
            resultado = "Sabado";
                System.out.println("Sabado");
                break;
            case 7:
            resultado = "Domingo";
                System.out.println("Domingo");
                break;

            default:
                System.out.println("El dia introducido no corresponde a dia de la semana" + dia);
                break;
        }
       return resultado;
    }
}