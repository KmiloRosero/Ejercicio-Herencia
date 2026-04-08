package Model;

import java.util.Objects;

public class Video extends Publicacion {
    private Idioma idioma;
    private float duracionHoras;

    public Video() {
        super();
        this.idioma = Idioma.ESPANOL;
        this.duracionHoras = 0.0f;
    }

    public Video(String titulo, String autor, int anioPublicacion, Idioma idioma, float duracionHoras) {
        super(titulo, autor, anioPublicacion);
        this.idioma = Objects.requireNonNull(idioma, "idioma");
        this.duracionHoras = duracionHoras;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = Objects.requireNonNull(idioma, "idioma");
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", anioPublicacion=" + getAnioPublicacion() +
                ", idioma=" + idioma +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}
