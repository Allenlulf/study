package com.leetcode.test;

public class test35 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 5, 7 };
		System.out.println(searchInsert(nums, 9));
	}

	public static int searchInsert(int[] nums, int target) {
		int index = 0;
		int[] newnums = new int[nums.length + 1];
		boolean isreturn = true;
		int finalindex = 0;
		for (int i : nums) {
			if (isreturn && target <= i) {
				newnums[index] = target;
				newnums[index + 1] = i;
				finalindex = index;
				index = index + 1;
				isreturn = false;
			} 
			else {
				newnums[index] = i;
			}
			index++;
		}
		if(isreturn){
			newnums[index]=target;
			finalindex=nums.length;
		}
		return finalindex;
	}
}
