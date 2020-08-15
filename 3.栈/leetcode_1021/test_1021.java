package leetcode_1021;

/**
 * @author :lujianbin
 * @create :2020-08-15 13:17:00
 * @description :
 */
public class test_1021 {
	public static void main(String[] args) {
		String a = "(()())(())";
		String b = "()";
		main_1021 main_1021 = new main_1021();
		System.out.println(main_1021.removeOuterParentheses(a));
		System.out.println(main_1021.removeOuterParentheses(b));
	}
}
