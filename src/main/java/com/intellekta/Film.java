package com.intellekta;

public class Film {
    private final String name;
    private final String genre;
    private final double length;

    public Film(String name, String genre, double length) {
        if (name == null || name.isEmpty()) this.name = "default";
        else this.name = name;
        if (genre == null || genre.isEmpty()) this.genre = "default";
        else this.genre = genre;
        this.length = Math.max(0, length);
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getLength() {
        return length;
    }
}
