package cn.it.sort;

/**
 * 把整个序列看做一个数组，把第零个位置看做中轴，
 * 和最后一个比，如果比它小交换，比它大不做任何处理；
 * 交换了以后再和小的那端比，比它小不交换，比他大交换。
 * 这样循环往复，一趟排序完成，左边就是比中轴小的，
 * 右边就是比中轴大的，然后再用分治法，分别对这两个独立的数组进行排序。
 *
 */
public class QickSort {

	
	private static void QickSort(int[] numbers, int left, int right) {
		// TODO Auto-generated method stub
		int i = left,j = right;
		if (left < right) {
			
			int temp = numbers[left]; // 数组的第一个作为中轴
			while (i != j) {
				while (i < j && numbers[j] > temp) {
					j--;
				}
				if (i < j) {
					
					numbers[i] = numbers[j];// 比中轴小的记录移到低端
					i++;
				}
				while (i < j && numbers[j] < temp) {
					i++;
				}
				if (i < j) {
					
					numbers[j] = numbers[i];// 比中轴小的记录移到低端
					j--;
				}
				numbers[j] = numbers[i];// 比中轴小的记录移到低端		
			}
				numbers[i] = temp; // 中轴记录到尾 将temp放在最终位置
				QickSort(numbers,left,i - 1);				
				QickSort(numbers,i + 1,right);
				

		}
	}
	public static void main(String[] args) {
		int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		QickSort(data, 0, data.length - 1);
		
		//System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}


}
