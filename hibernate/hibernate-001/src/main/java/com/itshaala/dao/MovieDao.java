package com.itshaala.dao;

import com.itshaala.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDao {
    public void addMovie(Movie movie) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(movie);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("movie added successfully");
    }

    public void updateMovie(Movie movie) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(movie);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("movie updated successfully");
    }

    public void delete(Movie movie) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.remove(movie);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("movie deleted successfully");
    }

    public Movie getById(int id) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Movie movie = session.find(Movie.class, id);
        session.close();
        sessionFactory.close();
        return movie;
    }
}
