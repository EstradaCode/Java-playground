package classes;

public record Pelicula(String title, // ISSUES FIX -> FINAL VARIABLES IN RECORD -> HOW TO USE GSON WITH THEM ?¿
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {
}
