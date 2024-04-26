import classes.Pelicula;
import classes.Peliculas;
import utilities.MovieRequest;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MovieRequest searcher = new MovieRequest();
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe el numero de un Episodio de Star Wars (1-8) para ver su informacion ");
        int numero = in.nextInt();
        Peliculas peliculas = searcher.SearchMovie(numero);
        System.out.println(peliculas);;
    }
}
