package org.example.component.column;


import org.example.component.Column;

public class TypeChar extends Column {

    public TypeChar(String name){
        super(name);
        this.type = TypeColumn.CHAR.name();
    }

    @Override
    public boolean validate(String data){
        return data.length() == 1 || data.length() == 0;
    }
}
