package exceptition;

import javax.swing.JOptionPane;

public class ClassDiagramException extends Exception {
    public int line;
    public int column;
    public String message;

    public ClassDiagramException(int _line, int _column, String _message) {
        line = _line;
        column = _column;
        message = _message;
    }

    @Override
    public String toString() {
        return String.format(message);
    }

    public void showErrorDialog() {
        JOptionPane.showMessageDialog(null, toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}