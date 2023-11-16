package ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
 * un alumno (comprendidas entre 0 y 10), y almacenadas en un array. A
 * continuación debe mostrar todas las notas, la nota media, la nota más alta
 * que ha sacado y la menor.
 */
public class Ejercicio1 {

    
    /**
     * 
     * @param notas
     * @return
     */
    public ArrayList<Integer> ingresarNota(ArrayList<Integer> notas) {
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int nota5;
        Scanner lectura = new Scanner(System.in);
        System.out.println("dime la nota");
        nota1 = lectura.nextInt();
        System.out.println("dime la nota");
        nota2 = lectura.nextInt();
        System.out.println("dime la nota");
        nota3 = lectura.nextInt();
        System.out.println("dime la nota");
        nota4 = lectura.nextInt();
        System.out.println("dime la nota");
        nota5 = lectura.nextInt();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);
        return notas;
    }

    /**
     * Metodo que muestra una lista de numeros enteros
     * 
     * @param notas la lista que se pasas
     * @return todos los numero que tiene la lista
     */
    public String mostarNotas(ArrayList<Integer> notas) {
        String resultado = "";
        for (int i = 0; i < notas.size(); i++) {
            resultado += " " + notas.get(i);
        }
        return resultado;
    }

    /**
     * 
     * @param notas
     * @return
     */
    public int notaMedia(ArrayList<Integer> notas) {
        int media = 0;
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }

        return media / 5;
    }

    /**
     * 
     * @param notas
     * @return
     */
    public int notaAlta(ArrayList<Integer> notas) {
        int nota = notas.get(0);
        for (int i = 1; i < notas.size(); i++) {
            if (notas.get(i) > nota) {
                nota = notas.get(i);
            }
        }

        return nota;
    }

    /**
     * 
     * @param notas
     * @return
     */
    public int notaBaja(ArrayList<Integer> notas) {
        int nota = notas.get(0);
        for (int i = 1; i < notas.size(); i++) {
            if (notas.get(i) < nota) {
                nota = notas.get(i);
            }
        }

        return nota;
    }

}