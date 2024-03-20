package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author josem
 */
public class Concesionario {
    HashSet<Coche> coches = new HashSet<>();
    List<Motocicleta> motocicletas = new ArrayList<>();
    HashMap<String, Camion> camiones;
    HashMap<String, Bicicleta> bicicletas;

    // Contrutor por defecto
    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas,HashMap<String, Camion> camiones, HashMap<String, Bicicleta> bicicletas) {
        this.coches = new HashSet<>();
        this.motocicletas = new ArrayList<>();
         this.camiones = new HashMap<>();
        this.bicicletas = new HashMap<>();
    }
    /**
     * Funcion que agrega una motocicleta a la lista
     * 
     * @param motocicleta
     * @return true/false si se ha agregado correctamente
     */
    public boolean addMotocicleta(Motocicleta motocicleta) {
        boolean resultado = false;
        boolean existe = motocicletas.contains(motocicleta);
        if (existe) {
            return resultado;
        }
        motocicletas.add(motocicleta);
        return !resultado;

    }

    /**
     * Funcion que elimna una motocicleta de la lista
     * 
     * @param motocicleta
     * @return true/false si se ha eliminado correctamente
     */
    public boolean revomeMotocicleta(Motocicleta motocicleta) {
        boolean resultado = false;
        boolean existe = motocicletas.contains(motocicleta);
        if (existe) {
            motocicletas.remove(motocicleta);
            return !resultado;
        }
        return resultado;
    }

    /**
     * Funcion que obtienes la informacion de una motocicleta
     * por su matricula
     * 
     * @param motocicleta
     * @return la motocicleta o null si no esta el la lista
     */
    public Motocicleta obtenerMotocicleta(String matricula) {
        for (Motocicleta motocicleta : motocicletas) {
            if (motocicleta.getMatricula().equals(matricula)) {
                return motocicleta;
            }
        }
        return null;
    }

    /**
     * Funcion que da la velocidad medai motociclectas
     * 
     * @return la medai de velocidad
     */
    public float velocidadMediaMotocicletas() {
        float resultado = 0f;
        if (motocicletas.isEmpty()) {
            return resultado;
        }
        for (Motocicleta motocicleta : motocicletas) {
            resultado += motocicleta.getVelocidad();
        }
        return resultado / motocicletas.size();
    }

    /**
     * Funcion que agrega un nuevo coche a la lisat coches
     * 
     * @param coche
     * @return true/false si se ha agregado correctamente
     */
    public boolean addCoche(Coche coche) {
        boolean resultado = false;
        boolean existe = coches.contains(coche);
        if (existe) {
            return resultado;
        }
        coches.add(coche);
        return !resultado;

    }

    /**
     * Funcion que elimina un coche de la lista coches
     * 
     * @param coche
     * @return true/false si se ha eliminado correctamente
     */
    public boolean removeCoche(Coche coche) {
        boolean resultado = false;
        boolean existe = coches.contains(coche);
        if (existe) {
            coches.remove(coche);
            return !resultado;
        }
        return resultado;

    }

    /**
     * Funcion que obtienes la informacion de un coche
     * por su matricula
     * 
     * @param coche
     * @return el coche o null si no esta el la lista
     */
    public Coche obtenerCoche(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Funcion que da la velocidad media coche
     * 
     * @return la media de velocidad
     */
    public float velocidadMediaCoches() {
        float resultado = 0f;
        if (coches.isEmpty()) {
            return resultado;
        }
        for (Coche coche : coches) {
            resultado += coche.getVelocidad();
        }
        return resultado / coches.size();
    }

    /**
     * Funcion que da la media de velocidad de coches y motocicletas
     * 
     * @param coche
     * @param motocicleta
     * @return velocidad media
     */
    public float velocidadMediaVehiculos(Coche coche, Motocicleta motocicleta ,Camion camion ,Bicicleta bicicleta) {
        float resultado = 0;
        return resultado = velocidadMediaCoches() + velocidadMediaMotocicletas() +velocidadMediaCamion()+velocidadMediaBicicleta();

    }
    /***
     * Funcion que agrega un camion a una lista
     * @param camion
     * @return true/false si se a impletentado correctamente 
     */
    public boolean addCamion(Camion camion) {
        boolean resultado = false;
        boolean existe = camiones.containsKey(camion.getMatricula());
        if (existe) {
            return resultado;
        }
        camiones.put(camion.getMatricula(), camion);
        return !resultado;

    }
    /**
     * Funcion que elimina un camion de una lista 
     * @param camion
     * @return  true/false si se ha eliminado correctamente 
     */
    public boolean removeCamion(Camion camion) {
        boolean resultado = false;
        boolean existe = camiones.containsKey(camion.getMatricula());
        if (existe) {
            camiones.remove(camion.getMatricula(), camion);
        }
        return resultado;

    }
    /**
     *Funcion que obtienes la informacion de un camion
     * por su matricula
     * @param matricula
     * @return 
     */
    public Camion obtenerCamion(String matricula) {
       boolean contieneClave = camiones.containsKey(matricula);
       if(!contieneClave ==true ){
          return null;
       }
        return camiones.get(matricula);
    }
    /**
     * Funcion que agrega una bicicleta a una lista
     * @param bicicleta
     * @return 
     */
    public boolean addBicicleta(Bicicleta bicicleta) {
        boolean resultado = false;
        boolean existe = camiones.containsKey(bicicleta.getMatricula());
        if (existe) {
            return resultado;
        }
        bicicletas.put(bicicleta.getMatricula(), bicicleta);
        return !resultado;

    }
    /**
     * Funcion que elimina una bicicleta de una lista
     * @param bicicleta
     * @return 
     */
    public boolean removeBicicleta(Bicicleta bicicleta) {
        boolean resultado = false;
        boolean existe = camiones.containsKey(bicicleta.getMatricula());
        if (existe) {
            bicicletas.remove(bicicleta.getMatricula(), bicicleta);
        }
        return resultado;

    }
    /**
     * Funcion que obtienes la informacion de un bicicleta
     * por su matricula
     * @param matricula
     * @return 
     */
    public Bicicleta obtenerBicicleta(String matricula) {
       boolean contieneClave = bicicletas.containsKey(matricula);
       if(!contieneClave ==true ){
          return null;
       }
        return bicicletas.get(matricula);
    }
    
    /**
     * Funcion que da la media de velocidad de una bicicleta
     * @return 
     */
     public float velocidadMediaBicicleta(){
        float resultado = 0f;
        if (bicicletas.isEmpty()) {
            return resultado;
        }
        for (Bicicleta bicicleta :bicicletas.values()) {
            resultado += bicicleta.getVelocidad();
        }
        return resultado / bicicletas.size();
        
     }
      /**
     * Funcion que da la media de velocidad de una bicicleta
     * @return 
     */
     public float velocidadMediaCamion(){
        float resultado = 0f;
        if (camiones.isEmpty()) {
            return resultado;
        }
        for (Camion camion :camiones.values()) {
            resultado +=camion.getVelocidad();
        }
        return resultado / bicicletas.size();
        
     }
    public HashSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas() {
        return motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public HashMap<String, Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(HashMap<String, Camion> camiones) {
        this.camiones = camiones;
    }

    public HashMap<String, Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(HashMap<String, Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "coches=" + coches + ", motocicletas=" + motocicletas + ", camiones=" + camiones + ", bicicletas=" + bicicletas + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Concesionario other = (Concesionario) obj;
        if (!Objects.equals(this.coches, other.coches)) {
            return false;
        }
        if (!Objects.equals(this.motocicletas, other.motocicletas)) {
            return false;
        }
        if (!Objects.equals(this.camiones, other.camiones)) {
            return false;
        }
        return Objects.equals(this.bicicletas, other.bicicletas);
    }

  

}
