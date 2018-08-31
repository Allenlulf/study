package com.leetcode.test;

public class test2 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode l3 = addTwoNumbers(l1, l2);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode target = new ListNode(0); // ͷ���
		ListNode node = target; // ���
		int sum = 0; // ÿ�����ĺ�
		while (l1 != null || l2 != null) {
			sum /= 10; // �󱾴εĽ�λ
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			node.next = new ListNode(sum % 10); // �ý���ֵ ���ǽ��͵�����
			node = node.next; // ָ����һ�����
		}
		if (sum / 10 == 1) // �����һ�������д���
			node.next = new ListNode(1);
		return target.next;
	}
}
