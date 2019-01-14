package study.allen.sort;

/**
 * 排序算法【冒泡，选择，插入，快排】
 * 
 * @author lulf
 * @date 2019年1月14日
 */
public class paixu {
	/**
	 * 快速排序
	 * @param arr
	 */
	public void kuaipai(int[] arr){
		int len=arr.length;
		int first=0;
		int last=len-1;
		sort(arr,first,last);
	}
	
	private void sort(int[] arr, int first, int last) {
		int pos=0;
		if(first<last){
			pos=partition(arr,first,last);
			sort(arr, first, pos-1);
			sort(arr, pos+1, last);
		}
	}

	private int partition(int[] arr, int first, int last) {
		int key=arr[first];
		while(first<last){
			
			while(first<last&&key<arr[last]){
				last--;
			}
			swap(arr, first, last);
			while(first<last&&key>arr[last]){
				first++;
			}
		}
		return last;
	}

	/**
	 * 直接插入排序
	 * @param arr
	 */
	public void cr(int[] arr){
		int len=arr.length;
		for(int i=1;i<len;i++){
			for(int j=i;j>0&&arr[j]>arr[i];j--){
				swap(arr, i, j);
			}
		}
	}

	/**
	 * 选择排序
	 * 
	 * @param arr
	 */
	public void xuanze(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i; j < len; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 */
	public void mp(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * 数组交换下标
	 * 
	 * @param arr
	 * @param i
	 * @param j
	 */
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
