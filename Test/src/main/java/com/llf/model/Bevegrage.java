package com.llf.model;

//��������
public abstract class Bevegrage {
	
	//���̲��費������д
	public final void create(){
		//1 �տ�ˮ
		builWater();
		//2 ׼�����Ӽ�ԭ����
		pourInCup();
		//3 ����
		brew();
		//4 ��Ӹ���
		addCoundiments();		
	}

	public abstract void addCoundiments();

	public void brew() {
		System.out.println("����");		
	}

	public abstract void pourInCup();

	public void builWater() {
		System.out.println("����ˮ");	
	}
}
