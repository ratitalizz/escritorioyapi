
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarAdministrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarAdministrador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreusuarioabuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contrasenausuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarAdministrador", propOrder = {
    "nombreusuarioabuscar",
    "contrasenausuario"
})
public class ModificarAdministrador {

    protected String nombreusuarioabuscar;
    protected String contrasenausuario;

    /**
     * Obtiene el valor de la propiedad nombreusuarioabuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuarioabuscar() {
        return nombreusuarioabuscar;
    }

    /**
     * Define el valor de la propiedad nombreusuarioabuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuarioabuscar(String value) {
        this.nombreusuarioabuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenausuario() {
        return contrasenausuario;
    }

    /**
     * Define el valor de la propiedad contrasenausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenausuario(String value) {
        this.contrasenausuario = value;
    }

}
