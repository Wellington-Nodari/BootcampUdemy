package com.module2.higher_order_functions.extra_practice.model;

import java.util.Comparator;

public class Movie {

    private String name;
    private String director;
    private String genre;
    private int year;
    private double rate;


    public Movie(String name, String director, String genre, int year, double rate) {
        setName(name);
        setDirector(director);
        setGenre(genre);
        setYear(year);
        setRate(rate);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "name = '" + name + '\'' +
                ", director = '" + director + '\'' +
                ", genre = '" + genre + '\'' +
                ", year = " + year +
                ", rate = " + rate;
    }
}
