package leetcode_20;


/**
 * @author :lujianbin
 * @create :2020-08-08 13:15:00
 * @description :
 */
public class test_20 {
	public static void main(String[] args) {
		String s1 = "({})";
		String s2 = "}}}}}}";
		String s3 = "({)}";     //不满足先进后出规则

		main_20 main_20 = new main_20();
		System.out.println(main_20.isValid(s1));
		System.out.println(main_20.isValid(s2));
		System.out.println(main_20.isValid(s3));
	}
}
