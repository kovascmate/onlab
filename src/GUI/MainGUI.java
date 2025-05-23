package GUI;

import TypeSystem.TypeSystem;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;
import org.w3c.dom.svg.SVGDocument;
import symboltable.ClassSymbol;
import symboltable.InterfaceSymbol;
import symboltable.Symbol;
import symboltable.VariableSymbol;
import symboltable.FunctionSymbol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.Visibility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;

import Main.Main;



public class MainGUI {
    private static final int DIVIDER_LOCATION = 2;
    private static final double RESIZE_WEIGHT = 0.67;

    private JFrame frame;
    private JPanel UMLPanel;
    private JPanel editorPanel;
    private JPanel classPanel;
    private JComboBox<String> comboBox;
    private JList<String> attributeList;
    private JList<String> functionList;
    private JLabel classNameLabel;
    private TypeSystem typeSystem;
    private EditorPopUp editorPopUp;
    private Symbol selectedSymbol = new ClassSymbol("");

    public MainGUI(TypeSystem _typesystem) {
        this.typeSystem = _typesystem;
        initializeFrame();
        initializeComponents();
        addComponentsToFrame();
        frame.setVisible(true);
    }
    public MainGUI() {
        this.typeSystem = null;
        initializeFrame();
        initializeComponents();
        addComponentsToFrame();
        frame.setVisible(true);
    }

    public void setTypesystem(TypeSystem _typesystem) {
        this.typeSystem = _typesystem;

    }

    private void initializeFrame() {
        frame = new JFrame("Class Diagram Visualizer");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame

        // Initialize the menu
        initializeMenu();
    }

