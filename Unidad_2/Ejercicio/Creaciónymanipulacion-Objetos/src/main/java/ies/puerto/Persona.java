package ies.puerto;

public class Persona {

  private String nombre;
  private int edad;
  private String email;
  private int telefono;

  public Persona() {

  }

  public Persona(String nombre, int edad, String email, int telefono) {
    this.nombre = nombre;
    this.edad = edad;
    this.email = email;
    this.telefono = telefono;
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
    return " nombre='" + getNombre() + " " +
        ", edad='" + getEdad() + " " +
        ", email='" + getEmail() + " " +
        ", telefono='" + getTelefono();
  }

}