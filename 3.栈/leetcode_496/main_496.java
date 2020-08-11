package leetcode_496;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-11 12:32:00
 * @description :��һ������Ԫ��
 */
public class main_496 {
	//һ����ͨ�ⷨ
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] res = new int[nums1.length];
		//����nums1
		for (int i = 0; i < nums1.length; i++) {
			//Ѱ��num1�е�������nums2�е�λ��
			int j = 0;        //�洢λ��
			for (; j < nums2.length; j++) {
				if (nums2[j] == nums1[i]) {
					break;
				}
			}
			//�ҵ�λ�ú������Ѱ�ұ�������
			while (j < nums2.length) {
				if (nums2[j] > nums1[i]) {
					res[i] = nums2[j];      //����ҵ�������Ĵ��ڽ����
					break;                  //�˳�������һ�����ıȽ�
				} else {
					j++;                    //һ��һ������Ѱ��
				}
			}
			//���û���ҵ����λ�õ���-1
			if (j == nums2.length)
				res[i] = -1;
		}
		return res;         //��󷵻�����
	}

	//hashmapӳ��͵���ջ�����
	//���ǿ��Ժ������� nums1���ȶԽ� nums2 �е�ÿһ��Ԫ�أ��������һ�������Ԫ�ء�
	// �����ڽ���Щ�𰸷����ϣӳ�䣨HashMap���У��ٱ������� nums1����ֱ���ҳ���
	public int[] nextGreaterElement2(int[] findNums, int[] nums) {
		Deque<Integer> deque = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[findNums.length];

		for (int i = 0; i < nums.length; i++) {
			while (!deque.isEmpty() && nums[i] > deque.peek())
				map.put(deque.pop(), nums[i]);      //��������Ǹ����򽫶�Ӧ������ֵ����hash����
			deque.push(nums[i]);
		}
		while (!deque.isEmpty()) {
			map.put(deque.pop(), -1);       //���һ����Ӧ-1
		}

		for (int i = 0; i < findNums.length; i++) {
			res[i] = map.get(findNums[i]);      //��hash����ȡ����Ӧ��ֵ
		}
		return res;
	}


}
