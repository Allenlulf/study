
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
 *         &lt;element name="GetDanWeiBiaoDuanResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getDanWeiBiaoDuanResult"
})
@XmlRootElement(name = "GetDanWeiBiaoDuanResponse")
public class GetDanWeiBiaoDuanResponse {

    @XmlElement(name = "GetDanWeiBiaoDuanResult")
    protected String getDanWeiBiaoDuanResult;

    /**
     * ��ȡgetDanWeiBiaoDuanResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDanWeiBiaoDuanResult() {
        return getDanWeiBiaoDuanResult;
    }

    /**
     * ����getDanWeiBiaoDuanResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDanWeiBiaoDuanResult(String value) {
        this.getDanWeiBiaoDuanResult = value;
    }

}
