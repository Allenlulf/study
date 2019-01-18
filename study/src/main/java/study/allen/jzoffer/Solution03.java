package study.allen.jzoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 【从尾到头打印链表】输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 
 * @author lulf
 * @date 2019年1月18日
 */
public class Solution03 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop().val);
		}
		return list;
	}
}
