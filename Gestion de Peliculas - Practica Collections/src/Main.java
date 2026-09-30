import Controllers.GestoraDePeliculas;
import Models.Pelicula;

import static Enum.EGenero.*;

void main() {

    GestoraDePeliculas gestoraDePeliculas = new GestoraDePeliculas();

    Pelicula peli1 = new Pelicula("Gladiador", "Ridley Scott", 2002, ACCION);
    Pelicula peli2 = new Pelicula("Gladiador", "Rolo Garcia", 1988, ACCION);
    Pelicula peli3 = new Pelicula("Gladiador", "Ridley Scott", 1992, CIENCIA_FICCION);
    Pelicula peli4 = new Pelicula("La Aldea", "M. N. Shyamalan", 2006, TERROR);

    gestoraDePeliculas.agregarPeliculas(peli1);
    gestoraDePeliculas.agregarPeliculas(peli2);
    gestoraDePeliculas.agregarPeliculas(peli3);
    gestoraDePeliculas.agregarPeliculas(peli4);

    System.out.println("La cantidad de peliculas es: " + gestoraDePeliculas.contarPeliculas());
    System.out.println("Las peliculas son: " + gestoraDePeliculas.mostrarPeliculas());

    System.out.println (gestoraDePeliculas.buscarPelicula("Gladiador", "Rolo Garcia"));

    gestoraDePeliculas.eliminarPeliculas(peli3);
    System.out.println("Las peliculas actualizadas: " + gestoraDePeliculas.mostrarPeliculas());


}
