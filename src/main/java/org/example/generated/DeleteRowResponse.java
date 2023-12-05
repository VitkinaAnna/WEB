
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
 *         &lt;element name="DeleteRowResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "deleteRowResult"
})
@XmlRootElement(name = "DeleteRowResponse")
public class DeleteRowResponse {

    @XmlElement(name = "DeleteRowResult")
    protected boolean deleteRowResult;

    /**
     * Gets the value of the deleteRowResult property.
     * 
     */
    public boolean isDeleteRowResult() {
        return deleteRowResult;
    }

    /**
     * Sets the value of the deleteRowResult property.
     * 
     */
    public void setDeleteRowResult(boolean value) {
        this.deleteRowResult = value;
    }

}
