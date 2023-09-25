import java.util.Scanner;

/**
 * @author Nombre del autor
 */
public class Ejercicio1 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        int valorA,valorB;
        Scanner lectura = new Scanner(System.in);

        do{
            System.out.println("Introduzca  valore  A");
            valorA= lectura.nextInt();
            System.out.println("Valor de la variable A : "+ valorA);

            System.out.println("Introduzca  valore  B");
            valorB =lectura.nextInt();
            System.out.println("Valor de la variable B : "+ valorB);
            if (valorA==valorB){
                System.out.println("Los valores son iguales ");
            }
        }while(valorA == valorB);
        // Verificacion
        if (valorA>valorB){
            System.out.println("El valor de A es Mayor ");
        }else {
            System.out.println("El valor de B es Mayor ");
        }
    }
}