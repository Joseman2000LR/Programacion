package ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private String anioPublicacion;

    public Libro() {

    }

    /***
     * Contrutor de la clase con todos los paramentro
     * @param titulo del libro
     * @param autor del libro
     * @param anioPublicacion del libro
     */
    public Libro(String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * metodo que retona String
     * 
     * @return
     */
    public String imprimirLibro() {
        return "Titulo : " + getTitulo() + " " + "Anio de publicacion " + getAnioPublicacion();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return " titulo='" + getTitulo() + "'" +
                ", autor='" + getAutor() + "'" +
                ", anioPublicacion='" + getAnioPublicacion();
    }

}
