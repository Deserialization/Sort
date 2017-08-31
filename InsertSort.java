package cn.it.sort;

public class InsertSort {
	public static void insertSort(int[] array) {
/*		内循环发现逆序不交换，采用整体右移，直到没有逆序的时候把元素放在该位置
 		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			temp = array[i];
			for (; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];				
			}
			//将大于temp的数整体向后移一个
			array[j + 1] = temp;
		}*/
		
		
		for(int i = 1;i < array.length;i++){
            for(int j = i;j > 0&& array[j] < array[j - 1];j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
	}
	public static void main(String[] args) {
		int array[] = {14,23,423,4,2,3,21,3};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		insertSort(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
