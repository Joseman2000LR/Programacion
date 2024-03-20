 package ies.puerto.app;

import ies.puerto.vehiculos.Bicicleta;
import ies.puerto.vehiculos.Camion;
import ies.puerto.vehiculos.Coche;
import ies.puerto.vehiculos.Concesionario;
import ies.puerto.vehiculos.Motocicleta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class AppConcecionario {
    static Concesionario concesionario;
    Scanner scanner = new Scanner(System.in);
    Coche coche;
    Motocicleta motocicleta;
    Camion camion;
    Bicicleta bicicleta;
    static HashSet<Coche> coches = new HashSet<>();
    static List<Motocicleta> motocicletas = new ArrayList<>();
    static HashMap<String, Camion> camiones  =new HashMap<>();;
    static HashMap<String, Bicicleta> bicicletas  =new HashMap<>();;

    public static void main(String[] args) {
        // son valores para poder eliminar y modificar
        concesionario = new Concesionario();
        Coche coche1 = new Coche("Toyota", "Corolla", "ABC123", 60);
        Coche coche2 = new Coche("Honda", "Civic", "XYZ789", 75);
        Coche coche3 = new Coche("Ford", "Mustang", "DEF456", 100);
        Coche coche4 = new Coche("Chevrolet", "Impala", "GHI789", 80);
        Coche coche5 = new Coche("Volkswagen", "Golf", "JKL012", 65);
        Motocicleta motocicleta1 = new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50);
        Motocicleta motocicleta2 = new Motocicleta("Yamaha", "YZF R6", "PQR678", 90);
        Motocicleta motocicleta3 = new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80);
        Motocicleta motocicleta4 = new Motocicleta("Ducati", "Monster", "STU901", 70);
        Motocicleta motocicleta5 = new Motocicleta("Kawasaki", "Ninja", "ZAB567", 85);
        Camion camion1 = new Camion("Chevrolet", "Silverado", "UVW567", 150);
        Camion camion2 = new Camion("Ford", "Ranger", "LMN890", 130);
        Camion camion3 = new Camion("Toyota", "Hilux", "PQR123", 140);
        Camion camion4 = new Camion("Nissan", "Navara", "ABC456", 145);
        Camion camion5 = new Camion("Dodge", "Ram", "XYZ789", 160);
        Bicicleta bicicleta1 = new Bicicleta("Trek", "MountainBike", "PQR456", 30);
        Bicicleta bicicleta2 = new Bicicleta("Giant", "CityBike", "MNO789", 25);
        Bicicleta bicicleta3 = new Bicicleta("Specialized", "RoadBike", "JKL012", 28);
        Bicicleta bicicleta4 = new Bicicleta("Cannondale", "HybridBike", "DEF345", 26);
        Bicicleta bicicleta5 = new Bicicleta("Schwinn", "Cruiser", "MNO678", 22);
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);
        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);
        motocicletas.add(motocicleta5);
        camiones.put("UVW567", camion1);
        camiones.put("LMN890", camion2);
        camiones.put("PQR123", camion3);
        camiones.put("ABC456", camion4);
        camiones.put("XYZ789", camion5);
        bicicletas.put("PQR456", bicicleta1);
        bicicletas.put("MNO789", bicicleta2);
        bicicletas.put("JKL012", bicicleta3);
        bicicletas.put("DEF345", bicicleta4);
        bicicletas.put("MNO678", bicicleta5);

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que quieres hacer");
        System.out.println("1.Insertar");
        System.out.println("2.Eliminar");
        System.out.println("3.Modificar");
        System.out.println("4.Ver media de velocidad");
        System.out.println("5.Salir");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Has selecionado : Insertar");
                System.out.println("Que Vehiculo quieres ingresar ");
                System.out.println("1.coche");
                System.out.println("2.Bicicleta");
                System.out.println("3.Motocicleta");
                System.out.println("4.Camion");
                numero = scanner.nextInt();
                insertarVehiculo(numero);
                break;
            case 2:
                System.out.println("Has selecionado : Eliminar");
                System.out.println("Que Vehiculo quieres eliminar ");
                System.out.println("1.coche");
                System.out.println("2.Bicicleta");
                System.out.println("3.Motocicleta");
                System.out.println("4.Camion");
                numero = scanner.nextInt();
                eliminarVehiculo(numero);
                break;
            case 3:
                System.out.println("Has selecionado : Modificar");
                System.out.println("Que Vehiculo quieres modificar ");
                System.out.println("1.coche");
                System.out.println("2.Bicicleta");
                System.out.println("3.Motocicleta");
                System.out.println("4.Camion");
                numero = scanner.nextInt();
                modificarVehiculo(numero);
                break;
            case 4:
                System.out.println("Has selecionado : Ver media de velocidad");
                System.out.println("Que Vehiculo Ver media de velocidad ");
                System.out.println("1.coche");
                System.out.println("2.Bicicleta");
                System.out.println("3.Motocicleta");
                System.out.println("4.Camion");
                numero = scanner.nextInt();
                mediaVehiculo(numero);
                break;
            case 5:
                break;
            default:
                System.out.println("Has puesto un valor incorrecto");
        }
    }

    public static void insertarVehiculo(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Has selecionado : Coche");
                insertarCoche();
                break;
            case 2:
                System.out.println("Has selecionado : Bicicleta");
                insertarBicicleta();
                break;
            case 3:
                System.out.println("Has selecionado : Motocicleta");
                insertarMotocicleta();
                break;
            case 4:
                System.out.println("Has selecionado : Camion");
                insertarCamion();
                break;
            default:
                System.out.println("Has puesto un valor incorrecto");
        }
    }
    public static Coche insertarCoche() {
        Scanner scanner = new Scanner(System.in);
        String marca;
        String modelo;
        String matricula;
        int velocidad;
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la matricula ");
        matricula = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        return new Coche(marca, modelo, matricula, velocidad);
    }
    public static Motocicleta insertarMotocicleta() {
        Scanner scanner = new Scanner(System.in);
        String marca;
        String modelo;
        String matricula;
        int velocidad;
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la matricula ");
        matricula = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        return new Motocicleta(marca, modelo, matricula, velocidad);
    }
    public static Camion insertarCamion() {
        Scanner scanner = new Scanner(System.in);
        String marca;
        String modelo;
        String matricula;
        int velocidad;
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la matricula ");
        matricula = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        return new Camion(marca, modelo, matricula, velocidad);
    }
    public static Bicicleta insertarBicicleta() {
        Scanner scanner = new Scanner(System.in);
        String marca;
        String modelo;
        String matricula;
        int velocidad;
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la matricula ");
        matricula = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        return new Bicicleta(marca, modelo, matricula, velocidad);
    }
    public static void eliminarVehiculo(int numero) {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        switch (numero) {
            case 1:
                System.out.println("Has selecionado : Coche");
                eliminarCoche();
                break;
            case 2:
                System.out.println("Has selecionado : Bicicleta");
                eliminarBicicleta();
                break;
            case 3:
                System.out.println("Has selecionado : Motocicleta");
                eliminarMotocicleta();
                break;
            case 4:
                System.out.println("Has selecionado : Camion");
                eliminarCamion();
                break;
            default:
                System.out.println("Has selecionado un vehiculo que no exite");
        }
    }
    public static void eliminarCoche() {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        System.out.println("Dime la matricula del coche que quieres eliminar");
        matricula = scanner.next();
        if (motocicletas.isEmpty()) {
            System.out.println("No se encontró ningúncoche ");
        }
         Coche coche = new Coche(matricula);
         boolean eliminada = concesionario.removeCoche(coche);
        
        if (eliminada) {
            System.out.println("El coche con matrícula " + matricula + " ha sido eliminada exitosamente");
        } 
            System.out.println("No se encontró ningun coche con la matrícula especificada: " + matricula);
    
       
    }
    public static void eliminarBicicleta() {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        System.out.println("Dime la matricula del bicicleta  deses elimnar");
        matricula = scanner.next();
        if (bicicletas.isEmpty()) {
            System.out.println("No se encontró ningún bicicleta ");

        }
         bicicletas.remove(matricula);
        System.out.println("Se eliminó la bicicleta con matricula " + matricula );
    }
    public static void eliminarMotocicleta() {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        System.out.println("Dime la matricula la motocicletas que quieres eliminar");
        matricula = scanner.next();
        if (motocicletas.isEmpty()) {
            System.out.println("No se encontró ningún motocicletas ");
        }
         Motocicleta motocicleta = new Motocicleta(matricula);
         boolean eliminada = concesionario.revomeMotocicleta(motocicleta);
        
        if (eliminada) {
            System.out.println("La motocicleta con matrícula " + matricula + " ha sido eliminada exitosamente");
        } 
            System.out.println("No se encontró ninguna motocicleta con la matrícula especificada: " + matricula);
    
       
    }
    public static void eliminarCamion() {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        System.out.println("Dime la matricula del camion que quieres eliminar");
        matricula = scanner.next();
        if (camiones.isEmpty()) {
            System.out.println("No se encontró ningún camion " );

        }
        camiones.remove(matricula);
        System.out.println("Se eliminó el camion con matricula " + matricula );

    }
    public static void modificarVehiculo(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Has selecionado : Coche");
                modificarCoche();
                break;
            case 2:
                System.out.println("Has selecionado : Bicicleta");
               modificarBicicleta();
                break;
            case 3:
                System.out.println("Has selecionado : Motocicleta");
                 modificarMotocicleta();
                break;
            case 4:
                System.out.println("Has selecionado : Camion");
                 modificarCamion();
                break;
            default:
                System.out.println("Has puesto un valor incorrecto");
        }
    }
    public static Coche modificarCoche() {
        Scanner scanner = new Scanner(System.in);
        Coche cocheModificado;
        String matricula;
        String marca;
        String modelo;
        int velocidad;
        System.out.println("Dime la matricula del coche deses modificar");
        matricula= scanner.next();
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        if(coches.isEmpty()){
             System.out.println("No se encontró ningún coche ");
        }
        coches.remove(matricula);
        System.out.println("El coche con matrícula " + matricula + " ha sido modificado ");
        return cocheModificado = new Coche(marca, modelo, matricula, velocidad);
    }
    public static Bicicleta modificarBicicleta(){
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicletaModificado;
        String matricula;
        String marca;
        String modelo;
        int velocidad;
        System.out.println("Dime la matricula del labicicleta deses modificar");
        matricula= scanner.next();
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        if(coches.isEmpty()){
             System.out.println("No se encontró ningúna bicicleta ");
        }
        bicicletas.remove(matricula);
        System.out.println("La bicicleta con matrícula " + matricula + " ha sido modificado ");
        return bicicletaModificado = new Bicicleta(marca, modelo, matricula, velocidad);
        
    }
    public static Motocicleta modificarMotocicleta(){
        Scanner scanner = new Scanner(System.in);
        Motocicleta motocicletaModificado;
        String matricula;
        String marca;
        String modelo;
        int velocidad;
        System.out.println("Dime la matricula del la motocicleta deses modificar");
        matricula= scanner.next();
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        if(coches.isEmpty()){
             System.out.println("No se encontró ningúna motocicleta ");
        }
        motocicletas.remove(matricula);
        System.out.println("La motocicleta con matrícula " + matricula + " ha sido modificado ");
        return motocicletaModificado = new Motocicleta(marca, modelo, matricula, velocidad);
    }
    public static Camion modificarCamion(){
        Scanner scanner = new Scanner(System.in);
        Camion camionModificado;
        String matricula;
        String marca;
        String modelo;
        int velocidad;
        System.out.println("Dime la matricula del camion deses modificar");
        matricula= scanner.next();
        System.out.println("Dime la marca ");
        marca = scanner.next();
        System.out.println("Dime la modelo ");
        modelo = scanner.next();
        System.out.println("Dime la velocidad ");
        velocidad = scanner.nextInt();
        if(coches.isEmpty()){
             System.out.println("No se encontró ningún camion ");
        }
        motocicletas.remove(matricula);
        System.out.println("El camion con matrícula " + matricula + " ha sido modificado ");
        return camionModificado = new Camion(marca, modelo, matricula, velocidad);
    }
    public static void mediaVehiculo(int numero){
         switch (numero) {
            case 1:
                System.out.println("Has selecionado : Coche");
                mediaCohe();
                break;
            case 2:
                System.out.println("Has selecionado : Bicicleta");
                mediaBicicleta();
                break;
            case 3:
                System.out.println("Has selecionado : Motocicleta");
                mediaMotocicleta();
                break;
            case 4:
                System.out.println("Has selecionado : Camion");
                mediaCamion();
                break;
            default:
                System.out.println("Has puesto un valor incorrecto");
        }
    }
    public static float mediaCohe(){
        return concesionario.velocidadMediaCoches();
    } 
    public static float mediaBicicleta(){
        return concesionario.velocidadMediaBicicleta();
    } 
    public static float mediaMotocicleta(){
        return concesionario.velocidadMediaMotocicletas();
    } 
    public static float mediaCamion(){
        return concesionario.velocidadMediaCamion();
    } 
    
}
