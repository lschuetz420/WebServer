package webserver.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.lang.AutoCloseable;

import webserver.models.User;

public class DatabaseOperator implements AutoCloseable{
    
    private Connection connection;

    public DatabaseOperator() throws SQLException{
        connection = new DatabaseConnector().getConnection();
    }

    public void saveUser(User user) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users (UserEmail, UserPassword) VALUES (?,?");
        statement.setString(1, user.getEmail());
        statement.setString(2, user.getPassword());
        statement.executeUpdate();
    }

    public ResultSet getUsers(User user) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE UserEmail = '?'");
        statement.setString(1, user.getEmail());
        return statement.executeQuery();
    }

    @Override
    public void close() throws SQLException{
        connection.close();
    }
}
