package com.module2.exception_handling.challenges;

public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format == null || format.isBlank()) {
            throw new IllegalArgumentException("Invalid format");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Invalid rating");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}