
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

  public class StudentTableApp1C {
      private static final String URL = "jdbc:mysql://localhost:3306/my_database";
      private static final String USER = "new_user";
      private static final String PASSWORD = "system";
      
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Student Details");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);
                frame.setLocationRelativeTo(null);

                // Create table model and JTable
                DefaultTableModel model = new DefaultTableModel(new String[]{"Roll Number", "Name", "Percentage"}, 0);
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                frame.add(scrollPane, BorderLayout.CENTER);

                // Fetch and display student data
                fetchAndDisplayStudentData(model);

                frame.setVisible(true);
            });
        }

        // Method to fetch data from the Student table and display it
        private static void fetchAndDisplayStudentData(DefaultTableModel model) {
            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM Student")) {

                // Add rows to the table model from the ResultSet
                while (rs.next()) {
                    int rollNumber = rs.getInt("roll_number");
                    String name = rs.getString("name");
                    double percentage = rs.getDouble("percentage");

                    model.addRow(new Object[]{rollNumber, name, percentage});
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

