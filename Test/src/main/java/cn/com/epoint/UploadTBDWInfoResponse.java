
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
 *         &lt;element name="UploadTBDWInfoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "uploadTBDWInfoResult"
})
@XmlRootElement(name = "UploadTBDWInfoResponse")
public class UploadTBDWInfoResponse {

    @XmlElement(name = "UploadTBDWInfoResult")
    protected boolean uploadTBDWInfoResult;

    /**
     * ��ȡuploadTBDWInfoResult���Ե�ֵ��
     * 
     */
    public boolean isUploadTBDWInfoResult() {
        return uploadTBDWInfoResult;
    }

    /**
     * ����uploadTBDWInfoResult���Ե�ֵ��
     * 
     */
    public void setUploadTBDWInfoResult(boolean value) {
        this.uploadTBDWInfoResult = value;
    }

}
