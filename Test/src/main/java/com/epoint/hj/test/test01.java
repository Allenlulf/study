package com.epoint.hj.test;
//С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,����С������һöħ���Ҷ�û��,����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
//ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
//ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
//С�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ���ҡ� 
public class test01 {
	public static void main(String[] args) {
		System.out.println(getValue(8));
	}
	
	
	public static String getValue(int value){
			StringBuffer sb=new StringBuffer();
			while(value>0){
				if(value%2==0){
					value=(value-2)/2;
					sb.append(2);
				}else{
					value=(value-1)/2;
					sb.append(1);
				}
			}
			String result=sb.reverse().toString();
			return result;
	}
}
