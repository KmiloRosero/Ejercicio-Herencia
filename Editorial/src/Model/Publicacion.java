package Model;

import java.util.Objects;

public class Publicacion {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Publicacion() {
        this.titulo = "";
        this.autor = "";
        this.anioPublicacion = 0;
    }

    public Publicacion(String titulo, String autor, int anioPublicacion) {
        this.titulo = Objects.requireNonNull(titulo, "titulo");
        this.autor = Objects.requireNonNull(autor, "autor");
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo, "titulo");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = Objects.requireNonNull(autor, "autor");
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
