package com.jvm.test1;

public class testCAS {
public static void main(String[] args) {
	//s1��s2�ַ������������г������У������Ƕ��ڴ濪������
	//��һ��Stringtable�洢������hashset��
	//���򲻿��ظ�������s1��s2ָ��ͬһ������������
	String s1="abc";
	String s2="abc";
	//s3������ʵ�����󣬿����ڶ��ڴ���
	String s3=new String("abc");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	// intern ������s3 ����ʱ����
	System.out.println(s1==s3.intern());
	}
}
