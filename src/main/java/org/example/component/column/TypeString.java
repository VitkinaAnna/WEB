package org.example.component.column;

import org.example.component.Column;
public class TypeString extends Column {

    public TypeString(String name){
        super(name);
        this.type = TypeColumn.STRING.name();
    }
    @Override
    public boolean validate(String data) {
        return true;
    }
}
