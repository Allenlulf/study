
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
 *         &lt;element name="GetDanWeiKBBiaoDuanResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getDanWeiKBBiaoDuanResult"
})
@XmlRootElement(name = "GetDanWeiKBBiaoDuanResponse")
public class GetDanWeiKBBiaoDuanResponse {

    @XmlElement(name = "GetDanWeiKBBiaoDuanResult")
    protected String getDanWeiKBBiaoDuanResult;

    /**
     * ��ȡgetDanWeiKBBiaoDuanResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDanWeiKBBiaoDuanResult() {
        return getDanWeiKBBiaoDuanResult;
    }

    /**
     * ����getDanWeiKBBiaoDuanResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDanWeiKBBiaoDuanResult(String value) {
        this.getDanWeiKBBiaoDuanResult = value;
    }

}
