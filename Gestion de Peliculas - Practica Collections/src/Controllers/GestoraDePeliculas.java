package Controllers;

import Models.Pelicula;

import java.util.HashSet;

public class GestoraDePeliculas {

    private final HashSet<Pelicula> peliculas; //Creo el Hashset y le asigno la variable peliculas

    // Constructor
    public GestoraDePeliculas() {
        peliculas = new HashSet<>(); //Inicializo el Hashset
    }

    //Metodos propios

    public void agregarPeliculas(Pelicula p) {
        peliculas.add(p);
    }

    public void eliminarPeliculas(Pelicula p) {
        peliculas.remove(p);
    }

    public String mostrarPeliculas() {
        String acumulador = "";
        for (Pelicula p : peliculas) {
            acumulador = acumulador + p;
        }
        return acumulador;
    }

    public Pelicula buscarPelicula(String nombreBuscado, String directorBuscado) {
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equals(nombreBuscado)
                    && p.getDirector().equals(directorBuscado)) {
                return p;
            }
        }
        return null;
    }

    public int contarPeliculas() {
        return peliculas.size();
    }
}