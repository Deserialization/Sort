package cn.it.sort;

public class BinarySearch {
	//参数k代表的是要查找的数
	public static int  binarySearch(int [] array, int low, int high, int k) {
		int mid;
		while(low <= high){
			
			mid = (low + high)>>2;//取当前表的中间位置
			//找到后返回元素的位置 大于k说明在前半部分，小于k就是在 后半部分
		    if (array[mid] == k) {
				return mid;
			}else if (array[mid] > k){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return 0;
	}

}
