package webserver.BC;

import java.sql.SQLException;

import webserver.database.DatabaseOperator;
import webserver.util.ErrorHandler;

public class UserBC{

    private DatabaseOperator operator;

    public void saveUser(){
        try(DatabaseOperator operator = new DatabaseOperator()){
            operator.saveUser(null);
        } catch (SQLException e){
            new ErrorHandler().printToConsoleAddLog(e);
        }
    }
}