package study.allen.sort;

import java.util.Arrays;

//二分查找
public class search {
	public static void main(String[] args) {	
		int [] arr={6,3,9,7,2,1,4};
		int value=7;
		//先排序
		Arrays.sort(arr);
		int len=arr.length;
		int first=0;
		int last=len-1;
		boolean result=false;
		while(first<last){
			int mid=(first+last)/2;
			if(value<arr[mid]){
				last=mid-1;
			}else if(value<arr[mid]){
				first=mid+1;
			}else{
				result=true;
			}
		}
		System.out.println(result);
	}
}
