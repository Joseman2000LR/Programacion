package ies.puerto.app;

import ies.puerto.vehiculos.Coche;
import ies.puerto.vehiculos.Concesionario;
import ies.puerto.vehiculos.Motocicleta;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author josem
 */
public class AppConcecionario {
   static Concesionario concesionario;
    Coche coche;
    Motocicleta motocicleta;
    static HashSet<Coche> coches = new HashSet<>();
    static List<Motocicleta> motocicletas = new ArrayList<>(); 
    
    public static void main(String[] args) {
       concesionario = new Concesionario();
       Coche coche1 = new Coche("Toyota","Corolla","ABC123",60);
       Coche coche2 = new Coche("Honda","Civic","XYZ789",75);
       Coche coche3 = new Coche("Ford","Mustang","DEF456",100);
       Coche coche4 = new Coche("Chevrolet","Impala","GHI789",80);
       Coche coche5 = new Coche("Volkswagen","Golf","JKL012",65);
       Motocicleta motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
       Motocicleta motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
       Motocicleta motocicleta3 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
       Motocicleta motocicleta4 = new Motocicleta("Ducati","Monster","STU901",70);
       Motocicleta motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);
      
     if(concesionario.addCoche(coche5)==true ){
         System.out.println("Se ha agregado correctamente ");
     }
     if(concesionario.addMotocicleta(motocicleta5)==true ){
         System.out.println("Se ha agregado correctamente ");
     }
     if(concesionario.addCoche(coche2)==true ){
         System.out.println("Se ha agregado correctamente ");
     }
     if(concesionario.addMotocicleta(motocicleta2)==true ){
         System.out.println("Se ha agregado correctamente ");
     }
     
     if(concesionario.removeCoche(coche5)==true ){
         System.out.println("Se ha elimando correctamente ");
     }
     if(concesionario.revomeMotocicleta(motocicleta5)==true ){
         System.out.println("Se ha elimando correctamente ");
     }
    System.out.println("Coche : "+concesionario.obtenerCoche("XYZ789")); 
    System.out.println("Motocicleta : "+concesionario.obtenerMotocicleta("PQR678")); 
       
       
       
       
       
    }
  
}
