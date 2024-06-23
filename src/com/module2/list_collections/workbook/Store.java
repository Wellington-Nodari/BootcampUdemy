package com.module2.list_collections.workbook;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        return new Movie(movies.get(index));    // movie is a mutable Object, it must point to a new reference Id
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));   // movie is a mutable Object, it must point to a new reference Id
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}