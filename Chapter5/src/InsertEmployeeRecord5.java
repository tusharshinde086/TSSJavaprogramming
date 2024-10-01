/*
CREATE DATABASE my_database;  

USE my_database;

CREATE TABLE Employee (
    ID INT PRIMARY KEY,
    Name VARCHAR(50),
    Salary DOUBLE
);

 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeRecord5 {
        // Database URL and credentials
        private static final String URL = "jdbc:mysql://localhost:3306/my_database";
        private static final String USER = "new_user";
        private static final String PASSWORD = "system";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of employees to insert: ");
            int numberOfEmployees = scanner.nextInt();

            // SQL insert query using PreparedStatement
            String insertSQL = "INSERT INTO Employee (ID, Name, Salary) VALUES (?, ?, ?)";

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement pstmt = con.prepareStatement(insertSQL)) {

                // Loop to accept details for each employee
                for (int i = 1; i <= numberOfEmployees; i++) {
                    System.out.println("Enter details for Employee " + i + ":");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline left-over

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();

                    // Set the values in the PreparedStatement
                    pstmt.setInt(1, id);
                    pstmt.setString(2, name);
                    pstmt.setDouble(3, salary);

                    // Execute the insert query
                    pstmt.executeUpdate();
                    System.out.println("Record for Employee " + i + " inserted successfully!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            scanner.close();
        }
    }
