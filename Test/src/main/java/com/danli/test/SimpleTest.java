package com.danli.test;

// ����ʽд��(��̬�ڲ���)
// �Ƚ���˰�ȫ�����⣬�ֽ������������
public class SimpleTest {
	// 1 ����������һ����̬�ڲ���
	// private ˽�����Ա�֤���˲����޸�
	// static ��֤ȫ��Ψһ
	private static class LazyHolder{
		// final Ϊ�˷�ֹ�ڲ������
		private static final SimpleTest INSTANCE=new SimpleTest();
	}
	
	// 2 Ĭ�Ϲ��췽��˽�л�
	private SimpleTest(){}
	
	// 3 ͬ���ṩ��̬������ȡʵ��
	// final ��ֹ����������
	public static final SimpleTest getInstance(){
		return LazyHolder.INSTANCE;
	}
}
