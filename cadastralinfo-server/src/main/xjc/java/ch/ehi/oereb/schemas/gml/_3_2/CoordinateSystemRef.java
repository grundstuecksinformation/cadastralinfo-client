//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CoordinateSystemRef
    extends JAXBElement<CoordinateSystemPropertyTypeType>
{

    protected final static QName NAME = new QName("http://www.opengis.net/gml/3.2", "coordinateSystemRef");

    public CoordinateSystemRef(CoordinateSystemPropertyTypeType value) {
        super(NAME, ((Class) CoordinateSystemPropertyTypeType.class), null, value);
    }

    public CoordinateSystemRef() {
        super(NAME, ((Class) CoordinateSystemPropertyTypeType.class), null, null);
    }

}