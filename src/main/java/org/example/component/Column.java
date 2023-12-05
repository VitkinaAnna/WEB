package org.example.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.parser.ColumnDeserializer;

import java.io.Serializable;

@JsonDeserialize(using = ColumnDeserializer.class)
public abstract class Column  implements Serializable {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Type")
    public String type;

    public Column() {
    }

    public Column(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean validate(String data);
}
