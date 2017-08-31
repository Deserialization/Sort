package cn.it.sort;

/**
 * ���������п���һ�����飬�ѵ����λ�ÿ������ᣬ
 * �����һ���ȣ��������С���������������κδ���
 * �������Ժ��ٺ�С���Ƕ˱ȣ�����С�������������󽻻���
 * ����ѭ��������һ��������ɣ���߾��Ǳ�����С�ģ�
 * �ұ߾��Ǳ������ģ�Ȼ�����÷��η����ֱ�������������������������
 *
 */
public class QickSort {

	
	private static void QickSort(int[] numbers, int left, int right) {
		// TODO Auto-generated method stub
		int i = left,j = right;
		if (left < right) {
			
			int temp = numbers[left]; // ����ĵ�һ����Ϊ����
			while (i != j) {
				while (i < j && numbers[j] > temp) {
					j--;
				}
				if (i < j) {
					
					numbers[i] = numbers[j];// ������С�ļ�¼�Ƶ��Ͷ�
					i++;
				}
				while (i < j && numbers[j] < temp) {
					i++;
				}
				if (i < j) {
					
					numbers[j] = numbers[i];// ������С�ļ�¼�Ƶ��Ͷ�
					j--;
				}
				numbers[j] = numbers[i];// ������С�ļ�¼�Ƶ��Ͷ�		
			}
				numbers[i] = temp; // �����¼��β ��temp��������λ��
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
