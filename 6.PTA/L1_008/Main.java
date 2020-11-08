package L1_008;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-08 16:20:00
 * @description :
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int next = scanner.nextInt();
		int sum = 0;
		int mid = 0;

		for (int i = first; i <= next; i++) {
			mid++;
			sum += i;
			//控制输出宽度，类似C语言
			System.out.printf("%5d", i);
			if (mid % 5 == 0) {
				System.out.println();
			}
		}
		//如果上面已经换过行了则这里不用换
		if (mid % 5 != 0) {
			System.out.println();
		}
		System.out.println("Sum = " + sum);
	}
}
