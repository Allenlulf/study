package com.epoint.test;

//һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
//�����ʵ�������쳲���������
public class test4 {

	public static void main(String[] args) {
		System.out.println(JumpFloor(14));
	}

	public static int JumpFloor(int target) {
		if (target <= 2) {
			return target;
		}
		return JumpFloor(target - 2) + JumpFloor(target - 1);
	}
}
