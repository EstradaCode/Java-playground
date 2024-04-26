package utilities;

import classes.Pelicula;
import classes.Peliculas;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MovieRequest {
    public Peliculas SearchMovie( int numeroPelicula){
        URI connector = URI.create("https://swapi.py4e.com/api/films/" + numeroPelicula + "/");

        HttpClient client = HttpClient.newHttpClient();
        client.followRedirects();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(connector).build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString()); // problema con
            //System.out.println(response);
            //System.out.println(response.body());
        } catch (IOException | InterruptedException e ) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Peliculas.class);
    }
}
