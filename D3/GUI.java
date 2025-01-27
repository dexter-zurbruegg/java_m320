package D3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("User Input");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);

            panel.setBackground(new Color(240, 240, 240));

            JLabel nameLabel = new JLabel("Enter Name:");
            nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
            JTextField nameField = new JTextField(20);
            nameField.setFont(new Font("Arial", Font.PLAIN, 14));

            JLabel resultLabel = new JLabel("Result:");
            resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
            JTextArea resultArea = new JTextArea(5, 20);
            resultArea.setEditable(false);
            resultArea.setFont(new Font("Arial", Font.PLAIN, 14));
            resultArea.setLineWrap(true);
            resultArea.setWrapStyleWord(true);
            resultArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            JButton submitButton = new JButton("Submit");
            submitButton.setFont(new Font("Arial", Font.BOLD, 14));
            submitButton.setBackground(new Color(100, 149, 237));
            submitButton.setForeground(Color.WHITE);
            submitButton.setFocusPainted(false);

            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(nameLabel, gbc);

            gbc.gridx = 1;
            panel.add(nameField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(submitButton, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(resultLabel, gbc);

            gbc.gridx = 1;
            panel.add(new JScrollPane(resultArea), gbc);

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String name = nameField.getText();
                        validateInput(name);
                        String result = ApiService.fetchData(name); // this is where we're delegating the API call process to the class ApiService
                        resultArea.setText(result);
                    } catch (InvalidInputException ex) {
                        resultArea.setText(ex.getMessage());
                    }
                }
            });

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void validateInput(String input) throws InvalidInputException { // we're delegating here process of handling the input via InvalidInputException
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("Error: Name cannot be empty!");
        }

        if (!input.matches("^[a-zA-Z ]+$")) {
            throw new InvalidInputException("Error: Name must only contain letters and spaces!");
        }
    }
}