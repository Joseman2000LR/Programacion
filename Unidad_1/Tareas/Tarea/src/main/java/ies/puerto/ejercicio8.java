package ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class ejercicio8 {
    /**
     * algoritmo que permita calcular Promedio de Notas
     * 
     * @param args
     */

    public static void main(String[] args) {
        double nota;
        double media;
        double suma = 0;
        Scanner lectura = new Scanner(System.in);
        ArrayList<Double> notaMedia = new ArrayList<Double>();
        // bucle para guardar las notas
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime la nota");
            nota = lectura.nextDouble();
            notaMedia.add(nota);
        }
        // bucle para sumar todoas las notas
        for (int i = 0; i < notaMedia.size(); i++) {
            suma += notaMedia.get(i);
        }
        // operacion para sacar la media
        media = suma / notaMedia.size();
        System.out.println("La media de la nota es : " + media);
    }

}
