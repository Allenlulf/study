package com.niuke.jzoffer;

import java.util.ArrayList;

/**
 * ��β��ͷ��ӡ����
 * ����һ��������β��ͷ��ӡ����ÿһ���ڵ�ֵ
 * @author lulf
 */
public class cwdtdylb {
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(3);
		listNode.next.next = new ListNode(4);
		listNode.next.next.next = new ListNode(0);
		cwdtdylb s=new cwdtdylb();
		System.out.println(s.printListFromTailToHead(listNode));
	}
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null)
		{
			this.printListFromTailToHead(listNode.next);
			arrayList.add(listNode.val);
		}
		return arrayList;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
