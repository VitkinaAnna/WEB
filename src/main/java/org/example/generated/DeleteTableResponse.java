
package org.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DeleteTableResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "deleteTableResult"
})
@XmlRootElement(name = "DeleteTableResponse")
public class DeleteTableResponse {

    @XmlElement(name = "DeleteTableResult")
    protected boolean deleteTableResult;

    /**
     * Gets the value of the deleteTableResult property.
     * 
     */
    public boolean isDeleteTableResult() {
        return deleteTableResult;
    }

    /**
     * Sets the value of the deleteTableResult property.
     * 
     */
    public void setDeleteTableResult(boolean value) {
        this.deleteTableResult = value;
    }

}
