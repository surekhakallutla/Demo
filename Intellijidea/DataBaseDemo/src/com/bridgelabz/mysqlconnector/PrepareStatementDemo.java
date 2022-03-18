package com.bridgelabz.mysqlconnector;

import java.sql.*;

public class PrepareStatementDemo {
    public static void main(String[] args) {
        try {
            //1. Load Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Connection Object
            //"driver:application://adIp:PortofDB/DBName,"DBUserName","DBPassword";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz", "root", "password");

            //3. Create Prepared Statement
            String insertQuery = "INSERT INTO Employee VALUES(?,?,?);";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
            insertStmt.setInt(1,10);
            insertStmt.setString(2, "ABC");
            insertStmt.setInt(3, 25);


            //4. execute statement(Query/Update)

            //DML : Insert, Delete,Update
            int count = insertStmt.executeUpdate();

            String updateQuery = "UPDATE Employee SET name = ? WHERE id = ?;";
            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
            updateStmt.setInt(2, 10);
            updateStmt.setString(1, "PQR");
            count = updateStmt.executeUpdate();


            String deleteQuery = "DELETE FROM Employee WHERE id = ?";
            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 10);
            count = deleteStmt.executeUpdate();

            //DQL: SELECT
            String selectQuery = "SELECT * FROM Employee";
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            ResultSet rs = selectStmt.executeQuery();
            System.out.println(rs);

            //5.Printing the Database Table
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getInt(3) + " "+ rs.getString(2));
            }

            //6. Close all resources
            con.close();
            rs.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

