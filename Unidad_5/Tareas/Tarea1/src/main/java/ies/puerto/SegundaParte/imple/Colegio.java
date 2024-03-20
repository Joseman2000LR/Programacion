package ies.puerto.SegundaParte.imple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author josemanuel
 */
public class Colegio {
    private String nombre;
    private String direccion;
    private String ubicacion;
    private List<Aula> aulas;
    
    
    public Colegio(String nombre) {
        this.nombre = nombre;
    }

    public Colegio(String nombre,List<Aula> aulas) {
        this.nombre = nombre;
        this.aulas =  new ArrayList<>();
    }

    public Colegio(String nombre, String direccion, String ubicacion, List<Aula> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.aulas =  new ArrayList<>();
    }
/**
 * funcion que da la nota mas alta de todos los alumnos del colegio
 * @param aulas list
 * @return Alumno
 */
//#1
    public String  notaMaxAlumno(List<Aula> aulas, String nombreAula){
        int contador = 0;
        float notaMedia = 0.0f;
        if (alumnos.isEmpty()) {
            return resultado;
        }
        for (Aula aula : aulas) {
            if (aula.getNombre().equals(nombreAula)) {
                notaMedia = alumno.notaMaxima();//coregir #1
            }
        }
        if (contador > 0) {
            notaMedia /= contador;
        }
        Persona persona = new Alumno();

        return null;
    }
    /***
     * Funcion que da la nota media de una aula en espefico
     * @param aulas list
     * @return 
     */
    public Float notaAvgClase(List<Aula> aulas,String nombreAula){
        float notaMedia = 0.0f;
        int contador = 0;
        for (Aula aula : aulas) {
            if (aula.getNombre().equals(nombreAula)) {
                notaMedia += aula.media();
            }
        }
        if (contador > 0) {
            notaMedia /= contador;
        }
    
        return notaMedia;
    }
    
    
    /**
     * Funcion que obtiene la informacion por su dni
     * @param dni String 
     * @return toStrinng de la clase encontrada/null si no se encuentra
     */
    public String buscarInformacion(String dni){
        Profesor profesorBuscar = new Profesor(dni);
        Alumno alumnoBuscar = new Alumno(dni);
        if(dni == profesorBuscar.getDni()){
            return profesorBuscar.toString();
        }
        if(dni == alumnoBuscar.getDni()){
            return alumnoBuscar.toString();
        }
        return null;
    }
    /**
     * funcion que da la nota media de todo el colegio
     * @return 
     */
    public float media() {
       float resultado = 0f;
        if (aulas.isEmpty()) {
            return resultado;
        }
        for (Aula aula : aulas) {
            resultado +=aula.media();
        }
        return resultado / aulas.size();
        
    }
    /**
     * Funcion que da la edad media de alumno y profesores de un colegio
     * 
     * @return 
     */
    public float edadMediaColegio(){
        float resultado = 0f;
        if (aulas.isEmpty()) {
            return resultado;
        }
        for (Aula aula : aulas) {
            resultado +=aula.media();
        }
        return resultado / aulas.size();
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
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
        final Colegio other = (Colegio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.ubicacion, other.ubicacion)) {
            return false;
        }
        return Objects.equals(this.aulas, other.aulas);
    }

    @Override
    public String toString() {
        return "Colegio{" + "nombre=" + nombre + ", direccion=" + direccion + ", ubicacion=" + ubicacion + ", aulas=" + aulas + '}';
    }
    
   
    
}
