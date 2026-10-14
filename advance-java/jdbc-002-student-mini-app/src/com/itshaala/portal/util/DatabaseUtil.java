package com.itshaala.portal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static String url = "jdbc:mysql://localhost:3306/isj022";
    private static String username = "root";
    private static String password = "root";
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("unable to load driver");

        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                System.out.println("unable to connect to database");
            }

        }
        return connection;
    }
}
