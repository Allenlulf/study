package com.niuke.jzoffer;
/**
 * ��̨��
 * @author lulf
 *һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 */
public class TTJ {
    public int JumpFloor(int target) {
        if (target <= 2) {
			return target;
		}
		return JumpFloor(target - 2) + JumpFloor(target - 1);
    }
}
