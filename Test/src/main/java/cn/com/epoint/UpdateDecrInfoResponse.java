
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
 *         &lt;element name="UpdateDecrInfoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "updateDecrInfoResult"
})
@XmlRootElement(name = "UpdateDecrInfoResponse")
public class UpdateDecrInfoResponse {

    @XmlElement(name = "UpdateDecrInfoResult")
    protected boolean updateDecrInfoResult;

    /**
     * ��ȡupdateDecrInfoResult���Ե�ֵ��
     * 
     */
    public boolean isUpdateDecrInfoResult() {
        return updateDecrInfoResult;
    }

    /**
     * ����updateDecrInfoResult���Ե�ֵ��
     * 
     */
    public void setUpdateDecrInfoResult(boolean value) {
        this.updateDecrInfoResult = value;
    }

}
