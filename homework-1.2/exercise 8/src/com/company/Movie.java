package com.company;
/*8 Design a class named Movie. properties - title, - rating
Create 10 movie objects in main, give them titles and random ratings in range (0 - 10) and store them in the array;
get the best-rated movie/movies from the array and display the title.
*/
public class Movie {
    private String title;
    private double rating;

    public Movie(){}

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String bestRated(Movie[] movies){
        double maxRate = movies[0].getRating();
        String maxRatedMovie = movies[0].getTitle();
        for (int i = 0; i < movies.length; i++) {
            if(maxRate < movies[i].getRating()){
                maxRate = movies[i].getRating();
                maxRatedMovie = movies[i].getTitle();
            }

        }
        return maxRatedMovie;
    }
}
