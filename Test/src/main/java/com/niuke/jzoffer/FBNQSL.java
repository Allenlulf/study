package com.niuke.jzoffer;

/**
 * 쳲���������
 * 
 * @author lulf ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n� n<=39 1 1 2 3 5 8 13
 */
public class FBNQSL {
	public static void main(String[] args) {
		System.out.println(getResult(5));
	}

	public static int getResult(int n) {
		if(n<=0){
            return 0;
        }
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return getResult(n - 1) + getResult(n - 2);
		}
	}
}
