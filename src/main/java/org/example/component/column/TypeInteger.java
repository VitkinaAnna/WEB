package org.example.component.column;

import org.example.component.Column;
public class TypeInteger extends Column {

    public TypeInteger(String name){
        super(name);
        this.type = TypeColumn.INT.name();
    }

    @Override
    public boolean validate(String data) {
        if (data == null || data.isEmpty()){
            return true;
        }
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
