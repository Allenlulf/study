package com.llf.yuanxing;

public class cloneTest {
	public static void main(String[] args) {
		// ��һ���ֳɵĶ�������������Ѿ������úõ�ֵ
		// ���������Ҫ�½�һ��������Ҫ���½��Ķ���ֵ�����Ҹ�ֵ����Ҫ��֮ǰ��һģһ��
		ConcretePrototype cp = new ConcretePrototype();
		cp.setAge(18);
		try {
			ConcretePrototype copy = (ConcretePrototype) cp.clone();
			System.out.println(cp == copy);
			System.out.println(cp.list == copy.list);
			System.out.println(copy.getAge());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
