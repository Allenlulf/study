package com.niuke.jzoffer;

/**
 * �滻�ո�
 * @author lulf
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
 */
public class THKG {
	public static void main(String[] args) {
		System.out.println(replaceStr(new StringBuffer("We Are Happy")));

	}
	
	public static String replaceStr(StringBuffer sb){
		String value=sb.toString();
		value=value.replace(" ", "%20");
		return value;
	}
}