    private void initializeComponents() {
        // Initialize the UMLPanel
        UMLPanel = new JPanel();
        UMLPanel.setLayout(new BorderLayout());

        // Initialize the comboBox
        comboBox = new JComboBox<>();
        comboBox.addItem("Class");
        comboBox.addItem("Interface");

        // Initialize the editorPanel
        editorPanel = new JPanel(new BorderLayout());
        editorPanel.setLayout(new BorderLayout());

        // Initialize the classNameLabel
        classNameLabel = new JLabel();

        // Initialize the attributeList
        attributeList = new JList<>();

        // Initialize the functionList
        functionList = new JList<>();

        // Initialize the classPanel
        classPanel = new JPanel();
        classPanel.setLayout(new BorderLayout());
        classPanel.add(classNameLabel, BorderLayout.NORTH);

        // Create labels for the lists
        JLabel attributeLabel = new JLabel("Variables");
        JLabel functionLabel = new JLabel("Functions");

        // Create buttons for adding new elements
        JButton addAttributeButton = new JButton("+");
        JButton addFunctionButton = new JButton("+");

        addAttributeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = attributeList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String selectedValue = attributeList.getModel().getElementAt(selectedIndex);
                    Symbol selectedSymbol = typeSystem.get(selectedValue);
                    if (selectedSymbol instanceof VariableSymbol) {
                        EditorPopUp editorPopUp = EditorPopUp.getInstance(selectedSymbol);
                    }
                }else{
                    EditorPopUp editorPopUp = EditorPopUp.getInstance(selectedSymbol,new VariableSymbol("","",""));
                }
            }
        });

        addFunctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = functionList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String selectedValue = functionList.getModel().getElementAt(selectedIndex);
                    Symbol selectedSymbol = typeSystem.get(selectedValue);
                    if (selectedSymbol instanceof FunctionSymbol) {
                        EditorPopUp editorPopUp = EditorPopUp.getInstance(selectedSymbol);
                    }
                }else{
                    EditorPopUp editorPopUp = EditorPopUp.getInstance(selectedSymbol,new FunctionSymbol("","",null,""));
                }
            }
        });

        // Create panels to hold the labels, lists, and buttons
        JPanel attributePanel = new JPanel(new BorderLayout());
        attributePanel.add(attributeLabel, BorderLayout.NORTH);
        attributePanel.add(new JScrollPane(attributeList), BorderLayout.CENTER);
        attributePanel.add(addAttributeButton, BorderLayout.SOUTH);

        JPanel functionPanel = new JPanel(new BorderLayout());
        functionPanel.add(functionLabel, BorderLayout.NORTH);
        functionPanel.add(new JScrollPane(functionList), BorderLayout.CENTER);
        functionPanel.add(addFunctionButton, BorderLayout.SOUTH);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, attributePanel, functionPanel);
        splitPane.setResizeWeight(0.5);  // Set the divider location to the middle

        classPanel.add(splitPane, BorderLayout.CENTER);
    }

    private void addComponentsToFrame() {
        editorPanel.add(comboBox, BorderLayout.NORTH);
        editorPanel.add(classNameLabel, BorderLayout.CENTER);
        editorPanel.add(classPanel, BorderLayout.CENTER);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, UMLPanel, editorPanel);
        splitPane.setDividerLocation(frame.getSize().width / DIVIDER_LOCATION);
        splitPane.setResizeWeight(RESIZE_WEIGHT);
        frame.add(splitPane, BorderLayout.CENTER);
    }

    public void refresh() {
        // Clear the comboBox
        comboBox.removeAllItems();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedClass = (String) e.getItem();
                    updateClassPanel(selectedClass);
                }
            }
        });
        HashMap<String, Symbol> hashMap = typeSystem.getHashMap();
        // Add all class and interface names to the comboBox
        for (String name : hashMap.keySet()) {
            if(hashMap.get(name) instanceof ClassSymbol || hashMap.get(name) instanceof InterfaceSymbol){
                comboBox.addItem(name);
            }
        }

        // Update the classPanel for the currently selected class or interface
        if (comboBox.getItemCount() > 0) {
            updateClassPanel(comboBox.getItemAt(0));
            //updateClassPanel((String) comboBox.getSelectedItem());
        }

    }

    private void initializeMenu() {
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu OpenMenu = new JMenu("Open");
        /*JMenu editMenu = new JMenu("Edit");*/
        /*JMenu helpMenu = new JMenu("Help");*/
        JMenu exportMenu = new JMenu("Export");

        // Add menu items to the menu
        JMenuItem svgItem = new JMenuItem("Svg");
        JMenuItem codeItem = new JMenuItem("Source Code");
        JMenuItem dotItem = new JMenuItem("Dot File");

        OpenMenu.add(svgItem);
        OpenMenu.addSeparator();
        OpenMenu.add(codeItem);
        OpenMenu.add(dotItem);

        /*JMenuItem exportTypeSystem = new JMenuItem("Export Type System");*/
        JMenuItem exportSourceCode = new JMenuItem("Export Source Code");
        /*exportTypeSystem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.dot2typeSystem();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        exportMenu.add(exportTypeSystem);*/

        exportSourceCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.typeSystem2code();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        exportMenu.add(exportSourceCode);


        svgItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.loadFromSVG();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        codeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.loadFromCode();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        dotItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.loadFromDot();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add menus to the menu bar
        menuBar.add(OpenMenu);
        /*menuBar.add(editMenu);*/
       /* menuBar.add(helpMenu);*/
        menuBar.add(exportMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);
    }

    public void updateClassPanel(String className) {
        // Get the selected class or interface
        Symbol selectedSymbol = typeSystem.get(className);
        this.selectedSymbol = selectedSymbol;

        // Clear the attributeList and functionList
        attributeList.setListData(new String[0]);
        functionList.setListData(new String[0]);
        if (selectedSymbol instanceof ClassSymbol) {
            ClassSymbol classSymbol = (ClassSymbol) selectedSymbol;

            // Add the attributes and methods of the selected class to the attributeList and functionList
            attributeList.setListData(classSymbol.getVariableSymbols().stream().map(Symbol::toString).toArray(String[]::new));
            functionList.setListData(classSymbol.getFunctionsSymbols().stream().map(Symbol::toString).toArray(String[]::new));
        }

        attributeList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int index = attributeList.locationToIndex(evt.getPoint());
                    if (index >= 0) {
                        if(typeSystem.get(comboBox.getSelectedItem().toString()) instanceof ClassSymbol){
                            var asd = (ClassSymbol) typeSystem.get(comboBox.getSelectedItem().toString());
                            EditorPopUp.getInstance(asd.getVariableSymbol(index));
                        }else if(typeSystem.get(comboBox.getSelectedItem().toString()) instanceof InterfaceSymbol){
                            var asd = (InterfaceSymbol) typeSystem.get(comboBox.getSelectedItem().toString());
                            EditorPopUp.getInstance(asd.getVariableSymbol(index));
                        }
                    }
                }
            }
        });

        functionList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int index = functionList.locationToIndex(evt.getPoint());
                    if (index >= 0) {
                        if(typeSystem.get(comboBox.getSelectedItem().toString()) instanceof ClassSymbol){
                            var asd = (ClassSymbol) typeSystem.get(comboBox.getSelectedItem().toString());
                            EditorPopUp.getInstance(asd.getFunctionSymbol(index));
                        }else if(typeSystem.get(comboBox.getSelectedItem().toString()) instanceof InterfaceSymbol){
                            var asd = (InterfaceSymbol) typeSystem.get(comboBox.getSelectedItem().toString());
                            EditorPopUp.getInstance(asd.getFunctionSymbol(index));
                        }
                    }
                }
            }
        });

        // Update the classNameLabel
        classNameLabel.setText(className);
    }

    public void loadSVGDocument(String path) {
        try {
            // Create a new SVG document
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
            String uri = new File(path).toURI().toString();
            Document document = factory.createDocument(uri);

            // Create a new JSVGCanvas and add the SVG document to it
            JSVGCanvas svgCanvas = new JSVGCanvas();
            svgCanvas.setSVGDocument((SVGDocument) document);

            // Add the JSVGCanvas to the UMLPanel
            UMLPanel.removeAll();
            UMLPanel.add(svgCanvas, BorderLayout.CENTER);
            UMLPanel.revalidate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}