package idcardgeneratingsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Home extends JFrame {

    private JTextField txtCollegeName1, txtCollegeName2, txtCollegeName3, txtName, txtAddress, txtNIC, txtMobile, txtImagePath;
    private JTextField txtIDNo, txtClass, txtRollNo, txtBloodGroup;  // New fields for ID, Class, Roll No, and Blood Group
    private JDateChooser birthDateChooser, issueDateChooser;

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/my_database";
    private static final String USER = "new_user";
    private static final String PASS = "system";

    public Home() {
        initComponents();
    }

    private void initComponents() {
        setTitle("ID Card Generating System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(15, 2)); // Adjusted layout for more fields

        // Initialize input fields
        txtCollegeName1 = new JTextField(15);
        txtCollegeName2 = new JTextField(15);
        txtCollegeName3 = new JTextField(15);
        txtName = new JTextField(15);
        txtAddress = new JTextField(15);
        txtNIC = new JTextField(15);
        txtMobile = new JTextField(15);
        txtIDNo = new JTextField(15);      // New field for ID No
        txtClass = new JTextField(15);     // New field for Class
        txtRollNo = new JTextField(15);    // New field for Roll No
        txtBloodGroup = new JTextField(15); // New field for Blood Group
        txtImagePath = new JTextField(15);

        birthDateChooser = new JDateChooser();
        issueDateChooser = new JDateChooser();

        // Add components to the form
        add(new JLabel("College Name 1:"));
        add(txtCollegeName1);
        add(new JLabel("College Name 2:"));
        add(txtCollegeName2);
        add(new JLabel("College Name 3:"));
        add(txtCollegeName3);
        add(new JLabel("Name:"));
        add(txtName);
        add(new JLabel("Address:"));
        add(txtAddress);
        add(new JLabel("NIC:"));
        add(txtNIC);
        add(new JLabel("Mobile:"));
        add(txtMobile);
        add(new JLabel("Birth Date:"));
        add(birthDateChooser);
        add(new JLabel("Issue Date:"));
        add(issueDateChooser);
        add(new JLabel("ID No:"));
        add(txtIDNo);
        add(new JLabel("Class:"));
        add(txtClass);
        add(new JLabel("Roll No:"));
        add(txtRollNo);
        add(new JLabel("Blood Group:"));
        add(txtBloodGroup);
        add(new JLabel("Image Path:"));
        add(txtImagePath);

        // Add buttons for submitting and displaying
        add(new JButton("Submit") {{
            addActionListener(e -> submitData());
        }});
        add(new JButton("Display") {{
            addActionListener(e -> displayData());
        }});

        pack();
        setVisible(true);
    }

    private void submitData() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pst = conn.prepareStatement("INSERT INTO id_cards (name, address, birthdate, issuedate, nic, mobile, id_no, class, roll_no, blood_group) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            pst.setString(1, txtName.getText());
            pst.setString(2, txtAddress.getText());
            pst.setString(3, formatDate(birthDateChooser));
            pst.setString(4, formatDate(issueDateChooser));
            pst.setString(5, txtNIC.getText());
            pst.setString(6, txtMobile.getText());
            pst.setString(7, txtIDNo.getText());
            pst.setString(8, txtClass.getText());
            pst.setString(9, txtRollNo.getText());
            pst.setString(10, txtBloodGroup.getText());

            pst.executeUpdate();
            showMessage("Data Submitted Successfully!");

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }

    private void displayData() {
        String query = "SELECT * FROM id_cards ORDER BY id DESC LIMIT 1";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String nic = rs.getString("nic");
                String mobile = rs.getString("mobile");
                String idNo = rs.getString("id_no");
                String classValue = rs.getString("class");
                String rollNo = rs.getString("roll_no");
                String bloodGroup = rs.getString("blood_group");
                Date birthdate = rs.getDate("birthdate");
                String birthdateFormatted = new SimpleDateFormat("yyyy-MM-dd").format(birthdate);

                // Display the ID card using the IDCardDisplay class
                new IDCardDisplay(
                        txtCollegeName1.getText(),
                        txtCollegeName2.getText(),
                        txtCollegeName3.getText(),
                        new SimpleDateFormat("yyyy").format(new java.util.Date()), // Current year for identity card
                        name,
                        address,
                        nic,
                        mobile,
                        birthdateFormatted,
                        txtImagePath.getText(),
                        idNo,
                        classValue,
                        rollNo,
                        bloodGroup
                ).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No data found!");
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }

    private String formatDate(JDateChooser dateChooser) {
        return new SimpleDateFormat("yyyy-MM-dd").format(dateChooser.getDate());
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Home::new);
    }
}
