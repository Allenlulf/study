
package org.tempuri;

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
 *         &lt;element name="CreateDateAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="md5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaiLiGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "createDateAfter",
    "md5",
    "daiLiGuid"
})
@XmlRootElement(name = "GetBiaoDuanKBDT")
public class GetBiaoDuanKBDT {

    @XmlElement(name = "BiaoDuanGuid")
    protected String biaoDuanGuid;
    @XmlElement(name = "CreateDateAfter")
    protected String createDateAfter;
    protected String md5;
    @XmlElement(name = "DaiLiGuid")
    protected String daiLiGuid;

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
     * ��ȡcreateDateAfter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateAfter() {
        return createDateAfter;
    }

    /**
     * ����createDateAfter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateAfter(String value) {
        this.createDateAfter = value;
    }

    /**
     * ��ȡmd5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMd5() {
        return md5;
    }

    /**
     * ����md5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMd5(String value) {
        this.md5 = value;
    }

    /**
     * ��ȡdaiLiGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaiLiGuid() {
        return daiLiGuid;
    }

    /**
     * ����daiLiGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaiLiGuid(String value) {
        this.daiLiGuid = value;
    }

}
