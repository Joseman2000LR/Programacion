package ies.puerto.presentacion;


import ies.puerto.modelo.abstractas.ProductoAbstract;
import ies.puerto.modelo.entity.*;
import ies.puerto.negocio.Tienda;

import java.util.Scanner;


public class AppTienda {
    static Tienda tiendaNegocio;
     static ProductoAbstract producto;
    static Scanner scanner;
    public static void main(String[] args) {
        tiendaNegocio = new Tienda();
        System.out.println(tiendaNegocio.obtenerAlimentos());
       // menu();
        
        // falta poner los precio totales de cada cosas
    }

}


