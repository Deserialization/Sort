package cn.it.sort;

public class InsertSort {
	public static void insertSort(int[] array) {
/*		��ѭ���������򲻽����������������ƣ�ֱ��û�������ʱ���Ԫ�ط��ڸ�λ��
 		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			temp = array[i];
			for (; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];				
			}
			//������temp�������������һ��
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
