package com.module2.higher_order_functions.extra_practice.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStore {

    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public List<Movie> filterByGenre(String genre) {
        return movies.stream()
                .filter(x -> x.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    public List<Movie> sortByReleaseYear() {
        return movies.stream()
                .sorted((y1, y2) -> Integer.compare(y1.getYear(), y2.getYear()))
                .toList();
    }

    public List<Movie> getTopRatedMovies(int n) {
        return movies.stream()
                .sorted((r1, r2) -> Double.compare(r2.getRate(), r1.getRate()))
                .limit(n)
                .toList();
    }
}
