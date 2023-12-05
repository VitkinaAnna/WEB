
package org.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeColumn"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="REAL"/&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="STRINGINVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeColumn")
@XmlEnum
public enum TypeColumn {

    INT,
    CHAR,
    REAL,
    STRING,
    HTML,
    STRINGINVL;

    public String value() {
        return name();
    }

    public static TypeColumn fromValue(String v) {
        return valueOf(v);
    }

}
