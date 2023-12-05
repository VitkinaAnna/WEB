package org.example.component;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TableData implements Serializable {
  @JsonProperty("Name")
  public String name;
  @JsonProperty("Id")
  public int id;

  public TableData(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public TableData() {
  }
}
