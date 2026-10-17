package com.itshaala.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    private static Connection connection;
    private static Properties properties = new Properties();

    static {

        File file = new File("application.properties");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Class.forName(properties.getProperty("mysql.driver"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection()  {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        properties.getProperty("mysql.url"),
                        properties.getProperty("mysql.username"),
                        properties.getProperty("mysql.password"));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
