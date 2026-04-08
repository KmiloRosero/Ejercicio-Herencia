package Model;

import java.util.Objects;

public class Libro extends Publicacion {
    private String isbn;
    private int numeroPaginas;

    public Libro() {
        super();
        this.isbn = "";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int anioPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.isbn = Objects.requireNonNull(isbn, "isbn");
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = Objects.requireNonNull(isbn, "isbn");
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", anioPublicacion=" + getAnioPublicacion() +
                ", isbn='" + isbn + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
