package com.lulf.sjms;

import com.lulf.sjmsdemo.MyDaiLi;

public class Main {
	public static void main(String[] args) throws Throwable {
		//ԭ��
		//1. �õ�������Ķ�������,Ȼ���ȡ���Ľӿ�
		//2. JDK������������һ���ף�ͬʱʵ�����Ǹ��Ĵ��������ʵ�ֵĽӿ�
		//3. �ѱ�������������Ҳ�õ���
		//4. ���¶�̬����һ��class�ֽ���
		//5. ������
//		ZFZ obj=(ZFZ) new ZJ().getInstance(new lulf());
//		obj.zfz();
//		obj.zf();
		ZFZ obj=(ZFZ) new MyDaiLi().getInstance(new lulf());
		obj.zfz();
		obj.zf();
		
	}
}
