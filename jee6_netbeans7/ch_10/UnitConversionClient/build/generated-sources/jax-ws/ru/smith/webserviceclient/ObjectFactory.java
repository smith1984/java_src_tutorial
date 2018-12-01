
package ru.smith.webserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.smith.webserviceclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CentimetrsToInches_QNAME = new QName("http://webservice.smith.ru/", "CentimetrsToInches");
    private final static QName _InchesToCentimetrsResponse_QNAME = new QName("http://webservice.smith.ru/", "inchesToCentimetrsResponse");
    private final static QName _CentimetrsToInchesResponse_QNAME = new QName("http://webservice.smith.ru/", "CentimetrsToInchesResponse");
    private final static QName _InchesToCentimetrs_QNAME = new QName("http://webservice.smith.ru/", "inchesToCentimetrs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.smith.webserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InchesToCentimetrsResponse }
     * 
     */
    public InchesToCentimetrsResponse createInchesToCentimetrsResponse() {
        return new InchesToCentimetrsResponse();
    }

    /**
     * Create an instance of {@link CentimetrsToInchesResponse }
     * 
     */
    public CentimetrsToInchesResponse createCentimetrsToInchesResponse() {
        return new CentimetrsToInchesResponse();
    }

    /**
     * Create an instance of {@link CentimetrsToInches }
     * 
     */
    public CentimetrsToInches createCentimetrsToInches() {
        return new CentimetrsToInches();
    }

    /**
     * Create an instance of {@link InchesToCentimetrs }
     * 
     */
    public InchesToCentimetrs createInchesToCentimetrs() {
        return new InchesToCentimetrs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrsToInches }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smith.ru/", name = "CentimetrsToInches")
    public JAXBElement<CentimetrsToInches> createCentimetrsToInches(CentimetrsToInches value) {
        return new JAXBElement<CentimetrsToInches>(_CentimetrsToInches_QNAME, CentimetrsToInches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InchesToCentimetrsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smith.ru/", name = "inchesToCentimetrsResponse")
    public JAXBElement<InchesToCentimetrsResponse> createInchesToCentimetrsResponse(InchesToCentimetrsResponse value) {
        return new JAXBElement<InchesToCentimetrsResponse>(_InchesToCentimetrsResponse_QNAME, InchesToCentimetrsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrsToInchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smith.ru/", name = "CentimetrsToInchesResponse")
    public JAXBElement<CentimetrsToInchesResponse> createCentimetrsToInchesResponse(CentimetrsToInchesResponse value) {
        return new JAXBElement<CentimetrsToInchesResponse>(_CentimetrsToInchesResponse_QNAME, CentimetrsToInchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InchesToCentimetrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smith.ru/", name = "inchesToCentimetrs")
    public JAXBElement<InchesToCentimetrs> createInchesToCentimetrs(InchesToCentimetrs value) {
        return new JAXBElement<InchesToCentimetrs>(_InchesToCentimetrs_QNAME, InchesToCentimetrs.class, null, value);
    }

}
