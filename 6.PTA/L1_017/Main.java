package L1_017;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-15 16:15:00
 * @description :L1-017 到底有多二 (15分)
 * @solution :
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean f = false;
		boolean o = false;
		double c = 0.0;
		double res;
		//判断负号
		if (a.charAt(0) == '-')
			f = true;

		//判断是否为偶数
		if ((a.charAt(a.length() - 1) - '0') % 2 == 0) {
			o = true;
		}

		//判断2的个数
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '2')
				c++;
		}

		if (f)
			//负数的情况，少除一个
			res = c / (a.length() - 1) * 1.5;
		else
			//正数除本身长度就行
			res = c / (a.length());
		//如果为偶数则再扩大1倍
		if (o)
			res *= 2;

		res *= 100;
		System.out.printf("%.2f", res);
		System.out.println("%");
	}
}
