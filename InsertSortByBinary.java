package cn.it.sort;

public class InsertSortByBinary {
	 private static int[] insertSortByBinary(int[] num){
	        int temp;
	        //�۰���ұر�������Ҫ��
	        int low,high,middle;
	        for (int i = 1; i < num.length; i++) {
	            // ������������ֻ��Ҫ�ҳ������λ�þͺ���
	            //���λ��Ӧ������|high- low|����1��Ȼ���ֵ���뵽����֮��
	            temp = num[i];//�������¼
	            //�����0Ϊ��ʼλ�ã�Ҳ�������������λ��
	            low = 0;
	            //����������Ľ���λ��
	            high = i - 1;
	            while (low <= high) {
	                middle = (low+high) / 2;
	                if (num[middle] > temp) {

	                    //�м��Ԫ�ش��ڴ�����ֵ
	                    high = middle - 1;

	                }
	                else {
	                    //�м��Ԫ��С�ڻ���ڴ�����ֵ
	                    low = middle + 1;
	                }
	            }
	            for (int j = i-1; j >= high + 1; j--) {
	                num[j+1] = num[j];//����Ԫ�غ���
	            }
	            num[high+1] = temp;//����Ԫ��
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
