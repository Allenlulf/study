package com.factory.test;

public class FactoryTest {
	public static void main(String[] args) {
		//��������ģʽ
		// ������Ʒ�������̣���ӵ���Լ����ԵĹ���
		// �������գ����ɵĸ߿Ƽ��̶ȸ�����ͬ
		Factory factory1=new AudiFactory();
		System.out.println(factory1.getcar());
		//������ֻ�����Լ���Ҫ���Ǹ���������
		Factory factory2=new BenzFactory();
		System.out.println(factory2.getcar());
	}
}
