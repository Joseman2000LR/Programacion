package ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private String anioPublicacion;

    public Libro() {

    }

    public Libro(String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
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

    public void setAutor(String autor) {
        this.autor = autor;
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
