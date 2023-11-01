
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarConsultor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarConsultor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreusuarioaeliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarConsultor", propOrder = {
    "nombreusuarioaeliminar"
})
public class EliminarConsultor {

    protected String nombreusuarioaeliminar;

    /**
     * Obtiene el valor de la propiedad nombreusuarioaeliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuarioaeliminar() {
        return nombreusuarioaeliminar;
    }

    /**
     * Define el valor de la propiedad nombreusuarioaeliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuarioaeliminar(String value) {
        this.nombreusuarioaeliminar = value;
    }

}
