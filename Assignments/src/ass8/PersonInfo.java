/*
CREATE TABLE Person (
    PID SERIAL PRIMARY KEY,
    name VARCHAR(100),
    gender VARCHAR(10),
    birth_year INT
);

INSERT INTO Person (name, gender, birth_year) VALUES ('Alice', 'Female', 1990);
INSERT INTO Person (name, gender, birth_year) VALUES ('Bob', 'Male', 1985);
INSERT INTO Person (name, gender, birth_year) VALUES ('Charlie', 'Male', 1992);

 */

package ass8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class PersonInfo {
    private static final String URL = "jdbc:mysql://localhost:3306/my_database";  // Change database name if necessary
    private static final String USER = "new_user";  // Change to your MySQL username
    private static final String PASSWORD = "system"; // Update with your database password

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = con.createStatement(); // Corrected this line
            String query = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println("Number of columns: " + columnCount);
            System.out.println("Column details:");
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                System.out.println("Column " + i + ": " + columnName + " - SQL Type: " + columnType);
            }

            resultSet.close();
            statement.close();
            con.close(); // Corrected this line
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



/*
OUTPUT

Number of columns: 4
Column details:
Column 1: pid - SQL Type: SERIAL
Column 2: name - SQL Type: VARCHAR
Column 3: gender - SQL Type: VARCHAR
Column 4: birth_year - SQL Type: INT

 */