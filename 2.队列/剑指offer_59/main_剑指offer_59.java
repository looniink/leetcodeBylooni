package ��ָoffer_59;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-06 14:46:00
 * @description :�������ڵ����ֵ������˫�˶�����ʵ��
 */
public class main_��ָoffer_59 {          //��СΪk�Ļ�������
	public int[] maxSlidingWindow(int[] nums, int k) {

		if (nums == null || nums.length < 1 || k <= 0 || k > nums.length) {
			return new int[0];
		}

		int[] res = new int[nums.length - k + 1];
		//deque˫�˶���
		Deque<Integer> queue = new LinkedList<>();


		for (int i = 0; i < k; i++) {       //δ�γɴ���

			while (!queue.isEmpty() && queue.peekLast() < nums[i])   //peekLast���ҳ����һ��Ԫ��
				queue.removeLast(); //�����в�Ϊ���ҵ�ǰ���е����һ��ֵС������ֵʱ�������б�����һ��Ԫ��
			queue.addLast(nums[i]); //��ĩβ�������Ԫ��ѭ���Ƚ�
		}

		res[0] = queue.peekFirst();     //δ�γɴ��ڣ���ֻ��һ�����Ԫ��

		for (int i = k; i < nums.length; i++) {      //�γɴ��ں󣬴�k���������
			if (queue.peekFirst() == nums[i - k])
				queue.removeFirst();//���������Ƴ������ص�һ��Ԫ��

			while (!queue.isEmpty() && queue.peekLast() < nums[i])
				queue.removeLast();//�Ƴ�������Ǹ�Ԫ�أ�����Ǹ�С�������Ǹ��Ƴ�
			queue.addLast(nums[i]);//�Ƴ����num��������ļӹ��������߱�

			res[i - k + 1] = queue.peekFirst();     //�������ֵ���Ŵ���res
		}


		return res;
	}
}