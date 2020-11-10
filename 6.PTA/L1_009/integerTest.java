package L1_009;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-09 22:06:00
 * @description :
 * @solution :
 */
public class integerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(Integer.parseInt(s));
		BigDecimal a = new BigDecimal(9);
		BigDecimal b = new BigDecimal(900000000);
		System.out.println(a.divide(b));

		//分数不会四舍五入，只会是整数或者是0
		System.out.println(7 / 3);
	}
}
