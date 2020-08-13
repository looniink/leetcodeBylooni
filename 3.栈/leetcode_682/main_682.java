package leetcode_682;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-13 11:52:00
 * @description :�������
 */
public class main_682 {
	public int calPoints(String[] ops) {
		//�Ƚ����쳣����
		if (ops.length == 0) {
			return -1;
		}

		Integer a, b;
		Stack<Integer> stack = new Stack<>();

		for (String s : ops) {
			switch (s) {
				case "+":           //��ȡջ��������Ԫ�����
					b = stack.pop();
					a = stack.peek();
					stack.push(b);
					stack.push(a + b);
					break;
				case "D":           //̤��ջ��Ԫ��*2����ѹ��ջ
					b = stack.peek();
					stack.push(b * 2);
					break;
				case "C":           //ɾ�����һ���÷�
					stack.pop();    //ɾ��ջ��Ԫ��
					break;
				default:
					stack.push(Integer.valueOf(s));
					break;
			}
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}
}
