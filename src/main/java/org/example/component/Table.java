package org.example.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.component.column.*;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public String name;
    public List<Row> rows = new ArrayList<>();
    public List<Column> columns = new ArrayList<>();

    public Table(String name){
        this.name = name;
    }

    @JsonCreator
    public Table(@JsonProperty("name") String name,
                 @JsonProperty("rows") List<Row> rows,
                 @JsonProperty("columns") List<Column> columns) {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
    }
//    public Table(Table table) {
//        this.name = table.name;
//        for (Row row : table.rows) {
//            Row newRow = new Row();
//            for (String data : row.values) {
//                newRow.values.add(data);
//            }
//            this.rows.add(newRow);
//        }
//        for (Column column : table.columns) {
//            switch (TypeColumn.valueOf(column.type)) {
//                case INT -> {
//                    Column columnInt = new TypeInteger(column.name);
//                    this.columns.add(columnInt);
//                }
//                case REAL -> {
//                    Column columnReal = new TypeReal(column.name);
//                    this.columns.add(columnReal);
//                }
//                case STRING -> {
//                    Column columnStr = new TypeString(column.name);
//                    this.columns.add(columnStr);
//                }
//                case CHAR -> {
//                    Column columnChar = new TypeChar(column.name);
//                    this.columns.add(columnChar);
//                }
//                case HTML -> {
//                    Column typeHTML = new TypeHTML(column.name);
//                    this.columns.add(typeHTML);
//                }
//                case STRINGINVL -> {
//                    Column typeStringInvl = new TypeStringInvl(column.name);
//                    this.columns.add(typeStringInvl);
//                }
//            }
//        }
//    }
    public void addRow(Row row) {
        rows.add(row);
    }

    public void deleteRow(int rowIndex) {
        rows.remove(rowIndex);
    }

    public void deleteColumn(int columnIndex) {
        columns.remove(columnIndex);
        for (Row row: rows) {
            row.values.remove(columnIndex);
        }
    }

    public void addColumn(Column column) {
        columns.add(column);
    }

    public void setName(String name) {
        this.name = name;
    }
}
