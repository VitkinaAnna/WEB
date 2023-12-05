package org.example.component.column;


import org.example.component.Column;

import java.util.StringTokenizer;

public class TypeStringInvl extends Column {

    public TypeStringInvl(String name) {
        super(name);
        this.type = TypeColumn.STRINGINVL.name();
    }

    @Override
    public boolean validate(String value) {
        // Split the string into two parts using the " - " delimiter
        StringTokenizer st = new StringTokenizer(value, " - ");

        if (st.countTokens() != 2) {
            return false; // Incorrect format (must have the " - " delimiter)
        }

        String value1 = st.nextToken().trim();
        String value2 = st.nextToken().trim();

        // Check if value1 is less than value2
        return value1.compareTo(value2) < 0;
    }
}