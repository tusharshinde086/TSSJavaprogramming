import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonDetails {
    private static final String URL = "jdbc:postgresql://localhost:5432/my_database";
    private static final String USER = "my_username";
    private static final String PASSWORD = "my_password";


    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(query);

            System.out.printf("%-5s %-20s %-10s %-10s%n", "PID", "Name", "Gender", "Birth Year");
            System.out.println("-----------------------------------------------------");
            while (resultSet.next()) {
                int pid = resultSet.getInt("PID");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int birthYear = resultSet.getInt("birth_year");
                System.out.printf("%-5d %-20s %-10s %-10d%n", pid, name, gender, birthYear);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
