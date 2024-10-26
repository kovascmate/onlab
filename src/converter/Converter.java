package converter;

import TypeSystem.TypeSystem;
import symboltable.ClassSymbol;
import symboltable.InterfaceSymbol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {
    public Converter() {
    }

    public static String readDotFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return new String(Files.readAllBytes(path));
    }

    public static Map<String, List<String>> parseDotFile(String dotContent) {
        Map<String, List<String>> typeSystemMap = new HashMap<>();
        Pattern pattern = Pattern.compile("(\\w+)\\s*\\[.*label\\s*=\\s*\"\\{(\\w+)\\|.*\\}\\\".*\\]");
        Matcher matcher = pattern.matcher(dotContent);

        while (matcher.find()) {
            String typeName = matcher.group(1);
            String typeCategory = matcher.group(2);
            typeSystemMap.put(typeName, Arrays.asList(typeCategory));
        }

        return typeSystemMap;
    }

    public static TypeSystem convertDotToTypeSystem(String dotContent) {
        TypeSystem typeSystem = TypeSystem.getInstance();
        Map<String, List<String>> typeSystemMap = parseDotFile(dotContent);

        for (Map.Entry<String, List<String>> entry : typeSystemMap.entrySet()) {
            String typeName = entry.getKey();
            String typeCategory = entry.getValue().get(0);

            if (typeCategory.equals("Class")) {
                typeSystem.add(typeName, new ClassSymbol(typeName));
            } else if (typeCategory.equals("Interface")) {
                typeSystem.add(typeName, new InterfaceSymbol(typeName));
            }
        }

        return typeSystem;
    }
}