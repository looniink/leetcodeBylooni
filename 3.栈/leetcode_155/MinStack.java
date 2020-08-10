package leetcode_155;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-10 19:24:00
 * @description :��Сջ
 */
class MinStack {

	Deque<Integer> list;
	int min = Integer.MAX_VALUE;

	/**
	 * initialize your data structure here.
	 */
	public MinStack() {
		list = new LinkedList<>();
	}

	public void push(int x) {
		if (x <= min) {
			//��֮ǰ��ֵ����
			list.push(min);
			//������Сֵ
			min = x;
		}
		list.push(x);
	}

	public void pop() {
		//�������������Сֵ,��ô����һ��Ԫ�ظ���Ϊ��Сֵ
		if (list.pop() == min) {
			min = list.pop();
		}
	}

	public int top() {
		return list.getFirst();
	}

	public int getMin() {
		return min;
	}
}
