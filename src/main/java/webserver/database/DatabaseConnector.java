package webserver.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import webserver.util.ErrorHandler;

public class DatabaseConnector{
    private String url = "jdbc:mysql://localhost:3306/webserver";
    private String userName = "Admin";
    private String password = "Admin123";

    private Connection connection;

    public DatabaseConnector() throws SQLException{
        connection = DriverManager.getConnection(url, userName, password);
    }   

    public Connection getConnection(){
        return connection;
    }
}