package com.lulf.abstractfactory.demo;

import com.factory.test.Car;

//�����ҵ���߼���
public class DefaultFactory extends AbstractFactory{
	
	//ʲô�������Ļ���Ĭ�Ϲ���
	private AudiFactory DefaultFactory=new AudiFactory();

	@Override
	protected Car getCar() {
		return DefaultFactory.getCar();
	}

}
