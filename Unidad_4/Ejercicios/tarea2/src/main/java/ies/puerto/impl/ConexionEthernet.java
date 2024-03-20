package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet implements IConexionRed {
    @Override
    public void conectar() {
        System.out.println("Conexión Ethernet establecida.");

    }
}
