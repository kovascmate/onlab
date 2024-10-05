package GUI;

import TypeSystem.TypeSystem;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;
import org.w3c.dom.svg.SVGDocument;
import symboltable.ClassSymbol;
import symboltable.Symbol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

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

    public MainGUI(TypeSystem _typesystem) {
        this.typeSystem = _typesystem;
        initializeFrame();
        initializeComponents();
        addComponentsToFrame();
        frame.setVisible(true);
    }

    private void initializeFrame() {
        frame = new JFrame("Class Diagram Visualizer");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(attributeList), new JScrollPane(functionList));
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
            comboBox.addItem(name);
        }

        // Update the classPanel for the currently selected class or interface
        if (comboBox.getItemCount() > 0) {
            updateClassPanel(comboBox.getItemAt(0));
            //updateClassPanel((String) comboBox.getSelectedItem());
        }

    }

    public void updateClassPanel(String className) {
        // Get the selected class or interface
        Symbol selectedSymbol = typeSystem.get(className);

        // Clear the attributeList and functionList
        attributeList.setListData(new String[0]);
        functionList.setListData(new String[0]);

        if (selectedSymbol instanceof ClassSymbol) {
            ClassSymbol classSymbol = (ClassSymbol) selectedSymbol;

            // Add the attributes and methods of the selected class to the attributeList and functionList
            attributeList.setListData(classSymbol.getVariableSymbols().stream().map(Symbol::toString).toArray(String[]::new));
            functionList.setListData(classSymbol.getFunctionsSymbols().stream().map(Symbol::toString).toArray(String[]::new));
        }

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