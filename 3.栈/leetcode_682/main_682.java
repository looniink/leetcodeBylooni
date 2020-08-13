package leetcode_682;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-13 11:52:00
 * @description :棒球比赛
 */
public class main_682 {
	public int calPoints(String[] ops) {
		//先进行异常处理
		if (ops.length == 0) {
			return -1;
		}

		Integer a, b;
		Stack<Integer> stack = new Stack<>();

		for (String s : ops) {
			switch (s) {
				case "+":           //获取栈顶的两个元素相加
					b = stack.pop();
					a = stack.peek();
					stack.push(b);
					stack.push(a + b);
					break;
				case "D":           //踏出栈顶元素*2，再压入栈
					b = stack.peek();
					stack.push(b * 2);
					break;
				case "C":           //删除最后一个得分
					stack.pop();    //删除栈顶元素
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
