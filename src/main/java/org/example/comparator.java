// Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 {
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Movie year

    // Constructor to initialize movie details
    public Movie1(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Getter methods
    public String getN() {
        return n;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }
}

// Comparator to sort movies by rating
class Rating implements Comparator<Movie1> {
    public int compare(Movie1 m1, Movie1 m2) {

        // Sort by rating in descending order
        return Double.compare(m2.getR(), m1.getR());
    }
}

// Comparator to sort movies by name
class NameCompare implements Comparator<Movie1> {
    public int compare(Movie1 m1, Movie1 m2) {

        // Sort by name in alphabetical order
        return m1.getN().compareTo(m2.getN());
    }
}

// Main class
public class comparator {
    public static void main(String[] args) {

        // Create a list of movies
        ArrayList<Movie1> m = new ArrayList<>();
        m.add(new Movie1("Force Awakens", 8.3, 2015));
        m.add(new Movie1("Star Wars", 8.7, 1977));
        m.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie1 m1 : m) {
            System.out.println(m1.getR() + " " + m1.getN() + " " + m1.getY());
        }

        // Sort movies by name and display all
        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movie1 m1 : m) {
            System.out.println(m1.getN() + " " + m1.getR() + " " + m1.getY());
        }
    }
}
