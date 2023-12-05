
package org.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tableIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rowIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableIndex",
    "rowIndex"
})
@XmlRootElement(name = "DeleteRow")
public class DeleteRow {

    protected int tableIndex;
    protected int rowIndex;

    /**
     * Gets the value of the tableIndex property.
     * 
     */
    public int getTableIndex() {
        return tableIndex;
    }

    /**
     * Sets the value of the tableIndex property.
     * 
     */
    public void setTableIndex(int value) {
        this.tableIndex = value;
    }

    /**
     * Gets the value of the rowIndex property.
     * 
     */
    public int getRowIndex() {
        return rowIndex;
    }

    /**
     * Sets the value of the rowIndex property.
     * 
     */
    public void setRowIndex(int value) {
        this.rowIndex = value;
    }

}
