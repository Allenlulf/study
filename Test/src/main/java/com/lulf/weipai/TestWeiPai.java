package com.lulf.weipai;

public class TestWeiPai {
	public static void main(String[] args) {
		Dispatcher dispatcher=new Dispatcher(new TargetA());
		//����ȥ�������������ڸɻ�
		// ��ʵ�ϸ����Ϳ�ݵ��Ǿ����ĳ�����Ա
		// ���͵ģ��ɻ����ҵģ����������
		dispatcher.doing();
	}

}
