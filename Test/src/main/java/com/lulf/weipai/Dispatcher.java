package com.lulf.weipai;

public class Dispatcher implements IDelegate {

	IDelegate target;

	Dispatcher(IDelegate target) {
		this.target = target;
	};

	// �������ܣ���ȻҲ�̳�ִ�з�����
	// ����ְ��һ��
	public void doing() {
		this.target.doing();
	}
}
