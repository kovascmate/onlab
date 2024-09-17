package GUI;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainGUI {
    public JFrame frame;
    public JPanel UMLPanel;
    public JPanel editorPanel;
    private JSVGCanvas svgCanvas;

    public MainGUI() {
        frame = new JFrame("Class Diagram Visualizer");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        svgCanvas = new JSVGCanvas();
        svgCanvas.setSize((screenSize.width* 2/3),screenSize.height );
        svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter() {
            public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
                frame.pack();
            }
        });

        UMLPanel = new JPanel(new BorderLayout());
        UMLPanel.add(svgCanvas, BorderLayout.CENTER);
        UMLPanel.setPreferredSize(new Dimension(screenSize.width * 2 / 3, screenSize.height));

        editorPanel = new JPanel();
        editorPanel.setPreferredSize(new Dimension(screenSize.width / 3, screenSize.height));

        frame.add(UMLPanel, BorderLayout.WEST);
        frame.add(editorPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }

    public void loadSVGDocument(String uri) {
        svgCanvas.setURI(new File(uri).toURI().toString());
    }
}