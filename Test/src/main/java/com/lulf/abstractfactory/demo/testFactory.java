package com.lulf.abstractfactory.demo;

public class testFactory {
	public static void main(String[] args) {
		DefaultFactory defaultFactory=new DefaultFactory();
		//Ĭ�Ϲ���
		System.out.println(defaultFactory.getCar());
		//��ֵ
		System.out.println(defaultFactory.getCar("Bmw"));
		
	}

}
