package cn.it.sort;

public class InsetSortTest {
	public static void insertSortTest(int []array) {
		int i,j;
		int temp;
		for (i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				temp = array[i];				
				for (j = i - 1; j >= 0 && array[j] > temp; j--) {
					array[j + 1] = array[j];
				}
			array[j + 1] = temp;
			}						
		}
		
	}
	public static void main(String[] args) {
		int array[] = {14,23,423,4,2,3,21,3};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		insertSortTest(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
