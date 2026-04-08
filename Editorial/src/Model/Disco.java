package Model;

import java.util.Objects;

public class Disco extends Publicacion {
    private String genero;
    private int numeroCanciones;
    private int duracionMinutos;

    public Disco() {
        super();
        this.genero = "";
        this.numeroCanciones = 0;
        this.duracionMinutos = 0;
    }

    public Disco(
            String titulo,
            String autor,
            int anioPublicacion,
            String genero,
            int numeroCanciones,
            int duracionMinutos
    ) {
        super(titulo, autor, anioPublicacion);
        this.genero = Objects.requireNonNull(genero, "genero");
        this.numeroCanciones = numeroCanciones;
        this.duracionMinutos = duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = Objects.requireNonNull(genero, "genero");
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", anioPublicacion=" + getAnioPublicacion() +
                ", genero='" + genero + '\'' +
                ", numeroCanciones=" + numeroCanciones +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}
