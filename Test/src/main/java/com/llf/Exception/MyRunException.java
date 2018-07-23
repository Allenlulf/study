package com.llf.Exception;

/**
 * ����ʱ�쳣��
 * @author lulf
 * 2018��7��2��
 */
public class MyRunException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �������
	 */
	private String errorCode;
	
	/**
	 * ��Ϣ�Ƿ�Ϊ�����ļ���key
	 */
	private boolean propertiesKey=true; 
	
	public MyRunException(String message){
		super(message);
	}
	
	public MyRunException(String errorCode,String message,Throwable cause){
		this(errorCode,message,cause,true);
	}
	
	public MyRunException(String errorCode,String message){
		this(errorCode, message, true);
	}

	public MyRunException(String errorCode, String message, boolean propertiesKey) {
		super(message);
		this.setErrorCode(errorCode);
	    this.setPropertiesKey(propertiesKey);
	}
	
	public MyRunException(String errorCode, String message,Throwable cause, boolean propertiesKey) {
		super(message,cause);
		this.setErrorCode(errorCode);
	    this.setPropertiesKey(propertiesKey);
	}
	
	public MyRunException(String message,Throwable cause){
		super(message,cause);
	}
	
     public MyRunException(){
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isPropertiesKey() {
		return propertiesKey;
	}

	public void setPropertiesKey(boolean propertiesKey) {
		this.propertiesKey = propertiesKey;
	}
}
