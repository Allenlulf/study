
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
 *         &lt;element name="UploadPW_LibInfoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "uploadPWLibInfoResult"
})
@XmlRootElement(name = "UploadPW_LibInfoResponse")
public class UploadPWLibInfoResponse {

    @XmlElement(name = "UploadPW_LibInfoResult")
    protected boolean uploadPWLibInfoResult;

    /**
     * ��ȡuploadPWLibInfoResult���Ե�ֵ��
     * 
     */
    public boolean isUploadPWLibInfoResult() {
        return uploadPWLibInfoResult;
    }

    /**
     * ����uploadPWLibInfoResult���Ե�ֵ��
     * 
     */
    public void setUploadPWLibInfoResult(boolean value) {
        this.uploadPWLibInfoResult = value;
    }

}
