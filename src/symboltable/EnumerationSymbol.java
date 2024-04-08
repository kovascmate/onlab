package symboltable;

import java.util.List;

public class EnumerationSymbol {
    private final String enumerationName;
    private final List<String> enumConstants;

    public EnumerationSymbol(String enumerationName, List<String> enumConstants) {
        this.enumerationName = enumerationName;
        this.enumConstants = enumConstants;
    }

    public String getEnumerationName() {
        return enumerationName;
    }

    public List<String> getEnumConstants() {
        return enumConstants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enumeration: ").append(enumerationName).append(" {");
        for (int i = 0; i < enumConstants.size(); i++) {
            sb.append(enumConstants.get(i));
            if (i < enumConstants.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

