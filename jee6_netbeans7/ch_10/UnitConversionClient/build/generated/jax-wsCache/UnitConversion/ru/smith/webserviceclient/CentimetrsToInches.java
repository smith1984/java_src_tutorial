
package ru.smith.webserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentimetrsToInches complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentimetrsToInches">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centimetrs" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentimetrsToInches", propOrder = {
    "centimetrs"
})
public class CentimetrsToInches {

    protected double centimetrs;

    /**
     * Gets the value of the centimetrs property.
     * 
     */
    public double getCentimetrs() {
        return centimetrs;
    }

    /**
     * Sets the value of the centimetrs property.
     * 
     */
    public void setCentimetrs(double value) {
        this.centimetrs = value;
    }

}
