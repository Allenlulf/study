package study.allen.jzoffer;

/**
 * 【二维数组的查找】 题目描述 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的
 * 顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样 的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * @author lulf
 * @date 2019年1月18日
 */
public class Solution01 {
	public boolean Find(int target, int[][] array) {
		boolean result = false;
		try {
			int len1 = array.length;
			int len2 = array[0].length;
			for (int i = 0; i < len1; i++) {
				if (target >= array[i][0] && target <= array[i][len2 - 1]) {
					for (int j = 0; j < len2; j++) {
						if (target == array[i][j]) {
							result = true;
							return result;
						}
					}
				}
			}
			return result;
		} catch (Exception e) {
			return result;
		}
	}
}
