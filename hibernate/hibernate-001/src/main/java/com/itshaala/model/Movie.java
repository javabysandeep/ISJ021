package com.itshaala.model;

import jakarta.persistence.*;

@Entity
@Table(name="movie_tbl")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="year")
    private int year;

    @Column(name="genre")
    private String genre;

    @Column(name="director")
    private String director;

    @Column(name="actor")
    private String actor;

    public Movie() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }

    public Movie(int id, String title, String description, int year, String genre, String director, String actor) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
    }
}
