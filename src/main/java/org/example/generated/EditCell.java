
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
 *         &lt;element name="columnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "rowIndex",
    "columnIndex",
    "value"
})
@XmlRootElement(name = "EditCell")
public class EditCell {

    protected int tableIndex;
    protected int rowIndex;
    protected int columnIndex;
    protected String value;

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

    /**
     * Gets the value of the columnIndex property.
     * 
     */
    public int getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     */
    public void setColumnIndex(int value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
