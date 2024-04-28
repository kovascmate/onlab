package TypeSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import symboltable.*;
public class TypeSystem {
    private HashMap<String, Symbol> hashMap;

    public TypeSystem(){
        hashMap = new HashMap<>();
    }

    public boolean containsKey(String _key){
        return hashMap.containsKey(_key);
    }
    public void add(String _name, Symbol _symbol){
        hashMap.put(_name,_symbol);
    }
    public List<Symbol> getClasses(){
        List<Symbol> ret = new ArrayList<>();
        for(Symbol sym : hashMap.values()){
            if(sym.getSymbolType() == SymbolType.CLASSSYMBOL){
                ret.add(sym);
            }
        }
        return  ret;
    }
}
