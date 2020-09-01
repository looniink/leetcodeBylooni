package leetcode_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author :lujianbin
 * @create :2020-08-08 12:02:00
 * @description :有效的括号，判断字符串是否有效
 * @solution :如果括号是左括号，则入栈push，否则通过hash表判断对应关系，若stack栈顶括号与当前括号不匹配，则返回flase
 */
public class main_20 {
	//注意题目要求必须按照顺序匹配 "（]）[" 是错误的,必须满足先进后出规则
	public boolean isValid(String s) {
		//输入为空或者括号数量为奇数时，直接不能匹配返回false
		if (s == null || s.length() % 2 != 0) {
			return false;
		}

		//建立判断时使用的hash表
		Map<Character, Character> map = new HashMap<Character, Character>() {
			{
				put('}', '{');
				put(')', '(');
				put(']', '[');
			}
		};

		//用栈保存左括号
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);       //charAt:返回指定索引处的字符
			if (!map.containsKey(c)) {   //判断k值是否存在，如果是左括号则放入栈中
				stack.add(c);
			} else {        //右括号
				//如果输入的都是右括号就直接返回flase
				if (stack.isEmpty()) {
					return false;
				}
				//取出栈顶元素   栈里面全是左括号
				Character tmp = stack.pop();        //判断出栈元素，与map中对应的值是否相同，相同继续循环，不相同直接返回flase
				if (map.get(c) != tmp) {            //get：获取指定key值对应的value
					// 所以这里只能传右括号为key，获取左括号的value  再判断与出栈的左括号是否相同
					return false;
				}
			}
		}
		return stack.empty(); //如果匹配成功则最后的栈是空的
	}
}











