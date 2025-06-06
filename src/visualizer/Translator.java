package visualizer;

import symboltable.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Translator {
    private  static Translator instance = null;
    public List<VizObject> objects;

    String input = "";
    private Translator() throws IOException {
        objects = new ArrayList<>();
        File myObj = new File("graph_viz.dot");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());

        } else {
            System.out.println("File already exists.");
        }
        FileWriter myWriter = new FileWriter("graph_viz.dot");
        myWriter.write(input);
        myWriter.close();
    }
    public static synchronized Translator getInstance() throws IOException {
        if(instance == null){
            instance = new Translator();
        }
        return instance;
    }
    public void fillString() throws IOException {
        input = input.concat("digraph ClassDiagram { node [ shape = \"record\"] edge [ arrowhead = \"empty\"]");
        for(VizObject vizObject : objects){
            input = input.concat(vizObject.getVizString());
        }
        input = input.concat("\n}");
        writeFile();
    }
    public void writeFile() throws IOException {
        File myObj = new File("graph_viz.dot");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());

        } else {
            System.out.println("File already exists.");
        }
        FileWriter myWriter = new FileWriter("graph_viz.dot");
        myWriter.write(input);
        myWriter.close();
    }
    public void fillVizObjects(HashMap<String,Symbol> hashMap){
        HashMap<VizObject,Symbol> list = new HashMap<>();
        HashMap<String,VizObject> keyList = new HashMap<>();
        for(Symbol sym : hashMap.values()){
            if(sym instanceof ClassSymbol){
                List<VizVariable> vizVarList = new ArrayList<>();
                List<VizFunction> vizFunList = new ArrayList<>();

                if(((ClassSymbol) sym).getVariableSymbols() != null) {
                    for (VariableSymbol varSym : ((ClassSymbol) sym).getVariableSymbols()) {
                        vizVarList.add(new VizVariable(varSym.getVisibilityIcon(), varSym.getType(), varSym.getName()));
                    }
                }
                if(((ClassSymbol) sym).getFunctionsSymbols() != null) {
                    for (FunctionSymbol funSym : ((ClassSymbol) sym).getFunctionsSymbols()) {
                        List<VizVariable> parameters = new ArrayList<>();
                        for (VariableSymbol varSym : funSym.getParameters()) {
                            parameters.add(new VizVariable(varSym.getVisibilityIcon(), varSym.getType(), varSym.getName()));
                        }
                        vizFunList.add(new VizFunction(funSym.getVisibilityIcon(), funSym.getReturnType(), funSym.getName(), parameters));
                    }

                }

                VizClass vizClass = new VizClass(sym.getName(), vizVarList, vizFunList);
                objects.add(vizClass);
                list.put(vizClass,sym);
                keyList.put(sym.getName(),vizClass);
                
            } else if (sym instanceof InterfaceSymbol) {
                List<VizVariable> vizVarList = new ArrayList<>();
                List<VizFunction> vizFunList = new ArrayList<>();
                if(((InterfaceSymbol) sym).getVariableSymbols() != null) {
                    for (VariableSymbol varSym : ((InterfaceSymbol) sym).getVariableSymbols()) {
                        vizVarList.add(new VizVariable(varSym.getVisibilityIcon(), varSym.getType(), varSym.getName()));
                    }
                }
                if(((InterfaceSymbol) sym).getFunctionsSymbols() != null) {
                    for (FunctionSymbol funSym : ((InterfaceSymbol) sym).getFunctionsSymbols()) {
                        List<VizVariable> parameters = new ArrayList<>();
                        for (VariableSymbol varSym : funSym.getParameters()) {
                            parameters.add(new VizVariable(varSym.getVisibilityIcon(), varSym.getType(), varSym.getName()));
                        }
                        vizFunList.add(new VizFunction(funSym.getVisibilityIcon(), funSym.getReturnType(), funSym.getName(), parameters));
                    }
                }
                VizInterface vizInterface = new VizInterface(sym.getName(), vizVarList,vizFunList);
                objects.add(vizInterface);
                list.put(vizInterface,sym);
                keyList.put(sym.getName(),vizInterface);
            } else if (sym instanceof EnumerationSymbol){
                VizEnum vizEnum = new VizEnum(sym.getName(),((EnumerationSymbol) sym).getEnumConstants());
                objects.add(vizEnum);
                list.put(vizEnum,sym);
                keyList.put(sym.getName(),vizEnum);
            }
        }
        List<VizObject> connectionObject;
        for(Symbol sym : list.values()){
            if(sym instanceof ClassSymbol){
                if(((ClassSymbol) sym).getParantClass() != null){
                    connectionObject = new ArrayList<>();

                    connectionObject.add(keyList.get(sym.getName()));
                    String symString = ((ClassSymbol) sym).getParantClass();
                    connectionObject.add(keyList.get(symString));

                    objects.add(new VizConnection(connectionObject,"inheritance","",""));
                }
                if (((ClassSymbol) sym).getInterface() != null) {
                    connectionObject = new ArrayList<>();

                    connectionObject.add(keyList.get(sym.getName()));
                    String symString = ((ClassSymbol) sym).getInterface();
                    connectionObject.add(keyList.get(symString));

                    objects.add(new VizConnection(connectionObject,"implementation","",""));
                }
                if(((ClassSymbol) sym).getConnectionsSymbols() != null ){
                    String conType, conMu; ;
                    for(ConnectionSymbol consym : ((ClassSymbol) sym).getConnectionsSymbols()){
                        connectionObject = new ArrayList<>();

                        connectionObject.add(keyList.get(sym.getName()));
                        String symString = (consym.getClassName());
                        connectionObject.add(keyList.get(symString));
                        String connectionName = consym.getConnectionName();
                        conType = consym.getConnectionType();
                        conMu = consym.getSourceMultiplicity();
                        objects.add(new VizConnection(connectionObject,conType,connectionName,conMu));
                    }
                }
            }
        }
    }

    public class VizConnection extends  VizObject{
        public List<VizObject> objects;
        public String connectionName;
        public String connectionType;
        public String multiplicity;
        public  VizConnection(List<VizObject> _objects,String _connectionType, String _connectionName, String _multiplicity){
            connectionName = _connectionName;
            objects = _objects;
            connectionType = _connectionType;
            multiplicity = _multiplicity;
        }
        public String getConnectionName(){
            return connectionName;
        }
        @Override
        public String getVizString(){
            String ret = "";
            if(connectionType == "inheritance"){
                ret = ret.concat("\nedge [\n" +"\tarrowhead = \"empty\"\n\t]\n");
                ret = ret.concat(objects.get(0).getName()+"->"+objects.get(1).getName());
                ret = ret.concat("[xlabel=\" \"]");
            } else if (connectionType == "implementation") {
                ret = ret.concat("\nedge [\n" +"\tarrowhead = \"empty\"" +" style=dashed\n\t]\n");
                ret = ret.concat(objects.get(0).getName()+"->"+objects.get(1).getName());
                ret = ret.concat("[xlabel=\" \"]");
            }else if (connectionType == "aggregation"){
                ret = ret.concat("\nedge [\n" +"\tarrowhead = \"odiamond\"" +" style = filled\n\t]\n");
                ret = ret.concat(objects.get(1).getName()+"->"+objects.get(0).getName());
                ret = ret.concat("[xlabel=\""+connectionName+"\"]");
                ret = ret.concat("[taillabel=\""+multiplicity+"\"]");
            } else if (connectionType == "composition") {
                ret = ret.concat("\nedge [\n" +"\tarrowhead = \"diamond\"" +"  style = filled\n\t]\n");
                ret = ret.concat(objects.get(1).getName()+"->"+objects.get(0).getName());
                ret = ret.concat("[xlabel=\""+connectionName+"\"]");
                ret = ret.concat("[taillabel=\""+multiplicity+"\"]");
            }else if (connectionType == "association") {
                ret = ret.concat("\nedge [\n" +"\tarrowhead = \"curve\"" +"  style = filled\n\t]\n");
                ret = ret.concat(objects.get(1).getName()+"->"+objects.get(0).getName());
                ret = ret.concat("[xlabel=\""+connectionName+"\"]");
                ret = ret.concat("[taillabel=\""+multiplicity+"\"]");

            }
            return ret;
        }
        @Override
        public String getName() {
            return null;
        }
    }
    public class VizEnum extends VizObject{
        private String name;
        private List<String> enumerations;
        public  VizEnum(String _name,List<String> _enumerations){
            name = _name;
            enumerations = _enumerations;
        }
        @Override
        public String getVizString(){
            return "";
        }
        @Override
        public String getName() {
            return name;
        }

    }
    public class VizInterface extends VizObject{
        private String name;
        private List<VizVariable> vizVariables;
        private List<VizFunction> vizFunctions;
        public VizInterface(String _name,List<VizVariable> _vizVariables, List<VizFunction> _vizFunctions){
            name = _name;
            vizVariables = _vizVariables;
            vizFunctions = _vizFunctions;
        }
        @Override
        public String getVizString(){
            String variableString = "";
            for (VizVariable vizVariable : vizVariables){
                variableString = variableString.concat(vizVariable.getVizString());
            }
            String functionString = "|";
            for(VizFunction vizFunction:  vizFunctions){
                functionString = functionString.concat(vizFunction.getVizString());
            }
            String interfaceString ="\n"+ name + "[ "
                    +"label = \"{"+"«"+name+"»"+"|";
            interfaceString = interfaceString.concat(variableString);
            interfaceString = interfaceString.concat(functionString);
            interfaceString = interfaceString.concat(" }\"]");
            return interfaceString;
        }
        @Override
        public String getName() {
            return name;
        }
    }
    public class VizClass extends VizObject{
        private String name;
        private List<VizVariable> vizVariables;
        private List<VizFunction> vizFunctions;
        public VizClass(String _name,List<VizVariable> _vizVariables, List<VizFunction> _vizFunctions){
            name = _name;
            vizVariables = _vizVariables;
            vizFunctions = _vizFunctions;
        }
        @Override
        public String getVizString(){
            String variableString = "";
            for (VizVariable vizVariable : vizVariables){
                variableString = variableString.concat(vizVariable.getVizString());
            }
            String functionString = "|";
            for(VizFunction vizFunction:  vizFunctions){
                functionString = functionString.concat(vizFunction.getVizString());
            }
            String classString = "\n"+name + " [ "
                                    +"label = \"{"+name+"|";
            classString = classString.concat(variableString);
            classString = classString.concat(functionString);
            classString = classString.concat(" }\"]");
            return classString;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    public class VizVariable{
        private String visibility;
        private String type;
        private String name;
        public VizVariable(String _visibility,String _type,String _name){
            visibility = _visibility;
            type = _type;
            name = _name;
        }
        public String getVizString(){
            String ret = visibility+" "+name+" : "+type+"\\n";
            return ret;
        }
    }
    public class VizFunction{
        private String visibility;
        private String returnType;
        private String name;
        private List<VizVariable> parameters;
        public VizFunction(String _visibility,String _returnType,String _name,List<VizVariable> _parameters){
            visibility = _visibility;
            returnType = _returnType;
            name = _name;
            parameters = _parameters;
        }
        public String getVizString(){
            String ret = visibility+" "+name+"() :"+returnType+"\\n";
            return  ret;
        }

    }
    public abstract class VizObject{
        public String toVizString(){
            return null;
        }

        public abstract String getVizString();
        public abstract String getName();

        public String getConnectionName() {return null;}
    }
}
