
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
 *         &lt;element name="GetBJBiaoDuanListResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getBJBiaoDuanListResult",
    "totalNum"
})
@XmlRootElement(name = "GetBJBiaoDuanListResponse")
public class GetBJBiaoDuanListResponse {

    @XmlElement(name = "GetBJBiaoDuanListResult")
    protected String getBJBiaoDuanListResult;
    @XmlElement(name = "TotalNum")
    protected int totalNum;

    /**
     * ��ȡgetBJBiaoDuanListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetBJBiaoDuanListResult() {
        return getBJBiaoDuanListResult;
    }

    /**
     * ����getBJBiaoDuanListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetBJBiaoDuanListResult(String value) {
        this.getBJBiaoDuanListResult = value;
    }

    /**
     * ��ȡtotalNum���Ե�ֵ��
     * 
     */
    public int getTotalNum() {
        return totalNum;
    }

    /**
     * ����totalNum���Ե�ֵ��
     * 
     */
    public void setTotalNum(int value) {
        this.totalNum = value;
    }

}
