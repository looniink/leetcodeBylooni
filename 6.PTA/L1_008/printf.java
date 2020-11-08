package L1_008;

/**
 * @author :lujianbin
 * @create :2020-11-08 17:17:00
 * @description :
 * @solution :
 */
public class printf {
	public static void main(String[] args) {
		String[] s = {"wei", "shi", "qian", "lu", "jian", "bin"};
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%6s", s[i]);
		}

		System.out.println();
		//保留小数点后两位
		double num = 12.156789;
		System.out.println(String.format("%.2f", num));
	}
}
