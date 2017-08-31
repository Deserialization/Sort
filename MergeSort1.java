package cn.it.sort;
/**
* �鲢����
* ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������
* ʱ�临�Ӷ�ΪO(nlogn)
* �ȶ�����ʽ
* @param nums ����������
* @return �����������
*/


/**
* ��������low��highλ�õ�����������
* @param nums ����������
* @param low ���ŵĿ�ʼλ��
* @param mid �����м�λ��
* @param high ���Ž���λ��
*/
public class MergeSort1 {
	public static int[] sort(int[] nums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// ���
			sort(nums, low, mid);

			// �ұ�
			sort(nums, mid + 1, high);
			// ���ҹ鲢
			System.out.println("111");
			merge(nums, low, mid, high);
			System.out.println("222");
		}
		return nums;
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;

		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = nums[j++];
		}

		// ���������е�������nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
	}

	public static void main(String[] args) {
		//int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
		int[] data = new int[] { 26, 53, 67, 48};
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		sort(data, 0, data.length - 1);

		// System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}

