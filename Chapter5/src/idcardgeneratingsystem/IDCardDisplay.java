package idcardgeneratingsystem;

import javax.swing.*;
import java.awt.*;

public class IDCardDisplay extends JFrame {

    public IDCardDisplay(String name, String country, String address, String gender, String info, String birthDate, String issueDate, String nic) {
        setTitle("ID Card");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        panel.setBackground(new Color(255, 255, 204)); // Light yellow background
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Name:"));
        panel.add(createLabelWithValue(name));

        panel.add(new JLabel("Country:"));
        panel.add(createLabelWithValue(country));

        panel.add(new JLabel("Address:"));
        panel.add(createLabelWithValue(address));

        panel.add(new JLabel("Gender:"));
        panel.add(createLabelWithValue(gender));

        panel.add(new JLabel("Info:"));
        panel.add(createLabelWithValue(info));

        panel.add(new JLabel("Birth Date:"));
        panel.add(createLabelWithValue(birthDate));

        panel.add(new JLabel("Issue Date:"));
        panel.add(createLabelWithValue(issueDate));

        panel.add(new JLabel("NIC:"));
        panel.add(createLabelWithValue(nic));

        add(panel);
        setVisible(true);
    }

    private JLabel createLabelWithValue(String value) {
        JLabel label = new JLabel(value);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(new Color(0, 102, 204)); // Blue color for text
        label.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204), 1)); // Border for the label
        label.setHorizontalAlignment(SwingConstants.LEFT);
        return label;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new IDCardDisplay("John Doe", "USA", "123 Main St", "Male", "Info about John", "1990-01-01", "2024-10-09", "90100V"));
    }
}
