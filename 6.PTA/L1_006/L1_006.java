package L1_006;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-07 21:05:00
 * @description :连续因子
 * @solution :
 */
public class L1_006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//输入数字
		long n = scanner.nextInt();

		long sum = 0;
		long len = 0;                //记录连续因子的个数
		long start = 0;

		for (int i = 2; i < Math.sqrt(n); i++) {
			sum = 1;
			for (int j = i; sum * i <= n; j++) {    //暴力模拟
				sum *= j;
				if (n % sum == 0 && j - i + 1 > len) {
					start = i;
					len = j - i + 1;
				}
			}
		}

		//素数的处理
		if (start == 0) {
			start = n;
			len = 1;
		}

		//打印连续因子的个数
		System.out.println(len);
		for (int i = 0; i < len - 1; i++) {
			System.out.print(start + i + "*");
		}
		System.out.println(start + len - 1);
	}
}
