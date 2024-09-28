
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ass6Calculator {

        public static void main(String[] args) {
            JFrame frame = new JFrame("Calculator");
            frame.setSize(400, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JTextField display = new JTextField();
            display.setFont(new Font("Arial", Font.PLAIN, 30));
            display.setHorizontalAlignment(JTextField.RIGHT);
            frame.add(display, BorderLayout.NORTH);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 4, 10, 10));

            String[] buttons = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", "C", "=", "+"
            };

            for (String text : buttons) {
                JButton button = new JButton(text);
                button.setFont(new Font("Arial", Font.PLAIN, 24));
                panel.add(button);
            }

            frame.add(panel, BorderLayout.CENTER);

            ActionListener listener = new ActionListener() {
                String operand1 = "";
                String operand2 = "";
                String operator = "";
                boolean isOperatorPressed = false;

                public void actionPerformed(ActionEvent e) {
                    String input = e.getActionCommand();

                    if (input.matches("[0-9]")) {
                        if (!isOperatorPressed) {
                            operand1 += input;
                            display.setText(operand1);
                        } else {
                            operand2 += input;
                            display.setText(operand2);
                        }
                    } else if (input.matches("[+\\-*/]")) {
                        if (!operand1.isEmpty()) {
                            operator = input;
                            isOperatorPressed = true;
                        }
                    } else if (input.equals("=")) {
                        if (!operand1.isEmpty() && !operand2.isEmpty()) {
                            double result = calculate(Double.parseDouble(operand1), Double.parseDouble(operand2), operator);
                            display.setText(String.valueOf(result));
                            operand1 = String.valueOf(result);
                            operand2 = "";
                            isOperatorPressed = false;
                        }
                    } else if (input.equals("C")) {
                        operand1 = operand2 = operator = "";
                        display.setText("");
                        isOperatorPressed = false;
                    }
                }

                private double calculate(double num1, double num2, String operator) {
                    switch (operator) {
                        case "+": return num1 + num2;
                        case "-": return num1 - num2;
                        case "*": return num1 * num2;
                        case "/": return num1 / num2;
                        default: return 0;
                    }
                }
            };

            for (Component comp : panel.getComponents()) {
                if (comp instanceof JButton) {
                    ((JButton) comp).addActionListener(listener);
                }
            }

            frame.setVisible(true);
        }
    }
