import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Jdbcexample1 {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/my_database"; // MySQL connection URL
    private static final String USER = "new_user"; // Your MySQL username
    private static final String PASSWORD = "system"; // Your MySQL password

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement()) {

            // Query the Person table
            String selectSQL = "SELECT * FROM Person"; // Ensure the Person table exists in your MySQL database
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Display the results in a formatted manner
            System.out.printf("%-5s %-20s %-10s %-10s%n", "PID", "Name", "Gender", "Birth Year");
            System.out.println("-----------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-10s %-10d%n",
                        rs.getInt("PID"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getInt("birth_year"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
