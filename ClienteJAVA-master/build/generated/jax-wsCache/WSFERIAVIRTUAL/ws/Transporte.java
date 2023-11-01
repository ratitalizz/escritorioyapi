
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transporte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacidadcarga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="frigorificotrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo_idmodelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permisocirculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportista_rut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transporte", propOrder = {
    "capacidadcarga",
    "frigorificotrans",
    "modeloIdmodelo",
    "patente",
    "permisocirculacion",
    "transportistaRut"
})
public class Transporte {

    protected int capacidadcarga;
    protected String frigorificotrans;
    @XmlElement(name = "modelo_idmodelo")
    protected String modeloIdmodelo;
    protected String patente;
    protected String permisocirculacion;
    @XmlElement(name = "transportista_rut")
    protected int transportistaRut;

    /**
     * Obtiene el valor de la propiedad capacidadcarga.
     * 
     */
    public int getCapacidadcarga() {
        return capacidadcarga;
    }

    /**
     * Define el valor de la propiedad capacidadcarga.
     * 
     */
    public void setCapacidadcarga(int value) {
        this.capacidadcarga = value;
    }

    /**
     * Obtiene el valor de la propiedad frigorificotrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrigorificotrans() {
        return frigorificotrans;
    }

    /**
     * Define el valor de la propiedad frigorificotrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrigorificotrans(String value) {
        this.frigorificotrans = value;
    }

    /**
     * Obtiene el valor de la propiedad modeloIdmodelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloIdmodelo() {
        return modeloIdmodelo;
    }

    /**
     * Define el valor de la propiedad modeloIdmodelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloIdmodelo(String value) {
        this.modeloIdmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad patente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Define el valor de la propiedad patente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatente(String value) {
        this.patente = value;
    }

    /**
     * Obtiene el valor de la propiedad permisocirculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisocirculacion() {
        return permisocirculacion;
    }

    /**
     * Define el valor de la propiedad permisocirculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisocirculacion(String value) {
        this.permisocirculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistaRut.
     * 
     */
    public int getTransportistaRut() {
        return transportistaRut;
    }

    /**
     * Define el valor de la propiedad transportistaRut.
     * 
     */
    public void setTransportistaRut(int value) {
        this.transportistaRut = value;
    }

}
