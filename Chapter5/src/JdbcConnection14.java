/*

CREATE DATABASE my_database;

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection14 {

    private static final String URL = "jdbc:mysql://localhost:3306/my_database";  // Change database name if necessary
    private static final String USER = "new_user";  // Change to your MySQL username
    private static final String PASSWORD = "system";  // Change to your MySQL password

    public static void main(String[] args) {
        // Establish a connection to the database
        try {
            // Load and register the JDBC driver (optional for newer Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection using DriverManager
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // If the connection is successful
            System.out.println("Connected to the database successfully!");

            // Close the connection (optional for a simple demo)
            con.close();

        } catch (SQLException e) {
            // If a SQL exception occurs
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // If the driver class is not found (for older Java versions)
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}

/*
OUTPUT

Connected to the database successfully!

 */