
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarAdminpornombre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarAdminpornombre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreusuarioporbuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarAdminpornombre", propOrder = {
    "nombreusuarioporbuscar"
})
public class ListarAdminpornombre {

    protected String nombreusuarioporbuscar;

    /**
     * Obtiene el valor de la propiedad nombreusuarioporbuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuarioporbuscar() {
        return nombreusuarioporbuscar;
    }

    /**
     * Define el valor de la propiedad nombreusuarioporbuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuarioporbuscar(String value) {
        this.nombreusuarioporbuscar = value;
    }

}
