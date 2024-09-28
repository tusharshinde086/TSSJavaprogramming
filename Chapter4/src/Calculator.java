
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Calculator {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Simple Calculator");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(5, 4));

            JTextField display = new JTextField();
            frame.add(display);

            String[] buttons = {"","","",
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", "C", "=", "+" };

            for (String button : buttons) {
                JButton b = new JButton(button);
                frame.add(b);
                b.addActionListener(new ActionListener() {
                    String operand1 = "";
                    String operator = "";

                    public void actionPerformed(ActionEvent e) {
                        String input = e.getActionCommand();
                        if (input.matches("\\d")) {
                            display.setText(display.getText() + input);
                        } else if (input.matches("[+\\-*/]")) {
                            operand1 = display.getText();
                            operator = input;
                            display.setText("");
                        } else if (input.equals("=")) {
                            int num1 = Integer.parseInt(operand1);
                            int num2 = Integer.parseInt(display.getText());
                            int result = 0;
                            switch (operator) {
                                case "+": result = num1 + num2; break;
                                case "-": result = num1 - num2; break;
                                case "*": result = num1 * num2; break;
                                case "/": result = num1 / num2; break;
                            }
                            display.setText("" + result);
                        } else if (input.equals("C")) {
                            display.setText("");
                        }
                    }
                });
            }

            frame.setVisible(true);
        }
    }

