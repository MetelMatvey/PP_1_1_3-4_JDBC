package jm.task.core.jdbc.util;

import com.sun.jdi.connect.Connector;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final static String URL = "jdbc:mysql://localhost:3306/users";
    private final static String USERNAME = "roo";
    private final static String PASSWORD = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установено.");
        } catch (SQLException e) {
            System.out.println("Ошибка при установлении соединения.");
        }
        return connection;
    }


}
