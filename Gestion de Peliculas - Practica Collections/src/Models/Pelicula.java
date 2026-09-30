package Models;
import java.util.Objects;
import Enum.EGenero;

public class Pelicula {

    //Atributos
    private String titulo;
    private String director;
    private int anio;
    private EGenero genero;

    //Constructores
    public Pelicula(String titulo, String director, int anio, EGenero genero) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    //Setters & Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public EGenero getGenero() {
        return genero;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }

    //To String & Overrides

    @Override
    public String toString() {
        return "\nPelicula: " +
                "\nTitulo: " + titulo +
                "\nDirector: " + director +
                "\nAnio: " + anio +
                "\nGenero: " + genero +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) && Objects.equals(director, pelicula.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director);
    }
}
