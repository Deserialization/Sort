package cn.it.sort;

public class SelectSort {
	public static void selectSort(int []numbers) {
		int i,j,k;
		int length = numbers.length;
		int temp = 0;
		for (i = 0; i < length; i++) {
			k = i;
			//他是从无序队列中调出一个最小的元素
			for (j = i + 1; j < length; j++) {
				if (numbers[k] > numbers[j]) {
					k = j;
				}
			//下面3句就是完成与最小元素与无序序列第一个元素的交换
				temp = numbers[i];
				numbers[i] = numbers[k];
				numbers[k] = temp;
			}
		
		}
		
		 /**
		 * 选择排序算法
		 * 在未排序序列中找到最小元素，存放到排序序列的起始位置  
		 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。 
		 * 以此类推，直到所有元素均排序完毕。 
		 * @param numbers
		 */
/*		int size = numbers.length; //数组长度
		int temp = 0 ; //中间变量

		for (int i = 0; i < size; i++) {
			int k = i; // 待确定的位置
			// 选择出应该在第i个位置的数
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			// 交换两个数
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}*/

	}
	public static void main(String[] args) {
		int numbers[] = {1,23,1,2,3,4};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		selectSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
