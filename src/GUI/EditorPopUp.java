package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import symboltable.Symbol;
import symboltable.VariableSymbol;
import symboltable.FunctionSymbol;

public class EditorPopUp {

    private static EditorPopUp instance;
    private JFrame frame;
    private JTextField visibilityField;
    private JTextField typeField;
    private JTextField nameField;
    private JButton cancelButton;
    private JButton saveButton;
    private JLabel visibilityLabel;
    private JLabel typeLabel;
    private JLabel nameLabel;
    private Symbol symbol;

    private EditorPopUp(Symbol _symbol) {
        symbol = _symbol;
        initializeFrame();
        initializeComponents(symbol);
        addComponentsToFrame();
        frame.setVisible(true);
    }

    public static synchronized EditorPopUp getInstance(Symbol _symbol) {
        if (instance == null) {
            instance = new EditorPopUp(_symbol);
        } else {
            instance.frame.toFront();
            instance.frame.requestFocus();
        }
        return instance;
    }

    private void initializeFrame() {
        frame = new JFrame("Editor Pop-Up");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);  // Center the frame on the screen

        // Add a window listener to reset the instance when the frame is closed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                instance = null;
            }
        });
    }

    private void initializeComponents(Symbol symbol) {
        visibilityLabel = new JLabel("Visibility:");
        typeLabel = new JLabel("Type:");
        nameLabel = new JLabel("Name:");

        visibilityField = new JTextField();
        typeField = new JTextField();
        nameField = new JTextField();

        if (symbol instanceof VariableSymbol) {
            VariableSymbol variableSymbol = (VariableSymbol) symbol;
            visibilityField.setText(variableSymbol.getVisibility());
            typeField.setText(variableSymbol.getType());
            nameField.setText(variableSymbol.getName());
        } else if (symbol instanceof FunctionSymbol) {
            FunctionSymbol functionSymbol = (FunctionSymbol) symbol;
            visibilityField.setText(functionSymbol.getVisibility());
            typeField.setText(functionSymbol.getReturnType());
            nameField.setText(functionSymbol.getName());
        }

        cancelButton = new JButton("Cancel");
        saveButton = new JButton("Save");

        // Add action listener to CancelButton
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    private void addComponentsToFrame() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add visibility label and text field
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(visibilityLabel, gbc);

        gbc.gridx = 1;
        frame.add(visibilityField, gbc);

        // Add type label and text field
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(typeLabel, gbc);

        gbc.gridx = 1;
        frame.add(typeField, gbc);

        // Add name label and text field
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(nameLabel, gbc);

        gbc.gridx = 1;
        frame.add(nameField, gbc);

        // Add buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(cancelButton);
        buttonPanel.add(saveButton);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(buttonPanel, gbc);
    }
}