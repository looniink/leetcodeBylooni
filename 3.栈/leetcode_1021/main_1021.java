package leetcode_1021;

/**
 * @author :lujianbin
 * @create :2020-08-15 10:08:00
 * @description :删除最外层的括号
 */
public class main_1021 {
	public String removeOuterParentheses(String S) {
		StringBuilder stringBuilder = new StringBuilder();
		int level = 0;
		for (char c : S.toCharArray()) {    //将字符串转化为字符数组
			if (c == ')')
				level--;
			if (level >= 1)
				stringBuilder.append(c);    //将制定的字符串追加到此序列
			if (c == '(')
				level++;
		}
		return stringBuilder.toString();    //返回次序列中数据的字符串表示形式
	}
}
