package leetcode_844;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-14 10:39:00
 * @description :�ȽϺ��˸���ַ���
 */
public class main_844 {
	public boolean backspaceCompare(String S, String T) {
		return build(S).equals(build(T));
	}

	public String build(String s) {
		Deque<Character> stack = new LinkedList<>();
		for (char c : s.toCharArray()) {        //���ַ���ת��Ϊ�ַ�����
			if (c != '#') {
				stack.push(c);
			} else if (!stack.isEmpty()) {      //��ͷ����#�����ǿյ�
				stack.pop();
			}
		}
		return String.valueOf(stack);       //���ظ������͵��ַ���ʾ��ʽ
	}

}
