package ass7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerAccountDetails {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Customer Account Details");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelCustomer = new JLabel("Name of Customer :");
        labelCustomer.setBounds(30, 30, 150, 30);
        frame.add(labelCustomer);

        JTextField customerField = new JTextField();
        customerField.setBounds(180, 30, 150, 30);
        frame.add(customerField);

        JLabel labelBank = new JLabel("Name of Bank  :");
        labelBank.setBounds(30, 80, 150, 30);
        frame.add(labelBank);

        JTextField bankField = new JTextField();
        bankField.setBounds(180, 80, 150, 30);
        frame.add(bankField);

        JLabel labelAccNo = new JLabel("Account Number:");
        labelAccNo.setBounds(30, 130, 150, 30);
        frame.add(labelAccNo);

        JTextField accNoField = new JTextField();
        accNoField.setBounds(180, 130, 150, 30);
        frame.add(accNoField);

        JLabel labelPan = new JLabel("PAN Number:");
        labelPan.setBounds(30, 180, 150, 30);
        frame.add(labelPan);

        JTextField panField = new JTextField();
        panField.setBounds(180, 180, 150, 30);
        frame.add(panField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 230, 100, 30);
        frame.add(submitButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 280, 300, 30);
        frame.add(messageLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String customerName = customerField.getText();
                String bankName = bankField.getText();
                String accNumber = accNoField.getText();
                String panNumber = panField.getText();

                if (customerName.isEmpty() || bankName.isEmpty() || accNumber.isEmpty() || panNumber.isEmpty()) {
                    messageLabel.setText("Please fill all the details.");
                } else {
                    messageLabel.setText("Details submitted successfully.");
                }
            }
        });

        frame.setVisible(true);
    }
}
