package com.epoint.test;

//Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,Ȼ���ټ���ԭ�ȵ����õ�"�෴��"������,Ϊ�˵õ�1325��"�෴��",�������ǽ�����������˳��ߵ�,���ǵõ�5231,
//֮���ټ���ԭ�ȵ���,���ǵõ�5231+1325=6556.����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�����n = 100, �ߵ�֮����1. 
public class test2 {
	public static void main(String[] args) {
		int i = 5231;
		StringBuffer sb=new StringBuffer(i+"");
		String s=sb.reverse().toString();
		int ss=Integer.parseInt(s);
		System.out.println(ss+i);
	}
}
