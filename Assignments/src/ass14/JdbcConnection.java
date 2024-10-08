package ass14;/*

CREATE DATABASE my_database;

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/my_database";  // Change database name if necessary
    private static final String USER = "new_user";  // Change to your MySQL username
    private static final String PASSWORD = "system";  // Change to your MySQL password

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
            con.close();

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}

/*
OUTPUT

Connected to the database successfully!

 */