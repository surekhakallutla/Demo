package com.bridgelabz.mysqlconnector;

import java.sql.*;

public class DatabaseLearning {
    public static void main(String[] args) {
        try {
            //1. Load Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Connection Object
            //"driver:application://adIp:PortofDB/DBName,"DBUserName","DBPassword";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz", "root", "password");

            //3. Create Statement
            Statement stmt = con.createStatement();

            //4. execute statement(Query/Update)

            //DML : Insert, Delete,Update
            String insertQuery = "INSERT INTO Employee VALUES(5,'Kalpesh',27);";
            int count = stmt.executeUpdate(insertQuery);

            String updateQuery = "UPDATE Employee SET name = 'Rekha' WHERE id = 5";
            count = stmt.executeUpdate(updateQuery);

            String deleteQuery = "DELETE FROM Employee WHERE id = 5";
            count = stmt.executeUpdate(deleteQuery);

            //DQL: SELECT
            String selectQuery = "SELECT * FROM Employee";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println(rs);

            //5.Printing the Database Table
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getInt(3) + " "+ rs.getString(2));
            }

            //6. Close all resources
            stmt.close();
            con.close();
            rs.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
