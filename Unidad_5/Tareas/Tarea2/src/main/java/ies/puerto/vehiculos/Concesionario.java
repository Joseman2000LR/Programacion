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
   

    // Contrutor por defecto
    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = new HashSet<>();
        this.motocicletas = new ArrayList<>();
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
        return resultado / motocicletas.size();
    }

    /**
     * Funcion que da la media de velocidad de coches y motocicletas
     * 
     * @param coche
     * @param motocicleta
     * @return velocidad media
     */
    public float velocidadMediaVehiculos(Coche coche, Motocicleta motocicleta) {
        float resultado = 0;
        return resultado = velocidadMediaCoches() + velocidadMediaMotocicletas();

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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        return Objects.equals(this.motocicletas, other.motocicletas);
    }

    @Override
    public String toString() {
        return "Concesionario{" + "coches=" + coches + ", motocicletas=" + motocicletas;
    }

}
