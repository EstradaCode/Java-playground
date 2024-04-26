package classes;

public class Peliculas {
        private String title;
        private int episode_id;
        private String opening_crawl;
        private String director;
        private String producer;
        private String release_date;

        public Peliculas(String title, int episode_id, String opening_crawl, String director, String producer, String release_date) {
            this.title = title;
            this.episode_id = episode_id;
            this.opening_crawl = opening_crawl;
            this.director = director;
            this.producer = producer;
            this.release_date = release_date;
        }

    @Override
    public String toString() {
        return "Peliculas{" +
                "title='" + title + '\'' +
                ", episode_id=" + episode_id +
                ", opening_crawl='" + opening_crawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
