/*
CREATE DATABASE college;

\c college;

CREATE TABLE Course (
    Code SERIAL PRIMARY KEY,
    Name VARCHAR(50),
    Department VARCHAR(50),
    number_of_students INT
);

INSERT INTO Course (Name, Department, number_of_students) VALUES
('BCA Science', 'Computer Science', 500),
('BBA Management', 'Management', 300),
('MCA Commerce', 'Commerce', 150);

 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class UploadCourseRecord16 {

        private static final String URL = "jdbc:mysql://localhost:3306/my_database";
        private static final String USER = "new_user";
        private static final String PASSWORD = "system";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Establish a connection to the PostgreSQL database
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Display the existing records before taking input from the user
            System.out.println("Existing Course Records:");
            showExistingRecords(con);  // Method to display existing records

            // Accept input from the user for the course name and number of students
            System.out.print("Enter the Course Name to update (e.g., 'BCA Science'): ");
            String courseName = scanner.nextLine();

            System.out.print("Enter the new number of students: ");
            int numberOfStudents = scanner.nextInt();

            // SQL Update query to update the number_of_students for the provided course name
            String updateSQL = "UPDATE Course SET number_of_students = ? WHERE Name = ?";

            // Prepare the SQL statement with placeholders
            PreparedStatement pstmt = con.prepareStatement(updateSQL);

            // Set the values for placeholders
            pstmt.setInt(1, numberOfStudents);  // Update the number_of_students
            pstmt.setString(2, courseName);  // The course name to identify the record

            // Execute the update query
            int rowsUpdated = pstmt.executeUpdate();

            // Display the result
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully! " + rowsUpdated + " row(s) affected.");
            } else {
                System.out.println("No record found with the given course name.");
            }

            // Display the updated records after the update
            System.out.println("\nUpdated Course Records:");
            showExistingRecords(con);

            // Close the connection
            pstmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    // Method to display existing records in the Course table
    private static void showExistingRecords(Connection con) throws SQLException {
        String selectSQL = "SELECT * FROM Course";
        PreparedStatement selectStmt = con.prepareStatement(selectSQL);

        // Execute the query to get all records from the Course table
        ResultSet rs = selectStmt.executeQuery();

        // Display the records in a formatted manner
        System.out.printf("%-5s %-20s %-30s %-20s%n", "Code", "Name", "Department", "Number of Students");
        System.out.println("---------------------------------------------------------------");

        while (rs.next()) {
            System.out.printf("%-5d %-20s %-30s %-20d%n",
                    rs.getInt("Code"),
                    rs.getString("Name"),
                    rs.getString("Department"),
                    rs.getInt("number_of_students"));
        }

        rs.close();
        selectStmt.close();
    }
    }

    /*
    OUTPUT

    Existing Course Records:
Code  Name                 Department                     Number of Students
---------------------------------------------------------------
1     BCA Science          Computer Science               500
2     BBA Management       Management                     300
3     MCA Commerce         Commerce                       150
4     BCA Commerce         Commerce                       450
5     MBA Marketing        Management                     200
Enter the Course Name to update (e.g., 'BCA Science'): BCA Science
Enter the new number of students: 222
Record updated successfully! 1 row(s) affected.

Updated Course Records:
Code  Name                 Department                     Number of Students
---------------------------------------------------------------
1     BCA Science          Computer Science               222
2     BBA Management       Management                     300
3     MCA Commerce         Commerce                       150
4     BCA Commerce         Commerce                       450
5     MBA Marketing        Management                     200

     */
