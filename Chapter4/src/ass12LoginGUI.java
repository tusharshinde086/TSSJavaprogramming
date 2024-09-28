
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ass12LoginGUI {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Login");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 2, 10, 10));

            JLabel usernameLabel = new JLabel("Username:");
            JTextField usernameField = new JTextField();

            JLabel passwordLabel = new JLabel("Password:");
            JPasswordField passwordField = new JPasswordField();

            JButton loginButton = new JButton("Login");
            JLabel messageLabel = new JLabel("");

            frame.add(usernameLabel);
            frame.add(usernameField);
            frame.add(passwordLabel);
            frame.add(passwordField);
            frame.add(new JLabel()); // Placeholder
            frame.add(loginButton);
            frame.add(new JLabel()); // Placeholder
            frame.add(messageLabel);

            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());

                    if (username.equals("admin") && password.equals("admin")) {
                        messageLabel.setText("Login successful!");
                    } else {
                        messageLabel.setText("Invalid credentials.");
                    }
                }
            });

            frame.setVisible(true);
        }
    }
