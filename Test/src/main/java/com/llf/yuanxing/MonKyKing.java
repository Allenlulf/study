package com.llf.yuanxing;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

//�����
public class MonKyKing extends Monky implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7446387088921000645L;

	// �𹿰�
	private JinGuBang jgb;

	MonKyKing() {
		this.jgb = new JinGuBang();
		this.setHeight(1000);
		this.setName("�����");
		this.setDate(new Date());
	}

	// ������
	public Object clone() {
		
		ByteArrayOutputStream bos=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream ois = null;
		try {
			//return super.clone();
			//���л�
			bos=new ByteArrayOutputStream();
			oos=new  ObjectOutputStream(bos);
			oos.writeObject(this);
			//�����л�
			bis=new ByteArrayInputStream(bos.toByteArray());
			ois=new  ObjectInputStream(bis);
			MonKyKing copy=(MonKyKing) ois.readObject();
			copy.setDate(new Date());
			return copy;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				ois.close();
				bis.close();
				oos.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

	public void change() {
		MonKyKing mk = (MonKyKing) clone();
		System.out.println("����ӱ������գ�" + this.getDate().getTime());
		System.out.println("��¡����ӱ������գ�" + mk.getDate().getTime());
		System.out.println("����Ϳ�¡�Ƿ���ͬһ������" + (this == mk));
		System.out.println("����Ϳ�¡���еĽ𹿰��Ƿ���ͬһ������" + (this.jgb == mk.jgb));
	}

	public JinGuBang getJgb() {
		return jgb;
	}

	public void setJgb(JinGuBang jgb) {
		this.jgb = jgb;
	}

}
