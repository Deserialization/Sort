package cn.it.sort;

public class InsertSortByBinaryTest {
	private static int[] insertSortByBinaryTest(int[] num) {
		int low, high, middle;
		int temp;
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			low = 0;
			high = i - 1;
			while(low <= high){
				middle = (low + high)>>2;
				if (num[middle] > temp) {
					high = middle - 1;
				}
				else{
					low = middle + 1;
				}
			}
			for (int j = i - 1; j > high + 1; j--) {
				num[j + 1] = num[j];
			}
			num[high + 1] = temp;
		}
		return num;		
	}
	public static void main(String[] args) {
		int array[] = {14,23,423,4,2,3,21,3};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		insertSortByBinaryTest(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
