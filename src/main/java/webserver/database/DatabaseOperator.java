package webserver.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import webserver.models.User;

public class DatabaseOperator {

    private Connection connection;

    public DatabaseOperator() throws SQLException{
        connection = new DatabaseConnector().getConnection();
    }

    public void saveUser(User user) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users (email, password)");
        statement.setString(0, null);
    }
}
