package leetcode_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-08 12:02:00
 * @description :��Ч�����ţ��ж��ַ����Ƿ���Ч
 * @solution :��������������ţ�����ջpush������ͨ��hash���ж϶�Ӧ��ϵ����stackջ�������뵱ǰ���Ų�ƥ�䣬�򷵻�flase
 */
public class main_20 {
	//ע����ĿҪ����밴��˳��ƥ�� "��]��[" �Ǵ����,���������Ƚ��������
	public boolean isValid(String s) {
		//����Ϊ�ջ�����������Ϊ����ʱ��ֱ�Ӳ���ƥ�䷵��false
		if (s == null || s.length() % 2 != 0) {
			return false;
		}

		//�����ж�ʱʹ�õ�hash��
		Map<Character, Character> map = new HashMap<Character, Character>() {
			{
				put('}', '{');
				put(')', '(');
				put(']', '[');
			}
		};

		//��ջ����������
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);       //charAt:����ָ�����������ַ�
			if (!map.containsKey(c)) {   //�ж�kֵ�Ƿ���ڣ�����������������ջ��
				stack.add(c);
			} else {        //������
				//�����һ�����������Ż��߶�������  9ֱ�ӷ���flase
				if (stack.size() == 0) {
					return false;
				}
				//ȡ��ջ��Ԫ��   ջ����ȫ��������
				Character tmp = stack.pop();        //�жϳ�ջԪ�أ���map�ж�Ӧ��ֵ�Ƿ���ͬ����ͬ����ѭ��������ֱͬ�ӷ���flase
				if (map.get(c) != tmp) {            //get����ȡָ��keyֵ��Ӧ��value
					// ��������ֻ�ܴ�������Ϊkey����ȡ�����ŵ�value  ���ж����ջ���������Ƿ���ͬ
					return false;
				}
			}
		}
		return stack.empty(); //���ƥ��ɹ�������ջ�ǿյ�
	}
}











