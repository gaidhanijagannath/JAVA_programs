package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/person_example","root","jagannath@123");


            Statement statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery("select * from person");


            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+
                        resultSet.getDate("birth_date")+" "+
                        resultSet.getString(3)+" "+
                        resultSet.getString(4));
            }

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}