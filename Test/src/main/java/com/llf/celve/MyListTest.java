package com.llf.celve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListTest {
	public static void main(String[] args) {
		//����ģʽ
		List<Long> numbers=new ArrayList<Long>();
		
		Collections.sort(numbers, new Comparator<Long>() {

			@Override
			// ����ֵ�ǹ̶��� 0 -1 1
			// 0 >0 <0
			public int compare(Long o1, Long o2) {
                //�м��߼��ǲ�һ����
				
				return 0;
			}
			
		});
	}


}
