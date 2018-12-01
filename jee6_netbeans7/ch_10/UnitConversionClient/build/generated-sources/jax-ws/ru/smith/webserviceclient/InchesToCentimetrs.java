
package ru.smith.webserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inchesToCentimetrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inchesToCentimetrs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inches" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inchesToCentimetrs", propOrder = {
    "inches"
})
public class InchesToCentimetrs {

    protected double inches;

    /**
     * Gets the value of the inches property.
     * 
     */
    public double getInches() {
        return inches;
    }

    /**
     * Sets the value of the inches property.
     * 
     */
    public void setInches(double value) {
        this.inches = value;
    }

}
