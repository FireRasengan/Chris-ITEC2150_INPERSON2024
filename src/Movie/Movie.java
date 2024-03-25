package Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

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

        //Collections.sort(list);
        //System.out.println(list);

        System.out.println("///sorted by rating///");
        RatingCompare rc = new RatingCompare();
        Collections.sort(list, rc);
        System.out.println(list);

        System.out.println("///sorted by movie title///");

    }
}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getRating() < m2.getRating()? -1: (m1.getRating() > m2.getRating()? 1: 0);
    }
}

/*
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return
    }
}
*/