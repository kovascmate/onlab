package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import symboltable.*;

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
    private Symbol symbol2;

    private EditorPopUp(Symbol _symbol) {
        symbol = _symbol;
        initializeFrame();
        initializeComponents(symbol);
        addComponentsToFrame();
        frame.setVisible(true);
    }
    private EditorPopUp(Symbol _symbol1,Symbol _symbol2) {
        symbol = _symbol1;
        symbol2 = _symbol2;
        initializeFrame();
        initializeComponents(_symbol1,_symbol2);
        addComponentsToFrame();
        frame.setVisible(true);
    }

    public static synchronized EditorPopUp getInstance(Symbol _symbol) {
        if (instance == null) {
            instance = new EditorPopUp(_symbol);
        } else {
//            instance = null;
//            instance = new EditorPopUp(_symbol);
            instance.frame.toFront();
            instance.frame.requestFocus();
        }
        return instance;
    }
    public static synchronized EditorPopUp getInstance(Symbol _symbol1,Symbol _symbol2) {
        if (instance == null) {
            instance = new EditorPopUp(_symbol1,_symbol2);
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


        if (symbol instanceof VariableSymbol variableSymbol) {
            visibilityField = new JTextField(variableSymbol.getVisibility());
            typeField = new JTextField(variableSymbol.getType());
            nameField = new JTextField(variableSymbol.getName());
        } else if (symbol instanceof FunctionSymbol functionSymbol) {
            visibilityField = new JTextField(functionSymbol.getVisibility());
            typeField = new JTextField(functionSymbol.getReturnType());
            nameField = new JTextField(functionSymbol.getName());
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
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (symbol instanceof VariableSymbol variableSymbol) {
                    variableSymbol.setVisibility(visibilityField.getText());
                    variableSymbol.setType(typeField.getText());
                    variableSymbol.setName(nameField.getText());
                } else if (symbol instanceof FunctionSymbol functionSymbol) {
                    functionSymbol.setVisibility(visibilityField.getText());
                    functionSymbol.setReturnType(typeField.getText());
                    functionSymbol.setName(nameField.getText());
                }

                frame.dispose();
            }
        });
    }
    private void initializeComponents(Symbol symbol1,Symbol symbol2) {

        System.out.println("initializeComponents");
        visibilityLabel = new JLabel("Visibility:");
        typeLabel = new JLabel("Type:");
        nameLabel = new JLabel("Name:");


        if (symbol2 instanceof VariableSymbol) {
            visibilityField = new JTextField("");
            typeField = new JTextField("");
            nameField = new JTextField("");
        } else if (symbol2 instanceof FunctionSymbol) {
            visibilityField = new JTextField("");
            typeField = new JTextField("");
            nameField = new JTextField("");
        }

        cancelButton = new JButton("Cancel");
        saveButton = new JButton("Save");

        System.out.println("initializeComponents2");
        // Add action listener to CancelButton
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (symbol2 instanceof VariableSymbol variableSymbol) {
                    variableSymbol.setVisibility(visibilityField.getText());
                    variableSymbol.setType(typeField.getText());
                    variableSymbol.setName(nameField.getText());
                    if(symbol1 instanceof ClassSymbol classSymbol){
                        classSymbol.addVariable(variableSymbol);
                    }
                    else if (symbol1 instanceof InterfaceSymbol interfaceSymbol){
                        interfaceSymbol.addVariable(variableSymbol);
                    }
                } else if (symbol2 instanceof FunctionSymbol functionSymbol) {
                    functionSymbol.setVisibility(visibilityField.getText());
                    functionSymbol.setReturnType(typeField.getText());
                    functionSymbol.setName(nameField.getText());
                    if(symbol1 instanceof ClassSymbol classSymbol){
                        classSymbol.addFunction(functionSymbol);
                    }
                    else if (symbol1 instanceof InterfaceSymbol interfaceSymbol){
                        interfaceSymbol.addFunction(functionSymbol);
                    }
                }

                frame.dispose();
            }
        });
    }

    private void addComponentsToFrame() {
        System.out.println("addComponentsToFrame");
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
        System.out.println("addComponentsToFrame end");
    }
}