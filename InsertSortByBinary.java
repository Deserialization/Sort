package cn.it.sort;

public class InsertSortByBinary {
	 private static int[] insertSortByBinary(int[] num){
	        int temp;
	        //折半查找必备的三个要素
	        int low,high,middle;
	        for (int i = 1; i < num.length; i++) {
	            // 对于排序，我们只需要找出插入的位置就好了
	            //这个位置应该满足|high- low|等于1，然后把值插入到他们之间
	            temp = num[i];//待插入记录
	            //数组的0为开始位置，也是数组已排序的位置
	            low = 0;
	            //已排序数组的结束位置
	            high = i - 1;
	            while (low <= high) {
	                middle = (low+high) / 2;
	                if (num[middle] > temp) {

	                    //中间的元素大于待插入值
	                    high = middle - 1;

	                }
	                else {
	                    //中间的元素小于或等于待插入值
	                    low = middle + 1;
	                }
	            }
	            for (int j = i-1; j >= high + 1; j--) {
	                num[j+1] = num[j];//其余元素后移
	            }
	            num[high+1] = temp;//插入元素
	        }
	        return num;
	    }	
		public static void main(String[] args) {
			int array[] = {14,23,423,4,2,3,21,3};
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			insertSortByBinary(array);
			System.out.println();
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
}
