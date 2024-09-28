package ass18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New User Registration");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2, 10, 10));

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JLabel mobileLabel = new JLabel("Mobile Number:");
        JTextField mobileField = new JTextField();

        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel("");

        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(registerButton);
        frame.add(messageLabel);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
                        usernameField.getText().isEmpty() || passwordField.getPassword().length == 0 ||
                        emailField.getText().isEmpty() || addressField.getText().isEmpty() ||
                        mobileField.getText().isEmpty()) {
                    messageLabel.setText("Please fill all the fields.");
                } else {
                    messageLabel.setText("Registration successful.");
                }
            }
        });

        frame.setVisible(true);
    }
}

