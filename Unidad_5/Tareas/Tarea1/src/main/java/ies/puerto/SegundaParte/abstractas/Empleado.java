package ies.puerto.SegundaParte.abstractas;

import ies.puerto.SegundaParte.abstractas.Trabajador;

/**
 *
 * @author josemanuel
 */
public abstract class Empleado extends Trabajador{
    
    public Empleado(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento, salario);
    }

   
    
    
    
}
