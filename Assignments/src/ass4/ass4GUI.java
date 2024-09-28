package ass4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ass4GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Programming Language Selector");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Select a programming language:");
        label.setBounds(50, 20, 200, 30);
        frame.add(label);

        String[] languages = {"Java", "Python", "C++", "JavaScript", "Ruby"};
        JComboBox<String> languageComboBox = new JComboBox<>(languages);
        languageComboBox.setBounds(50, 60, 150, 30);
        frame.add(languageComboBox);

        JButton showButton = new JButton("Show");
        showButton.setBounds(50, 100, 100, 30);
        frame.add(showButton);

        JLabel selectedLabel = new JLabel("");
        selectedLabel.setBounds(50, 140, 200, 30);
        frame.add(selectedLabel);

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = (String) languageComboBox.getSelectedItem();
                selectedLabel.setText("Selected: " + selectedLanguage);
            }
        });

        frame.setVisible(true);
    }
}


