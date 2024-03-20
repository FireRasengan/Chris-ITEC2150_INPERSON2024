package Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public Movie(String nm, int yr, double rt) {
        this.name = nm;
        this.year = yr;
        this.rating = rt;
    }

    public String toString() {
        return "Movie Title: " + this.name + "\nReleased Year: " +
                this.year + "\nRating: " + this.rating;
    }

    public int compareTo(Movie m) {
        return (this.year > m.year)? 1: (this.year < m.year? -1: 0);
    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Rush Hour", 1998, 10));
        list.add(new Movie("Madame Web", 2024, 1));
        list.add(new Movie("Lion King", 1994, 7));

        Collections.sort(list);
        System.out.println(list);
    }
}