package idcardgeneratingsystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Home extends JFrame {

    private JTextField txtCollegeName1, txtCollegeName2, txtCollegeName3, txtName, txtAddress, txtNIC, txtMobile, txtImagePath;
    private JTextField txtIDNo, txtClass, txtRollNo, txtBloodGroup;
    private JDateChooser birthDateChooser, issueDateChooser;

    private static final String URL = "jdbc:mysql://localhost:3306/my_database";
    private static final String USER = "new_user";
    private static final String PASS = "system";

    public Home() {
        initComponents();
    }

    private void initComponents() {
        setTitle("ID Card Generating System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(15, 2));

        txtCollegeName1 = new JTextField(15);
        txtCollegeName2 = new JTextField(15);
        txtCollegeName3 = new JTextField(15);
        txtName = new JTextField(15);
        txtAddress = new JTextField(15);
        txtNIC = new JTextField(15);
        txtMobile = new JTextField(15);
        txtIDNo = new JTextField(15);
        txtClass = new JTextField(15);
        txtRollNo = new JTextField(15);
        txtBloodGroup = new JTextField(15);
        txtImagePath = new JTextField(15);

        birthDateChooser = new JDateChooser();
        issueDateChooser = new JDateChooser();

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


        add(new JButton("Submit") {{
            addActionListener(e -> submitData());
        }});
        add(new JButton("Display") {{
            addActionListener(e -> displayData());
        }});

        pack();
        setLocation(100, 100);
        setVisible(true);
    }

    private void submitData() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pst = conn.prepareStatement("INSERT INTO id_cards (college_name1, college_name2, college_name3, name, address, birthdate, issuedate, nic, mobile, id_no, class, roll_no, blood_group, image_path) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            String collegeName1 = txtCollegeName1.getText().isEmpty() ? "Bharatiya Jain Sanghatanais" : txtCollegeName1.getText();
            String collegeName2 = txtCollegeName2.getText().isEmpty() ? "Arts, Science & Commerce College" : txtCollegeName2.getText();
            String collegeName3 = txtCollegeName3.getText().isEmpty() ? "Pune-Nager Road, Bakuri Phata, Wagholi, Pune-412207" : txtCollegeName3.getText();

            pst.setString(1, collegeName1);
            pst.setString(2, collegeName2);
            pst.setString(3, collegeName3);
            pst.setString(4, txtName.getText());
            pst.setString(5, txtAddress.getText());
            pst.setString(6, formatDate(birthDateChooser));
            pst.setString(7, formatDate(issueDateChooser));
            pst.setString(8, txtNIC.getText());
            pst.setString(9, txtMobile.getText());
            pst.setString(10, txtIDNo.getText());
            pst.setString(11, txtClass.getText());
            pst.setString(12, txtRollNo.getText());
            pst.setString(13, txtBloodGroup.getText());
            pst.setString(14, txtImagePath.getText());

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

                String collegeName1 = rs.getString("college_name1");
                String collegeName2 = rs.getString("college_name2");
                String collegeName3 = rs.getString("college_name3");
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
                String imagePath = rs.getString("image_path");
                new IDCardDisplay(
                        collegeName1,
                        collegeName2,
                        collegeName3,
                        new SimpleDateFormat("yyyy").format(new java.util.Date()),
                        name,
                        address,
                        nic,
                        mobile,
                        birthdateFormatted,
                        imagePath,
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
