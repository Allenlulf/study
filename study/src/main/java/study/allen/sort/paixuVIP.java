package study.allen.sort;

/**
 * 排序下 【归并,基数,希尔排序，堆排序】
 * 
 * @author lulf
 * @date 2019年1月15日
 */
public class paixuVIP {

	public void gb(int[] arr) {
		int len = arr.length;
		int low = 0;
		int high = len - 1;
		gbsort(arr, low, high);
	}

	private void gbsort(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			gbsort(arr, low, mid);
			gbsort(arr, mid + 1, high);
			gbmerge(arr, low, mid, high);
		}
	}

	private void gbmerge(int[] arr, int low, int mid, int high) {
		int[] tmp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		// 把较小的数先移动到新数组中
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				tmp[k++] = arr[i];
			} else {
				tmp[k++] = arr[j];
			}
		}
		// 把左边剩余的数移动到数组
		while (i <= mid) {
			tmp[k++] = arr[i++];
		}

		while (j <= high) {
			tmp[k++] = arr[j++];
		}

		for (int x = 0; x < tmp.length; x++) {
			arr[x + low] = tmp[x];
		}
	}

	// shell排序属于插入排序的升级版
	public void shellsort(int[] arr) {
		// i表示希尔排序中的第n/2+1个元素（或者n/4+1）
		// j表示希尔排序中从0到n/2的元素（n/4）
		// r表示希尔排序中n/2+1或者n/4+1的值
		int i, j, r, tmp;
		for (r = arr.length / 2; r >= 1; r = r / 2) {
			for (i = r; i < arr.length; i++) {
				tmp = arr[i];
				j = i - r;
				while (j >= 0 && tmp < arr[j]) {
					arr[j + r] = arr[j];
					j -= r;
				}
				arr[j + r] = tmp;
			}
		}
	}

	public void RadixSort(int[] array, int d) {
		int n = 1;// 代表位数对应的数：1,10,100...
		int k = 0;// 保存每一位排序后的结果用于下一位的排序输入
		int length = array.length;
		int[][] bucket = new int[10][length];// 排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
		int[] order = new int[length];// 用于保存每个桶里有多少个数字
		while (n < d) {
			for (int num : array) // 将数组array里的每个数字放在相应的桶里
			{
				int digit = (num / n) % 10;
				bucket[digit][order[digit]] = num;
				order[digit]++;
			}
			for (int i = 0; i < length; i++)// 将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
			{
				if (order[i] != 0)// 这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
				{
					for (int j = 0; j < order[i]; j++) {
						array[k] = bucket[i][j];
						k++;
					}
				}
				order[i] = 0;// 将桶里计数器置0，用于下一次位排序
			}
			n *= 10;
			k = 0;// 将k置0，用于下一轮保存位排序结果
		}
	}

	// 堆排序
	public int[] heapSort(int[] array) {
		array = buildMaxHeap(array); // 初始建堆，array[0]为第一趟值最大的元素
		for (int i = array.length - 1; i > 1; i--) {
			int temp = array[0]; // 将堆顶元素和堆低元素交换，即得到当前最大元素正确的排序位置
			array[0] = array[i];
			array[i] = temp;
			adjustDownToUp(array, 0, i); // 整理，将剩余的元素整理成堆
		}
		return array;
	}

	// 构建大根堆：将array看成完全二叉树的顺序存储结构
	private int[] buildMaxHeap(int[] array) {
		// 从最后一个节点array.length-1的父节点（array.length-1-1）/2开始，直到根节点0，反复调整堆
		for (int i = (array.length - 2) / 2; i >= 0; i--) {
			adjustDownToUp(array, i, array.length);
		}
		return array;
	}

	// 将元素array[k]自下往上逐步调整树形结构
	private void adjustDownToUp(int[] array, int k, int length) {
		int temp = array[k];
		for (int i = 2 * k + 1; i < length - 1; i = 2 * i + 1) { // i为初始化为节点k的左孩子，沿节点较大的子节点向下调整
			if (i < length && array[i] < array[i + 1]) { // 取节点较大的子节点的下标
				i++; // 如果节点的右孩子>左孩子，则取右孩子节点的下标
			}
			if (temp >= array[i]) { // 根节点 >=左右子女中关键字较大者，调整结束
				break;
			} else { // 根节点 <左右子女中关键字较大者
				array[k] = array[i]; // 将左右子结点中较大值array[i]调整到双亲节点上
				k = i; // 【关键】修改k值，以便继续向下调整
			}
		}
		array[k] = temp; // 被调整的结点的值放人最终位置
	}

}
