
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
 *         &lt;element name="CreateTableResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "createTableResult"
})
@XmlRootElement(name = "CreateTableResponse")
public class CreateTableResponse {

    @XmlElement(name = "CreateTableResult")
    protected boolean createTableResult;

    /**
     * Gets the value of the createTableResult property.
     * 
     */
    public boolean isCreateTableResult() {
        return createTableResult;
    }

    /**
     * Sets the value of the createTableResult property.
     * 
     */
    public void setCreateTableResult(boolean value) {
        this.createTableResult = value;
    }

}
