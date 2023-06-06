package ru.netology.moviePoster;

public class MoviePoster {
    private int id;
    private String genre;
    private String title;


    public MoviePoster(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public MoviePoster() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
