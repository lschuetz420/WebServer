package webserver.BC;

import java.sql.SQLException;

import webserver.database.DatabaseOperator;

public class UserBC extends BC{

    private DatabaseOperator operator;

    public void saveUser(){
        try(DatabaseOperator operator = new DatabaseOperator()){
            operator.saveUser(null);
        } catch (SQLException e){

        }
    }
}