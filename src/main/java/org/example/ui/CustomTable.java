package org.example.ui;


import org.example.component.Row;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CustomTable extends JTable {

    public CustomTable(DefaultTableModel tableModel) {
        super(tableModel);
        addPropertyChangeListener(evt -> {
            if ("tableCellEditor".equals(evt.getPropertyName())) {
                if (!isEditing()){
                    processEditingStopped();
                }
            }
        });
    }

    public void processEditingStopped() {
        int editingRow = getEditingRow();
        int editingColumn = getEditingColumn();

        if (editingRow != -1 && editingColumn != -1) {
            Object newValue = getValueAt(editingRow, editingColumn);
            int selectedTab = DBMS.tabbedPane.getSelectedIndex();
            boolean result = DBMS.webServiceSoap.editCell(selectedTab, editingRow, editingColumn,(String) newValue);
            if(!result){
                List<Row> rows = DBMS.getRows(selectedTab);
                String data = rows.get(editingRow).getAt(editingColumn);
                if (data != null){
                    this.setValueAt(data, editingRow, editingColumn);
                }
                else {
                    this.setValueAt("", editingRow, editingColumn);
                }
            }
        }

    }
}