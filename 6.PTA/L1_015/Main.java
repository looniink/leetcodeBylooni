package L1_015;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-13 18:07:00
 * @description :L1-015 跟奥巴马一起画方块 (15分)
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		String s = scanner.next();

		for (int i = 0; i < (nextInt + 1) / 2; i++) {
			for (int j = 0; j < nextInt; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
