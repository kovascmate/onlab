package exceptition;

public class ClassDiagramException extends  Exception {
    public int line;
    public int column;
    public String message;

    public ClassDiagramException(int _line, int  _column, String _message){
        line = _line;
        column = _column;
        message = _message;
    }

    @Override
    public String toString(){
        return  String.format("line: "+ line + ", column: "+ column +": "+message);
    }
}
