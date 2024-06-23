package workBooks.theWorldOfObjects_challenge;

import java.util.Arrays;

public class Store {

    Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    public Movie getMovie(int index) {
        return new Movie(movies[index]);
    }

}
