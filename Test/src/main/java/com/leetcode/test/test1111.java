package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * һ�����飬�����гɶԵ���������һ��������������ô���ٵ��ҳ������
 * 
 * @author lulf
 */
public class test1111 {
	public static void main(String[] args) {
		String[] ret = new String[] { "a", "c", "a", "b", "c", "d", "b" };
		System.out.println(getvalue(ret));
	}

	public static String getvalue(String[] ret) {
		String result="";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < ret.length; i++) {
			if (map.get(ret[i]) == null) {
				map.put(ret[i], 1);
			} else {
				map.put(ret[i], map.get(ret[i]) + 1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result=entry.getKey();
			}
		}
		return result;
	}
}
