package com.exercici01;

import java.sql.*;

public class Main {

    public static void main(String[] args){

        Connection conexio = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexio = DriverManager.getConnection ("jdbc:mysql://172.17.0.1:3306/persona", "root", "claveroot");

            Statement s = conexio.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM persona");

            while (rs.next()){

                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDate(3));
            }

        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally {

            try{

                conexio.close();
            }
            catch (SQLException e){

                e.printStackTrace();
            }
        }
    }
}