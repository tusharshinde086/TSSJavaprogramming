package idcardgeneratingsystem;

import javax.swing.*;
import java.awt.*;

public class IDCardDisplay extends JFrame {

    public IDCardDisplay(
            String collegeName1, String collegeName2, String collegeName3, String identityCardYear, String name,
            String address, String nic, String mobile, String birthdate, String imagePath,
            String idNo, String classValue, String rollNo, String bloodGroup
    ) {
        setTitle("ID Card Display");
        setSize(280, 430); // Set overall size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // College Name Panel
        JPanel collegePanel = new JPanel();
        collegePanel.setLayout(new BoxLayout(collegePanel, BoxLayout.Y_AXIS));
        collegePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel collegeLabel1 = new JLabel(collegeName1);
        collegeLabel1.setForeground(Color.BLUE);
        collegeLabel1.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel collegeLabel2 = new JLabel(collegeName2);
        collegeLabel2.setForeground(Color.RED);
        collegeLabel2.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel collegeLabel3 = new JLabel(collegeName3);
        collegeLabel3.setForeground(Color.BLUE);
        collegeLabel3.setFont(new Font("Arial", Font.PLAIN, 10));

        collegePanel.add(collegeLabel1);
        collegePanel.add(collegeLabel2);
        collegePanel.add(collegeLabel3);

        // Identity Card Label
        JLabel idCardLabel = new JLabel("Identity Card - " + identityCardYear);
        idCardLabel.setForeground(Color.BLUE);
        idCardLabel.setFont(new Font("Arial", Font.BOLD, 16));
        collegePanel.add(idCardLabel);

        mainPanel.add(collegePanel, BorderLayout.NORTH);

        // Photo and Info Panel
        JPanel infoPanel = new JPanel(new BorderLayout());

        // Left side: Photo
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        // Load and resize the image
        ImageIcon photo = new ImageIcon(imagePath);
        Image img = photo.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH); // Resize to 100x150 pixels
        JLabel photoLabel = new JLabel(new ImageIcon(img));

        leftPanel.add(photoLabel); // Add photo

        // Right side: Info fields
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(0, 1)); // Vertical stacking
        rightPanel.setBackground(Color.WHITE);

        rightPanel.add(createLabelValue("ID No:", idNo));
        rightPanel.add(createLabelValue("Class:", classValue));
        rightPanel.add(createLabelValue("Roll No:", rollNo));
        rightPanel.add(createLabelValue("Blood Group:", bloodGroup));
        rightPanel.add(createLabelValue("Birth Date:", birthdate));

        // Add both panels to infoPanel
        JPanel combinedPanel = new JPanel();
        combinedPanel.setLayout(new BorderLayout());
        combinedPanel.add(leftPanel, BorderLayout.WEST);
        combinedPanel.add(rightPanel, BorderLayout.CENTER);

        infoPanel.add(combinedPanel, BorderLayout.SOUTH);
        mainPanel.add(infoPanel, BorderLayout.CENTER);

        // Name and Address Panel
        JPanel bottomPanel = new JPanel(new GridBagLayout());
        bottomPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Name
        JLabel nameLabel = new JLabel(name);
        nameLabel.setForeground(Color.BLUE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Large font for name
        bottomPanel.add(nameLabel, gbc);

        // Address
        gbc.gridy++;
        JLabel addressLabel = new JLabel(address);
        addressLabel.setForeground(Color.BLACK);
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 12)); // Smaller font for address
        bottomPanel.add(addressLabel, gbc);

        // NIC
        gbc.gridy++;
        bottomPanel.add(createLabelValue("NIC:", nic), gbc);

        // Mobile number
        gbc.gridy++;
        JLabel mobileLabel = new JLabel("Mobile: " + mobile);
        mobileLabel.setForeground(Color.BLACK);
        mobileLabel.setFont(new Font("Arial", Font.PLAIN, 10)); // Smaller font for mobile
        bottomPanel.add(mobileLabel, gbc);

        // Signature
        gbc.gridy++;
        JLabel signatureLabel = new JLabel("Signature: ___________________");
        signatureLabel.setForeground(Color.BLACK);
        signatureLabel.setFont(new Font("Arial", Font.PLAIN, 12)); // Smaller font for signature
        signatureLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        bottomPanel.add(signatureLabel, gbc);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setVisible(true);
    }

    // Helper method to create label-value pairs
    private JPanel createLabelValue(String labelText, String valueText) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.WHITE); // Match background color

        JLabel label = new JLabel(labelText);
        label.setForeground(Color.BLUE);
        panel.add(label); // Add label

        JLabel valueLabel = new JLabel(valueText);
        valueLabel.setForeground(Color.BLACK);
        panel.add(valueLabel); // Add value label

        return panel;
    }
}
