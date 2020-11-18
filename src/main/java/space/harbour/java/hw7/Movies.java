package space.harbour.java.hw7;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.lang.ClassNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;


public class Movies {
    String title;
    Integer year;
    String released;
    Integer runtime;
    String[] genres;
    String director;
    String[] writers;
    String[] actors;
    String plot;
    String[] languages;
    String[] countries;
    String awards;
    String poster;
    double ratings;

    public Movies(String title,
                  int year,
                  int runtime,
                  String[] genres,
                  String director,
                  String[] actors,
                  double ratings) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.genres = genres;
        this.director = director;
        this.actors = actors;
        this.ratings = ratings;
    }



    public static void main(String[] args) throws Exception {

        //Create some sample movies with the fields we need

        Movies pulpFiction = new Movies("Pulp Fiction", 1995,
                154, new String[]{"adventure", "action", "comedy"}, "Quentin Tarantino",
                new String[]{"John Travolta", "Samuel L. Jackson", "Uma Thurman"}, 9.2);

        Movies titanic = new Movies("Titanic", 1997,
                195, new String[]{"romance", "action", "documentary"}, "James Cameron",
                new String[]{"Leonardo Di Caprio", "Kate Winsley"}, 7.8);

        Movies fightClub = new Movies("Fight Club", 1999,
                154, new String[]{"psychological thriller", "romance", "satire"}, "David Fincher",
                new String[]{"Brad Pitt", "Edward Norton", "Helena Bonham"}, 8.8);

        //put those movies in a list
        ArrayList<Movies> myMovies = new ArrayList<>();
        myMovies.add(pulpFiction);
        myMovies.add(titanic);
        myMovies.add(fightClub);

        



    }

}
