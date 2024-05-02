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
    public List<ClassSymbol> getClasses(){
        List<ClassSymbol> ret = new ArrayList<>();
        for(String key : hashMap.keySet()){
            Symbol sym = hashMap.get(key);
            if(sym instanceof ClassSymbol){
                ret.add((ClassSymbol) sym);
            }
        }
        return  ret;
    }
    public List<InterfaceSymbol> getInterfaces(){
        List<InterfaceSymbol> ret = new ArrayList<>();
        for(String key : hashMap.keySet()){
            Symbol sym = hashMap.get(key);
            if(sym instanceof InterfaceSymbol){
                ret.add((InterfaceSymbol) sym);
            }
        }
        return  ret;
    }
    public Symbol get(String _key){
        return hashMap.get(_key);
    }
    public HashMap getHashMap(){
        return  hashMap;
    }

}
