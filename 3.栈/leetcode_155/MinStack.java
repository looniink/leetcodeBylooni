package leetcode_155;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-10 19:24:00
 * @description :最小栈
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
			//将之前的值保存
			list.push(min);
			//更新最小值
			min = x;
		}
		list.push(x);
	}

	public void pop() {
		//如果弹出的是最小值,那么将下一个元素更新为最小值
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
