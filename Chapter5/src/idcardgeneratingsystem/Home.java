/*
mysql -u new_user -p -h localhost -D my_database
pass : system

CREATE DATABASE idcard_system;

USE idcard_system;

CREATE TABLE id_cards (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    country VARCHAR(100),
    address VARCHAR(255),
    gender VARCHAR(10),
    info TEXT,
    birthdate DATE,
    issuedate DATE,
    nic VARCHAR(20)
);

*/

package idcardgeneratingsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Home extends JFrame {

    private JTextField txtName, txtCountry, txtAddress, txtInfo;
    private JComboBox<String> cmbGender;
    private JDateChooser bdate, idate;

    // Ensure you use the correct database name here
    private static final String URL = "jdbc:mysql://localhost:3306/my_database"; // Updated to correct database
    private static final String USER = "new_user";
    private static final String PASS = "system";
    private int lvalue = 1000; // Initial value for NIC generation

    public Home() {
        initComponents();
    }

    private void initComponents() {
        setTitle("ID Card Generating System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtName = new JTextField(15);
        txtCountry = new JTextField(15);
        txtAddress = new JTextField(15);
        txtInfo = new JTextField(15);
        cmbGender = new JComboBox<>(new String[]{"Male", "Female"});
        bdate = new JDateChooser();
        idate = new JDateChooser();

        setLayout(new GridLayout(8, 2));
        add(new JLabel("Name:"));
        add(txtName);
        add(new JLabel("Country:"));
        add(txtCountry);
        add(new JLabel("Address:"));
        add(txtAddress);
        add(new JLabel("Info:"));  // Changed from "Class:" to "Info:"
        add(txtInfo);
        add(new JLabel("Gender:"));
        add(cmbGender);
        add(new JLabel("Birth Date:"));
        add(bdate);
        add(new JLabel("Issue Date:"));
        add(idate);
        add(new JButton("Submit") {{ addActionListener(e -> submitData()); }});
        add(new JButton("Display") {{ addActionListener(e -> displayData()); }});

        pack();
        setVisible(true);
    }

    private void submitData() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pst = conn.prepareStatement("INSERT INTO id_cards (name, country, address, gender, info, birthdate, issuedate) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            pst.setString(1, txtName.getText());
            pst.setString(2, txtCountry.getText());
            pst.setString(3, txtAddress.getText());
            pst.setString(4, (String) cmbGender.getSelectedItem());
            pst.setString(5, txtInfo.getText());
            pst.setString(6, formatDate(bdate));
            pst.setString(7, formatDate(idate));
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
                String country = rs.getString("country");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String info = rs.getString("info");
                Date birthdate = rs.getDate("birthdate");
                Date issuedate = rs.getDate("issuedate");
                String nic = generateNIC(birthdate, gender);

                new IDCardDisplay(
                        name,
                        country,
                        address,
                        gender,
                        info,
                        new SimpleDateFormat("yyyy-MM-dd").format(birthdate),
                        new SimpleDateFormat("yyyy-MM-dd").format(issuedate),
                        nic
                ).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No data found!");
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }

    private String generateNIC(java.sql.Date birthdate, String gender) {
        String year = new SimpleDateFormat("yy").format(birthdate);
        int genvalue = gender.equals("Male") ? 100 : 500;
        return year + genvalue + (lvalue++) + "V"; // Increment for the next NIC
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
