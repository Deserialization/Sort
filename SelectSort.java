package cn.it.sort;

public class SelectSort {
	public static void selectSort(int []numbers) {
		int i,j,k;
		int length = numbers.length;
		int temp = 0;
		for (i = 0; i < length; i++) {
			k = i;
			//���Ǵ���������е���һ����С��Ԫ��
			for (j = i + 1; j < length; j++) {
				if (numbers[k] > numbers[j]) {
					k = j;
				}
			//����3������������СԪ�����������е�һ��Ԫ�صĽ���
				temp = numbers[i];
				numbers[i] = numbers[k];
				numbers[k] = temp;
			}
		
		}
		
		 /**
		 * ѡ�������㷨
		 * ��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ��  
		 * �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ���������ĩβ�� 
		 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ� 
		 * @param numbers
		 */
/*		int size = numbers.length; //���鳤��
		int temp = 0 ; //�м����

		for (int i = 0; i < size; i++) {
			int k = i; // ��ȷ����λ��
			// ѡ���Ӧ���ڵ�i��λ�õ���
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			// ����������
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
