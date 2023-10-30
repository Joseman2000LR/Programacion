package ies.puerto;

/**
 * Calcula el promedio de los elementos en un array de números en punto
 * flotante.
 */
public class Ejercicio2 {

    public float calcularPromedio() {
        float suma = 0;
        float promedio;
        float[] numeros = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f };
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        return promedio;
    }
}
