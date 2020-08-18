package leetcode_1544;

/**
 * @author :lujianbin
 * @create :2020-08-18 11:34:00
 * @description :
 */
public class test_1544 {
	public static void main(String[] args) {
		String s = "leEeetcode";
		main_1544 main_1544 = new main_1544();
		System.out.println(main_1544.makeGood(s));

		//大小写转换例子
		char a = 'e';
		//小写字母的Ascall码值比大写字母多32
		System.out.println((char) (a - 32));      //强转为char类型，否则打印出来为Ascall码值
	}
}
