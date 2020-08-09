package leetcode_225;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-09 10:22:00
 * @description : 用队列实现栈，使用deque双端队列的方法，既可以作栈也可以作队列
 *
 */
public class MyStack {

	Deque<Integer> list;

	/**
	 * Initialize your data structure here.
	 */
	public MyStack() {
		list = new LinkedList<>();
	}

	/**
	 * Push element x onto stack.
	 */
	public void push(int x) {
		list.addFirst(x);
	}

	/**
	 * Removes the element on top of the stack and returns that element.
	 */
	public int pop() {
		return list.removeFirst();
	}

	/**
	 * Get the top element.
	 */
	public int top() {
		return list.getFirst();
	}

	/**
	 * Returns whether the stack is empty.
	 */
	public boolean empty() {
		return list.isEmpty();
	}
}
