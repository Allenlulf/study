
package cn.com.epoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BiaoDuanGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DanWeiGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "biaoDuanGuid",
    "danWeiGuid"
})
@XmlRootElement(name = "GetLastEditBJHistoryDetail")
public class GetLastEditBJHistoryDetail {

    @XmlElement(name = "BiaoDuanGuid")
    protected String biaoDuanGuid;
    @XmlElement(name = "DanWeiGuid")
    protected String danWeiGuid;

    /**
     * ��ȡbiaoDuanGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiaoDuanGuid() {
        return biaoDuanGuid;
    }

    /**
     * ����biaoDuanGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiaoDuanGuid(String value) {
        this.biaoDuanGuid = value;
    }

    /**
     * ��ȡdanWeiGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanWeiGuid() {
        return danWeiGuid;
    }

    /**
     * ����danWeiGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanWeiGuid(String value) {
        this.danWeiGuid = value;
    }

}
