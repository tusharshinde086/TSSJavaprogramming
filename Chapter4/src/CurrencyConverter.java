import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JTextField amountField;
    private JLabel resultLabel;
    private JButton convertButton;
    private JComboBox<String> currencyOptions;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        amountField = new JTextField(10);
        resultLabel = new JLabel("Converted Amount: ");
        convertButton = new JButton("Convert");
        currencyOptions = new JComboBox<>(new String[]{"USD to INR", "INR to USD"});

        // Set layout
        setLayout(new FlowLayout());
        add(new JLabel("Enter Amount: "));
        add(amountField);
        add(currencyOptions);
        add(convertButton);
        add(resultLabel);

        // Add action listener for the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String selectedOption = (String) currencyOptions.getSelectedItem();
            double convertedAmount;

            // Conversion rates (you can adjust these rates as needed)
            final double USD_TO_INR_RATE = 82.75; // Example rate
            final double INR_TO_USD_RATE = 0.012;  // Example rate

            if ("USD to INR".equals(selectedOption)) {
                convertedAmount = amount * USD_TO_INR_RATE;
                resultLabel.setText(String.format("Converted Amount: %.2f INR", convertedAmount));
            } else {
                convertedAmount = amount * INR_TO_USD_RATE;
                resultLabel.setText(String.format("Converted Amount: %.2f USD", convertedAmount));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverter converter = new CurrencyConverter();
            converter.setVisible(true);
        });
    }
}
