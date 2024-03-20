package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionWifi implements IConexionRed {

    @Override
    public void conectar() {
        System.out.println("Conexión WiFi establecida.");
    }
}
