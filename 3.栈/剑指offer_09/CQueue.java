package ��ָoffer_09;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-12 11:01:00
 * @description :������ջʵ�ֶ���
 */
class CQueue {
	Deque<Integer> stack;

	public CQueue() {
		stack = new LinkedList<>();
	}

	public void appendTail(int value) {
		stack.addLast(value);
	}

	public int deleteHead() {
		if (!stack.isEmpty()) {
			return stack.removeFirst();
		} else
			return -1;
	}
}
