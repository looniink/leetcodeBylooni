package leetcode_844;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-14 10:39:00
 * @description :比较含退格的字符串
 */
public class main_844 {
	public boolean backspaceCompare(String S, String T) {
		return build(S).equals(build(T));
	}

	public String build(String s) {
		Deque<Character> stack = new LinkedList<>();
		for (char c : s.toCharArray()) {        //将字符串转化为字符数组
			if (c != '#') {
				stack.push(c);
			} else if (!stack.isEmpty()) {      //开头就是#号则是空的
				stack.pop();
			}
		}
		return String.valueOf(stack);       //返回各种类型的字符表示形式
	}

}
