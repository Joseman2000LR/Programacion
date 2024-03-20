package ies.puerto.SegundaParte.abstractas;

/**
 *
 * @author josemanuel
 */
public abstract class Trabajador extends Persona{
    
    private float salario;

    public Trabajador(String nombre) {
        super(nombre);
    }
    
    public Trabajador(String nombre, String dni, String fechaNacimiento , float  salario) {
        super(nombre, dni, fechaNacimiento);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador tiene" + "salario :" + salario ;
    }
    
    
    
}
