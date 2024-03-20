package ies.puerto.App;

import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWifi;

public class AppConexionRed {
    public static void main(String[] args) {
        ConexionEthernet conexionEthernet = new ConexionEthernet();
        ConexionWifi conexionWifi = new ConexionWifi();

        conexionEthernet.conectar();
        conexionWifi.conectar();
    }
}
