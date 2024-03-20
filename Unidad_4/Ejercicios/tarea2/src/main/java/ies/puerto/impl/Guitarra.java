package ies.puerto.impl;

import ies.puerto.interfaz.IInstrumentoMusical;

public class Guitarra implements IInstrumentoMusical {
    @Override
    public void tocarNota(String nota) {
        System.out.println("Tocando la nota " + nota + " en la guitarra.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra.");
    }

    // Método adicional específico de la clase Guitarra
    public void cambiarCuerdas() {
        System.out.println("Cambiando las cuerdas de la guitarra.");
    }
}
