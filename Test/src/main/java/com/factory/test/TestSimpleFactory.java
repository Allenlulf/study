package com.factory.test;

public class TestSimpleFactory {
	public static void main(String[] args) {
		// ��������ǵ�������
		Car car = new SimpleFactory().getCar("Bmw");
		System.out.println(car.getName());
	}
}
