package com.itshaala;

import com.itshaala.dao.MovieDao;
import com.itshaala.model.Movie;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();

        Movie movie = new Movie();
        movie.setId(1);


//        movieDao.delete(movie);
        System.out.println(movieDao.getById(2));

    }
}
