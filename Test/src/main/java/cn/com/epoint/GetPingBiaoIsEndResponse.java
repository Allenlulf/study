
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
 *         &lt;element name="GetPingBiaoIsEndResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "getPingBiaoIsEndResult"
})
@XmlRootElement(name = "GetPingBiaoIsEndResponse")
public class GetPingBiaoIsEndResponse {

    @XmlElement(name = "GetPingBiaoIsEndResult")
    protected boolean getPingBiaoIsEndResult;

    /**
     * ��ȡgetPingBiaoIsEndResult���Ե�ֵ��
     * 
     */
    public boolean isGetPingBiaoIsEndResult() {
        return getPingBiaoIsEndResult;
    }

    /**
     * ����getPingBiaoIsEndResult���Ե�ֵ��
     * 
     */
    public void setGetPingBiaoIsEndResult(boolean value) {
        this.getPingBiaoIsEndResult = value;
    }

}
