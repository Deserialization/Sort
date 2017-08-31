package cn.it.sort;

import javax.print.attribute.standard.MediaName;

public class QickSortTest {
	public static void qicksort(int []numbers,int left,int right) {
		int temp;
		int i = left,j =right;
		if (i < j) {
			temp = numbers[left];
			while(i != j){
				while(i < j && temp < numbers[j]){
					j--;
				}
				if (i < j) {
					numbers[i] = numbers[j];
					i++;
				}
				while(i < j && temp > numbers[i]){
					i++;
				}
				if (i < j) {
					numbers[j] = numbers[i];
					j--;
				}
			}
			numbers[i] = temp;
			qicksort(numbers, left, i - 1);
			qicksort(numbers, i + 1,right);
		}
	}
	public static void main(String[] args) {
		int [] numbers ={2,33,4,1,2,3,4};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		qicksort(numbers, 0, numbers.length - 1);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
