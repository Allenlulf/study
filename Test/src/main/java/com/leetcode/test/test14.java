package com.leetcode.test;

public class test14 {

	public static void main(String[] args) {
		String[] str = new String[] { "flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] strs) {
		// ��ѡ�������г�����С��
		if (strs.length == 0) {
			return "";
		}
		String str = strs[0];
		if (strs.length >= 2) {
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() < str.length()) {
					str = strs[i];
				}
			}
		}
		// ȡ����С��������п�������"abc"���� a ab abc
		boolean isbreak = false;
		String ret = "";
		for (int i = 1; i <= str.length(); i++) {
			if (isbreak) {
				break;
			}
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].substring(0, i).toString().indexOf(str.substring(0, i).toString()) != -1) {
					if (j == (strs.length - 1)) {
						ret = str.substring(0, i);
					}
				} else {
					isbreak = true;
					break;
				}
			}
		}
		return ret;
	}
}
