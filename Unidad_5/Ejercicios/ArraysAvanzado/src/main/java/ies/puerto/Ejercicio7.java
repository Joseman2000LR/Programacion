package ies.puerto;

/**
 * Para guardar esta información se van a utilizar dos array´s:
 * 
 * Nombre: Array para guardar los nombres de los conductores.
 * kms: Matriz para guardar los kilómetros que realizan cada día de la semana.
 * Se quiere generar un nuevo vector (“total_kms”) con los kilómetros totales
 * que realza cada conductor.
 * Al finalizar se muestra la lista con los nombres de conductores y los
 * kilómetros que ha realizado.
 */
public class Ejercicio7 {
    String[] nombreConductores = { "Pepe", "Juan", "Carlos" };
    int[][] kmsSemana;

    public static void valoresKmsSemanas(int[][] kmsSemana) {
        int kms;
        for (int i = 1; i < kmsSemana.length; i++) {
            for (int j = 0; j < kmsSemana.length; j++) {
                kms = (int) Math.floor(Math.random() * 100 + 1);
                kmsSemana[i][j] = kms;
            }

        }
    }

    public static void imprimir(String[] nombreConducto, int[][] kmsSemana) {
        String resultado = "";
        for (int i = 0; i < nombreConducto.length; i++) {
            for (int j = 0; j < kmsSemana.length; j++) {
                for (int j2 = 0; j2 < kmsSemana.length; j2++) {
                    resultado = nombreConducto[i] + " " + kmsSemana[j][j2];
                }

            }
        }
        for (int i = 0; i < kmsSemana.length; i++) {

            System.out.println(resultado);
        }
    }

    public static void main(String[] args) {
        int[][] kmsSemana = { {}, {} };
        String[] nombreConductores = { "Pepe", "Juan", "Carlos" };
        valoresKmsSemanas(kmsSemana);
        imprimir(nombreConductores, kmsSemana);
    }
}
