package ies.puerto.App;

import ies.puerto.impl.Guitarra;

public class AppInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();

        guitarra.tocarNota("C");
        guitarra.afinar();
        guitarra.cambiarCuerdas();
    }
}
