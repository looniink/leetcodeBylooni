package leetcode_232;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-09 14:32:00
 * @description :用栈表示队列
 */
class MyQueue {

	Deque<Integer> list;

	/**
	 * Initialize your data structure here.
	 */
	public MyQueue() {
		list = new LinkedList<>();
	}

	/**
	 * Push element x to the back of queue.
	 */
	public void push(int x) {
		list.addLast(x);
	}

	/**
	 * Removes the element from in front of queue and returns that element.
	 */
	public int pop() {
		return list.removeFirst();
	}

	/**
	 * Get the front element.
	 */
	public int peek() {
		return list.getFirst();
	}

	/**
	 * Returns whether the queue is empty.
	 */
	public boolean empty() {
		return list.isEmpty();
	}
}
