package leetcode_155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-10 19:24:00
 * @description :��Сջ
 */
class MinStack {
	private Deque<Integer> stack;
	private int min;

	/**
	 * initialize your data structure here.
	 */
	public MinStack() {
		stack = new LinkedList<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		if (x <= min) {//ע�⣺����Ҫʹ��<=��
			stack.push(min);//��ÿһ��min��ջ֮ǰ����ǰһ��min��ջ
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		//�������������Сֵ,��ô���ٽ���һ��Ԫ�ص���  ������Ϊ��ǰ����Сֵ
		if (stack.pop() == min) {
			min = stack.pop();
		}
	}

	public int top() {
		return stack.getFirst();
	}

	public int min() {
		return min;
	}
}
