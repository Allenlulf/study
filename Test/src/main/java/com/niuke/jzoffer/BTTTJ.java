package com.niuke.jzoffer;

/**
 * ��̬��̨��
 * 
 * @author lulf һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж���������
 */
public class BTTTJ {
	public static void main(String[] args) {
		int number = 5;
		System.out.println(JumpFloorII(number));
	}

	public static int JumpFloorII(int target) {
		int m=0,i;
        if(target<0)m=0;
           else if(target==0)m=1;
                  else
                      for(i=target-1;i>=0;i--)
                           m+=JumpFloorII(i);
         return m;
	}
}
