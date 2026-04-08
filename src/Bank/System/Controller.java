package Bank.System;
//class to establish connection with the database
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Controller {
    Connection connection;
    public Statement statement;

    //make contructor public
    public Controller(){
        //as trying to connect with database leads to error create try and catch
        try{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
        statement=connection.createStatement();
//so here made connection--> starts the driver
            //driver-->statement we create the connection

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
