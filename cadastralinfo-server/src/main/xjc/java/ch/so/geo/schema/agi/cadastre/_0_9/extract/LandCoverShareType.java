//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.22 at 02:52:40 PM CEST 
//


package ch.so.geo.schema.agi.cadastre._0_9.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LandCoverShareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandCoverShareType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract}LCType" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TypeDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandCoverShareType", propOrder = {
    "type",
    "area",
    "typeDescription"
})
public class LandCoverShareType {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "normalizedString")
    protected LCType type;
    @XmlElement(name = "Area")
    protected Double area;
    @XmlElement(name = "TypeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeDescription;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LCType }
     *     
     */
    public LCType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCType }
     *     
     */
    public void setType(LCType value) {
        this.type = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArea(Double value) {
        this.area = value;
    }

    /**
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

}