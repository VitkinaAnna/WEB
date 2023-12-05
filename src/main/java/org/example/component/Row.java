package org.example.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Row implements Serializable {
    @JsonProperty("Values")
    public List<String> values = new ArrayList<>();

    public Row() {
    }

    @JsonCreator
    public Row(@JsonProperty("Values") List<String> values) {
        this.values = values;
    }

    public String getAt(int index){
        return values.get(index);
    }

    public void setAt(int index, String content){
        values.set(index,content);
    }
}
