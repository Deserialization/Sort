package cn.it.sort;

public class BinarySearch {
	//����k�������Ҫ���ҵ���
	public static int  binarySearch(int [] array, int low, int high, int k) {
		int mid;
		while(low <= high){
			
			mid = (low + high)>>2;//ȡ��ǰ����м�λ��
			//�ҵ��󷵻�Ԫ�ص�λ�� ����k˵����ǰ�벿�֣�С��k������ ��벿��
		    if (array[mid] == k) {
				return mid;
			}else if (array[mid] > k){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return 0;
	}

}
