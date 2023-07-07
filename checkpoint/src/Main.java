import exercise.Movie;
import exercise.Playlist;
import exercise.School;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Movie class
        Movie movie = new Movie();
        movie.genre = "Drama";
        movie.title = "Breaking Bad";
        movie.releaseYear = 2003;

        System.out.println(movie.genre);
        System.out.println(movie.title);
        System.out.println(movie.releaseYear);

        //School Class
        School student1 = new School("Bolton", "Nairobi", 23);
        School student2 = new School("Derick", "Nairobi", 23);
        School student3 = new School("Wilhems", "Nairobi", 23);

        System.out.println("Student 1 details name "+student1.name+" "+ "age "+student1.age);
        System.out.println("Student 2 details name "+student2.name+" "+ "age "+student2.age);
        System.out.println("Student 3 details name "+student3.name+" "+ "age "+student3.age);

        //Playlist Class
        Playlist song1 = new Playlist()

    }
}