package ies.puerto;


public class Ejercicio1 {

  private String nombre ;
  private int edad;
  private String email;
  private int telefono;

  /**
   * 
   * contrutor vacio
    */
  public Persona(){}
    
  /**
   * 
   */
     /**
   * contrutor del la clase con el nombre 
   */
  public Persona(String nombre ,){
    this.nombre = nombre;
    
  }

  /**
   * contrutor del la clase con el nombre y la edad
   */
  public Persona(String nombre ,int edad ){
    this.nombre = nombre;
    this.edad = edad;
    
  }

   /**
   * contrutor del la clase con el nombre , la edad ,email 
   */
  public Persona(String nombre ,int edad , String email ){
    this.nombre = nombre;
    this.edad = edad;
    this.email = email;
    
  }

  /**
   * contrutor del la clase con el nombre , la edad y email y telefono
   */
  public Persona(String nombre ,int edad , String email ,int telefono){
    this.nombre = nombre;
    this.edad = edad;
    this.email = email;
    this.telefono = telefono
  }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  " nombre='" + getNombre() + " " +
            ", edad='" + getEdad() + " " +
            ", email='" + getEmail() + " " +
            ", telefono='" + getTelefono();
    }



}