package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Movie movie_array[] = new Movie[10];
        movie_array[0] = new Movie("movie 1", Math.random() * 10);
        movie_array[1] = new Movie("movie 2", Math.random() * 10);
        movie_array[2] = new Movie("movie 3", Math.random() * 10);
        movie_array[3] = new Movie("movie 4", Math.random() * 10);
        movie_array[4] = new Movie("movie 5", Math.random() * 10);
        movie_array[5] = new Movie("movie 6", Math.random() * 10);
        movie_array[6] = new Movie("movie 7", Math.random() * 10);
        movie_array[7] = new Movie("movie 8", Math.random() * 10);
        movie_array[8] = new Movie("movie 9", Math.random() * 10);
        movie_array[9] = new Movie("movie 10", Math.random() * 10);

        Movie movie = new Movie();
        System.out.println(movie.bestRated(movie_array));


    }
}
