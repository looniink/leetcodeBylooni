package leetcode_155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-10 19:24:00
 * @description :最小栈
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
		if (x <= min) {//注意：这里要使用<=号
			stack.push(min);//在每一个min入栈之前将它前一个min入栈
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		//如果弹出的是最小值,那么就再将下一个元素弹出  更新它为当前的最小值
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
